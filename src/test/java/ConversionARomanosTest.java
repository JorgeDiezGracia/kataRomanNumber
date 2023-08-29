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






    }

