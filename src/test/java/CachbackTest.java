import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CachbackTest {

    @Test
    public void checkCash() {
        Cashback cashback = new Cashback();
        int amount = 700;
        int expected = 300;
        int actual = cashback.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void checkCash2() {
        Cashback cashback = new Cashback();
        int amount = 1100;
        int expected = 900;
        int actual = cashback.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void checkCash3() {
        Cashback cashBack = new Cashback();
        int amount = 1000;
        int expected = 0;
        int actual = cashBack.remain(amount);

        assertEquals(actual, expected);
    }
}
