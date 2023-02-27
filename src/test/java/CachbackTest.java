import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CachbackTest {

    @org.junit.Test
    public void testRemain() {
        Cashback service = new Cashback();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainWithCashback() {
        Cashback service = new Cashback();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

   }
