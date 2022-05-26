import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class BunGetPriceParameterizedTest {

    private final float price;
    private final float expected;

    public BunGetPriceParameterizedTest(float price, float expectedPrice) {
        this.price = price;
        this.expected = expectedPrice;
    }

    @Parameterized.Parameters(name = "Введенная цена = возвращенной цене.\n Введено: {0}    Возвращенно: {1}")
    public static Object[][] getTestData() {
        return new Object[][]{
                {11.05f, 11.05f},
                {10f, 10f},
                {0.4f, 0.4f},
        };
    }

    @Test
    public void testBunGetPriceParameterized() {
        Bun bun = new Bun("черная булка", price);
        float actual = bun.getPrice();
        assertEquals("Возвращается ровно то же цена булки, которая введена", expected, actual, 0);


    }
}
