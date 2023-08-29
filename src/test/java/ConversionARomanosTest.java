import com.svalero.ConversionARomanos;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ConversionARomanosTest {
    ConversionARomanos conversionARomanos;
    String numero;

    @Before
    public void init() {
        conversionARomanos = new ConversionARomanos();
        numero = "";
    }

    @Test
    public void testConverter() {
        numero = conversionARomanos.conversionNumero(1);
        Assert.assertEquals("I", numero);
    }

    @Test
    public void testConverter2(){
        numero = conversionARomanos.conversionNumero(2);
        Assert.assertEquals("II", numero);
    }

    @Test
    public void testConverter3(){
        numero = conversionARomanos.conversionNumero(3);
        Assert.assertEquals("III", numero);
    }
    @Test
    public void testConverter4(){
        numero = conversionARomanos.conversionNumero(4);
        Assert.assertEquals("IV", numero);
    }

    @Test
    public void testConverter5(){
        numero = conversionARomanos.conversionNumero(5);
        Assert.assertEquals("V", numero);
    }
    @Test
    public void testConverter6(){
        numero = conversionARomanos.conversionNumero(6);
        Assert.assertEquals("VI", "VI");
    }
    @Test
    public void testConverter7(){
        numero = conversionARomanos.conversionNumero(7);
        Assert.assertEquals("VII",numero);
    }
    @Test
    public void testConverter8(){
        numero = conversionARomanos.conversionNumero(8);
        Assert.assertEquals("VIII", numero);
    }
    @Test
    public void testConverter9(){
        numero = conversionARomanos.conversionNumero(9);
        Assert.assertEquals("IX", numero);
    }
    @Test
    public void testConverter10(){
        numero = conversionARomanos.conversionNumero(10);
        Assert.assertEquals("X",numero);
    }
    @Test
    public void testConverter14(){
        numero = conversionARomanos.conversionNumero(14);
        Assert.assertEquals("XIV", numero);
    }
    @Test
    public void testConverter16(){
        numero = conversionARomanos.conversionNumero(16);
        Assert.assertEquals("XVI",numero);
    }
    @Test
    public void testConverter24(){
        numero = conversionARomanos.conversionNumero(24);
        Assert.assertEquals("XXIV", numero);
    }
    @Test
    public void testConverter36(){
        numero = conversionARomanos.conversionNumero(36);
        Assert.assertEquals("XXXVI", numero);
    }
    @Test
    public void testConverter49(){
        numero = conversionARomanos.conversionNumero(49);
        Assert.assertEquals("XLIX", numero);
    }
    @Test
    public void testConverter50(){
        numero = conversionARomanos.conversionNumero(50);
        Assert.assertEquals("L", numero);
    }
    @Test
    public void testConverter77(){
        numero = conversionARomanos.conversionNumero(77);
        Assert.assertEquals("LXXVII", numero);
    }








    }

