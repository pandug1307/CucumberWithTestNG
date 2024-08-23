package stepDefinitions;

import LoginPage.LoginPage_PO;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
public class Login_TC {
    WebDriver driver;
    LoginPage_PO loginPage;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    }
    @Given("user is on Orange HRM application {string}")
    public void user_is_on_Orange_HRM_application (String url) throws InterruptedException {
        driver.navigate().to(url);
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
    }
    @When("user enters username as {string} and password as {string}")
    public void validLoginuser(String username, String password) throws InterruptedException {
        loginPage= new LoginPage_PO(driver);
        loginPage.validLoginUser(username, password);
    }
    @Then("user should be able to login successfully and Home page is open")
    public void verify_Homepage() throws InterruptedException {
        loginPage.verifyHomepage();
    }
    @Then("user should be able to see the error Message {string}")
    public void verifyValidtion (String expectedError){
        loginPage.InvalidloginError(expectedError);
    }
    @After
    public void terminate(){
        driver.quit();
    }
}