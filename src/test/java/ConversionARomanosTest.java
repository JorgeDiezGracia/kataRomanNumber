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



    }

