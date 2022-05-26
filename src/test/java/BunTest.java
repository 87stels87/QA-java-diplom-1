import org.junit.Test;
import praktikum.Bun;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BunTest {
    @Test
    public void testGetNameCreatedBun() {
        Bun bun = new Bun("тестовая", 6.2f);
        String actual = bun.getName();
        String expected = "тестовая";
        assertEquals("Проверка получения названия булки", expected, actual);
    }
    @Test
    public void testGetPriceCreatedBun() {
        Bun bun = new Bun("тестовая", 6.2f);
        Float actual = bun.getPrice();
        Float expected = 6.2f;
        assertEquals("Проверка получения цены булки", expected, actual);
    }
}
