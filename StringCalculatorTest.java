import org.junit.Assert;
import org.junit.Test;


public class StringCalculatorTest {
    @Test
    public final void emptystringadded(){
        Assert.assertEquals(0,StringCalculator.add(""));

    }

    @Test
    public final void onenumberadded(){
        Assert.assertEquals(2, StringCalculator.add("2"));
    }

    @Test 
    public final void twonumbersadded(){
        Assert.assertEquals(2+4, StringCalculator.add("2,3"));
    }

    @Test
    public final void negativenumberadded(){
        Assert.assertEquals("Negatives not allowed -5", StringCalculator.add("-5,2,3"));
    }

    @Test
    public final void bignumberadded(){
        Assert.assertEquals(2+3, StringCalculator.add("2,1001,3"));
    }

    @Test
    public final void alphabetsadded(){
        Assert.assertEquals(1+2+3, StringCalculator.add("a,b,c"));
    }

    @Test
    public final void amountofnumbers(){
        Assert.assertEquals(1+2+1+6+4+5+6, StringCalculator.add("a,2,1,f,4,5,6"));
    }

    
}
