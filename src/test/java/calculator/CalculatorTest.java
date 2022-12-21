import org.example.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {

    private Calculator calculator;
    private final int x = 2;
    private final int y = 6;

    @BeforeClass
    public void createCalculator(){
        calculator = new Calculator(x,y);
    }

    @Test
    public void sumTestPostivie(){

        Assert.assertEquals(calculator.calculateSum(),2+6);
    }
    @Test
    public void sumTestNegative(){

        Assert.assertEquals(calculator.calculateSum(),2+8);
    }

    @Test
    public void distinctionTestPostive(){

        Assert.assertEquals(calculator.calculateDistinction(),2-6);
    }

    @Test
    public void distinctTestNegtive(){

        Assert.assertEquals(calculator.calculateDistinction(),2-1);
   }
}
