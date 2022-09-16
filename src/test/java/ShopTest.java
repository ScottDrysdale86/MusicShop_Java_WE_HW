import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Item guitarStrings;

    @Before
    public void setUp(){
        shop = new Shop();
        guitar = new Guitar("Fire Guitar", "Red", 400, 650, 6, GuitarType.ELECTRICGUITAR);
        guitarStrings = new Item("Guitar Strings", 3, 5);


    }
    
    @Test
    public void hasEmptyList(){
       assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canAddToStock(){
        shop.add(guitar);
        shop.add(guitarStrings);
        assertEquals(2, shop.getStockCount());

    }

    @Test
    public void canRemoveFromStock(){
        shop.add(guitar);
        shop.add(guitarStrings);
        shop.remove(guitar);
        assertEquals(1, shop.getStockCount());

    }

    @Test
    public void canGetTotalProfit(){
        shop.add(guitar);
        shop.add(guitarStrings);
        assertEquals(252, shop.calculateTotalProfit(), 0.0);

    }


}
