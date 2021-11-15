import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorUtilTest {
    CalculatorPage c=new CalculatorPage();
    @Test
    public void shouldAddTwoNumbers()
    {
        int sum = c.getSum(10,20);
        Assert.assertEquals(sum,30);
    }
    @Test
    public void shouldMultiplyTwoNumbers()
    {
        int result = c.getResultOfMultiplication(10,20);
        Assert.assertEquals(200,result);
    }
    @Test
    public void shouldDivideTwoNumbers()
    {
        int result = c.getResultOfDivision(300,10);
        Assert.assertEquals(30,result);
    }
    @Test
    public void shouldSubtractTwoNumbers()
    {
        int result = c.getDifference(20,10);
        Assert.assertEquals(10,result);
    }




}
