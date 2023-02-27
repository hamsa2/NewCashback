
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackTest {

    @Test
    public void testRemain() {
        Cashback service = new Cashback();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }


    @Test
    public void testRemainWithCashback() {
        Cashback service = new Cashback();
        int amount = 900;
        int expected = 200;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }


}