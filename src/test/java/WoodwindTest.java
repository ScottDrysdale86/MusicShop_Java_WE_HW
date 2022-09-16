import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WoodwindTest {

    Woodwind flute;

    @Before
    public void setUp(){
        flute = new Woodwind("Golden Basic", "Gold", 40, 100, 8);
        
    }
    
    @Test
    public void hasProperties(){
        assertEquals("Golden Basic", flute.getName());
        assertEquals("Gold", flute.getColor());
        assertEquals("Woodwind", flute.getInstType());
        assertEquals(40, flute.getCostPrice(),0.0);
        assertEquals(100, flute.getSalePrice(),0.0);
        assertEquals(8, flute.getKeyNumber());
    }
}
