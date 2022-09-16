import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KeyedTest {

    Keyed piano;

    @Before
    public void setUp(){
        piano = new Keyed("Grand Piano", "Black", 400, 650, KeyedType.PIANO);

    }

    @Test
    public void hasProperties(){
        assertEquals("Grand Piano", piano.getName());
        assertEquals("Black", piano.getColor());
        assertEquals("Instrments.Keyed", piano.getInstType());
        assertEquals(400, piano.getCostPrice(),0.0);
        assertEquals(650, piano.getSalePrice(),0.0);
        assertEquals("Piano", piano.getKeyType());
    }
}
