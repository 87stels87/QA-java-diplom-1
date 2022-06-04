import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {


    @Mock
    Bun bun;

    @Mock
    Ingredient ingredient;

    Burger burger;

    @Before
    public void init() {

        burger = new Burger();

    }

    @Test
    public void testSetBuns() {
        burger.setBuns(bun);
        Assert.assertEquals("Получение bun", burger.bun, bun);

    }

    @Test
    public void testAddIngredient() {
        burger.addIngredient(ingredient);
        Assert.assertTrue(burger.ingredients.contains(ingredient));
    }

    @Test
    public void testRemoveIngredient() {
        burger.addIngredient(ingredient);
        burger.removeIngredient(0);
        Assert.assertFalse(burger.ingredients.contains(ingredient));
    }

    @Test
    public void testMoveIngredient() {
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient);
        burger.moveIngredient(0, 1);
        Assert.assertEquals(ingredient, burger.ingredients.get(1));
    }

    @Test
    public void testGetPrice() {
        Mockito.when(bun.getPrice()).thenReturn(50.0F);
        Mockito.when(ingredient.getPrice()).thenReturn(25.0F);
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        float actualPrice = burger.getPrice();
        float expectedPrice = 125.0F;
        Assert.assertEquals("Получение цены", expectedPrice, actualPrice, 0);
    }

    @Test
    public void testGetReceipt() {
        Burger burger = new Burger();
        burger.bun = bun;
        burger.ingredients.add(ingredient);
        Mockito.when(bun.getName()).thenReturn("bun_Name");
        Mockito.when(ingredient.getType()).thenReturn(IngredientType.SAUCE);
        Mockito.when(ingredient.getName()).thenReturn("Ingredient_name");
        Mockito.when(burger.getPrice()).thenReturn(1f);
        String expected = String.format("(==== %s ====)%n" +
                        "= %s %s =%n" +
                        "(==== %s ====)%n" +
                        "%nPrice: %f%n",
                bun.getName(), ingredient.getType().toString().toLowerCase(),
                ingredient.getName(), bun.getName(), burger.getPrice());
        String actual = burger.getReceipt();
        assertEquals(expected, actual);
    }


}
