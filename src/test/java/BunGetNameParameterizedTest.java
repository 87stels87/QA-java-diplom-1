import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class BunGetNameParameterizedTest {

    private final String name;
    private final String expectedName;

    public BunGetNameParameterizedTest(String name, String expectedName) {
        this.name = name;
        this.expectedName = expectedName;
    }

    @Parameterized.Parameters(name = "Название булки возвращается таким же как указано.\n Введено: {0}    Возвращенно: {1}")
    public static Object[][] getTestData() {
        return new Object[][]{
                {"черная булка", "черная булка"},
                {"", ""},
                {" белая булка", " белая булка"},
                {"большая булка ", "большая булка "},
        };
    }

    @Test
    public void testBunGetNameParameterized() {
        Bun bun = new Bun(name, 10.f);
        String actualName = bun.getName();
        assertEquals("Возвращается ровно то же название булки, которое введено", expectedName, actualName);
    }

}