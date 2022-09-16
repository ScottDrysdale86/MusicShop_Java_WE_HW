import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarTest {

    Guitar electricGuitar;

    @Before
    public void setUp(){
        electricGuitar = new Guitar("Fire Instrments.Guitar", "Red", 400, 650, 6, GuitarType.ELECTRICGUITAR);
        
    }
    
    @Test
    public void hasProperties(){
        assertEquals("Fire Instrments.Guitar", electricGuitar.getName());
        assertEquals("Red", electricGuitar.getColor());
        assertEquals("String", electricGuitar.getInstType());
        assertEquals(400, electricGuitar.getCostPrice(),0.0);
        assertEquals(650, electricGuitar.getSalePrice(),0.0);
        assertEquals(6, electricGuitar.getStringNumber());
        assertEquals("Electric", electricGuitar.getGuitarType());
    }
}
