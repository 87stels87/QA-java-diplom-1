import org.junit.Assert;
import org.junit.Test;

import praktikum.Bun;
import praktikum.Database;
import praktikum.Ingredient;
import praktikum.IngredientType;

import java.util.ArrayList;
import java.util.List;

public class DatabaseTest {
    @Test
    public void testDatabaseGetNameBun11() {
        List<Bun> buns = new ArrayList<>();
        List<Ingredient> ingredients = new ArrayList<>();
        buns.add(new Bun("black bun", 100));
        buns.add(new Bun("white bun", 200));
        buns.add(new Bun("red bun", 300));

        ingredients.add(new Ingredient(IngredientType.SAUCE, "hot sauce", 100));
        ingredients.add(new Ingredient(IngredientType.SAUCE, "sour cream", 200));
        ingredients.add(new Ingredient(IngredientType.SAUCE, "chili sauce", 300));

        ingredients.add(new Ingredient(IngredientType.FILLING, "cutlet", 100));
        ingredients.add(new Ingredient(IngredientType.FILLING, "dinosaur", 200));
        ingredients.add(new Ingredient(IngredientType.FILLING, "sausage", 300));

        Database database = new Database();
        String expected = database.availableBuns().get(1).name;
        Assert.assertEquals("Получаем корректное наименование Ingredient", expected, "white bun");

    }

}
