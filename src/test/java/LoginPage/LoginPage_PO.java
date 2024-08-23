package LoginPage;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage_PO {
    By Login= By.xpath("//h5[@class=\"oxd-text oxd-text--h5 orangehrm-login-title\"]");
    By txt_username= By.name("username");
    By txt_password= By.name("password");
    By btn_Login= By.xpath("//button[@type='submit']");
    By dashboard= By.xpath("//*[@class='oxd-topbar-header-breadcrumb']/h6");
    By mnubar= By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']");
    By btn_Logout= By.xpath("//a[normalize-space()='Logout']");
    By txt_Error= By.xpath("//*[@class='orangehrm-login-error']/div[1]/div[1]/p");
    WebDriver driver;
    public LoginPage_PO(WebDriver driver){
        this.driver=driver;
        }
    public void validLoginUser(String username, String password) throws InterruptedException {
        boolean logo1= driver.findElement(Login).isDisplayed();
        Assert.assertTrue(logo1);
        driver.findElement(txt_username).sendKeys(username);
        driver.findElement(txt_password).sendKeys(password);
        driver.findElement(btn_Login).click();
        Thread.sleep(3000);
    }
    public void verifyHomepage() throws InterruptedException {
        String  homePageHeading = driver.findElement(dashboard).getText();
        Assert.assertEquals(homePageHeading, "Dashboard");
        Thread.sleep(1000);
        driver.findElement(mnubar).click();
        Thread.sleep(1000);
        driver.findElement(btn_Logout).click();
    }
    public void InvalidloginError (String expectedError){
        String actualError= driver.findElement(txt_Error).getText();
        Assert.assertEquals(actualError, expectedError);
    }
}