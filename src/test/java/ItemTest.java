import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    Item guitarStrings;
    @Before
    public void setUp(){

        guitarStrings = new Item("Guitar Strings", 3, 5);
    }

    @Test
    public void hasProperties(){
        assertEquals("Guitar Strings", guitarStrings.getName());
        assertEquals(3, guitarStrings.getCostPrice(),0.0);
        assertEquals(5, guitarStrings.getSalePrice(),0.0);

    }

    @Test
    public void canCalcProfit(){
        assertEquals(2, guitarStrings.calcProfit(),00.0);
    }


}
