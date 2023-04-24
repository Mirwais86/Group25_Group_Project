package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    WebDriver driver=new ChromeDriver();

    @Given("open the browser and launch HMIS application")
    public void open_the_browser_and_launch_hmis_application() {
     driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

    }
    @When("user enter valid email and valid password")
    public void user_enter_valid_email_and_valid_password() {
        driver.findElement(By.id("txtUsername")).sendKeys("admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");

    }
    @When("click on login button")
    public void click_on_login_button() {
        driver.findElement(By.id("btnLogin")).click();

    }
    @Then("user is logged in successfully")
    public void user_is_logged_in_successfully() {
        System.out.println("login successfully");




    }

}
