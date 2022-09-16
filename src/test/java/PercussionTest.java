import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PercussionTest {

    Percussion drums;

    @Before
    public void setUp(){
        drums = new Percussion("Drum Master Pro", "Red", 800, 1000, 6);
        
    }
    
    @Test
    public void hasProperties(){
        assertEquals("Drum Master Pro", drums.getName());
        assertEquals("Red", drums.getColor());
        assertEquals("Percussion", drums.getInstType());
        assertEquals(800, drums.getCostPrice(),0.0);
        assertEquals(1000, drums.getSalePrice(),0.0);
        assertEquals(6, drums.getDrumsInKit());
    }

    @Test
    public void canPlay(){
        assertEquals("Bang Bang noise", drums.play());
    }
}
