import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;


public class IngredientTypeTest {
    @Test
    public void testEqualsIngredientTypeSAUCE() {
        assertEquals("SAUCE", SAUCE.name());
    }

    @Test
    public void testEqualsIngredientTypeFILLING() {
        assertEquals("FILLING", FILLING.name());
    }
}
