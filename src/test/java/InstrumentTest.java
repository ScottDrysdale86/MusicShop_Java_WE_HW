import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class InstrumentTest {

    Instrument instrument;
    @Before
    public void setUp(){
        instrument = new Instrument("Fire Instrments.Guitar", "Red",50, 150);
    }

    @Test
    public void hasSetUpAttributes() {
        assertEquals("Fire Instrments.Guitar", instrument.getName());
        assertEquals("Red", instrument.getColor());
        assertEquals(50, instrument.getCostPrice(),0.0);
        assertEquals(150, instrument.getSalePrice(),0.0);
    }

    @Test
    public void canChangeSalePrice(){
        instrument.setSalePrice(100);
        assertEquals(100, instrument.getSalePrice(), 0.0);
    }

    @Test
    public void canPlay(){
        assertEquals("I can play a noise", instrument.play());
    }

    @Test
    public void canCalcProfit(){
        assertEquals(100, instrument.calcProfit(), 0.0);
    }
}
