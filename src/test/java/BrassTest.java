import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BrassTest {

    Brass trumpet;

    @Before
    public void setUp(){
        trumpet = new Brass("Great Trumpet", "Gold", 100, 160,4);
        
    }
    
    @Test
    public void hasProperties(){
        assertEquals("Great Trumpet", trumpet.getName());
        assertEquals("Gold", trumpet.getColor());
        assertEquals("Brass", trumpet.getInstType());
        assertEquals(100, trumpet.getCostPrice(),0.0);
        assertEquals(160, trumpet.getSalePrice(),0.0);
        assertEquals(4, trumpet.getValveNumber());
    }

    @Test
    public void canPlay(){
        assertEquals("Brass Instrument noise", trumpet.play());
    }
}
