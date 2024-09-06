package MyStepDefination;

import Pages.SignUpValidation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;
import java.time.Duration;

public class SignupStepDef {

    WebDriver driver = Hooks.driver;
    SignUpValidation signuppagevalidation;

    @Given("i am navigate to application")
    public void iamnavigatetoapplication() throws Exception{
        driver.get("https://www.automationexercise.com/");
        signuppagevalidation = new SignUpValidation(driver);

        }
        @And("i should be in homepage")
            public void ishouldbeinhomepage() throws Exception{
                Assert.assertEquals(signuppagevalidation.checkhomePage(), true);
            }
    @When("i have click signup button")
    public void  ihaveclicksignupbutton() throws Exception{
        signuppagevalidation.clickSignUpBtn();

    }

    @Then("title should be display")
    public void titleshouldbedisplay() throws Exception {

        Assert.assertEquals(signuppagevalidation.checkSignUpTitle(), true);

    }

    @Given("i have entered the {string} and {string}")
    public void ihaveenteredthenameandemail(String name, String email) throws Exception{
        signuppagevalidation.nameTextField("Amit Patnaik");
        signuppagevalidation.emailTextField("amitpatnaik008@gmail.com");
    }

    @When("I click on the signup button")
    public void Iclickonthesignupbutton() throws Exception{
        signuppagevalidation.clickSignUpBtntext();

    }
    @Then("I should see an error message indicating {string}")
    public void Ishouldseeanerrormessageindicating(String errormessage ) throws Exception {

        Assert.assertEquals(signuppagevalidation.checkerrorTitle(), true);

    }





}
