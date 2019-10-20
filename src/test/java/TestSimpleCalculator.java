import org.junit.Assert;
import org.junit.Test;

public class TestSimpleCalculator extends TestBase {

    @Test
    public void addTwoNumbers() {
        simplePage.two.click();
        simplePage.plus.click();
        simplePage.three.click();
        simplePage.equals.click();
        Assert.assertEquals("5",simplePage.result.getText());
    }

    @Test
    public void multiplyTwoNumbers() {
        simplePage.two.click();
        simplePage.multiply.click();
        simplePage.four.click();
        simplePage.equals.click();
        simplePage.assertResult("5");
    }

    @Test
    public void subtractTwoNumbers() {
        simplePage.six.click();
        simplePage.minus.click();
        simplePage.three.click();
        Assert.assertEquals("6−3",simplePage.formula.getText());
        simplePage.assertResult("3");
    }




//    MobileElement el1 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
//        el1.click();
//    MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("plus");
//        el2.click();
//    MobileElement el3 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_3");
//        el3.click();
//    MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("equals");
//        el4.click();
//
//        driver.findElementById("digit_2").click();
//        driver.findElementByAccessibilityId("plus").click();
//        driver.findElementById("digit_3").click();
//        driver.findElementByAccessibilityId("equals").click();

}
