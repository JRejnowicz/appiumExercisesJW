import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.ScreenOrientation;

public class TestAdvancedCalculator extends TestBase {

    @Before
    public void rotateScreen() {
        driver.rotate(ScreenOrientation.LANDSCAPE);
    }

    @Test
    public void operationWithCos() {
        advancedPage.two.click();
        advancedPage.plus.click();
        advancedPage.cos.click();
        advancedPage.zero.click();
        advancedPage.rightParen.click();
        advancedPage.equals.click();
        advancedPage.assertResult("3");
    }

    @Test
    public void operationWithPrc() {
        advancedPage.two.click();
        advancedPage.multiply.click();
        advancedPage.five.click();
        advancedPage.zero.click();
        advancedPage.percent.click();
        advancedPage.equals.click();
        advancedPage.assertResult("1");
    }





}
