import org.junit.Test;

import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.SAUCE;

public class IngredientTest {
    @Test
    public void testGetTypeIngredient() {
        Ingredient ingredient = new Ingredient(SAUCE, "тестовый", 2.8f);
        IngredientType expected = SAUCE;
        IngredientType actual = ingredient.getType();
        assertEquals("Проверка типа ингредиента", expected, actual);
    }

    @Test
    public void testGetNameIngredient() {
        Ingredient ingredient = new Ingredient(SAUCE, "тестовый", 2.8f);
        String expected = "тестовый";
        String actual = ingredient.getName();
        assertEquals("Проверка названия ингредиента", expected, actual);
    }

    @Test
    public void testGetPriceIngredient() {
        Ingredient ingredient = new Ingredient(SAUCE, "тестовый", 2.8f);
        float expected = 2.8f;
        float actual = ingredient.getPrice();
        assertEquals("Проверка цены ингредиента", expected, actual, 0);
    }


}
