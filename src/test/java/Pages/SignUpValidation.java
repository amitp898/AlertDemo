package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpValidation {

    public WebDriver driver;

    By signupBtnLocator = By.xpath("//a[text()=' Signup / Login']");
    By homeBtnLocator = By.xpath("//a[text()=' Home']");
    By signUpTitle = By.xpath("//h2[text()='New User Signup!']");
    By namelocator = By.xpath("//input[@name='name']");
    By emaillocator = By.xpath("//input[@name='email' and @data-qa='signup-email']");
    By signUpBtnField = By.xpath("//button[text()=\"Signup\"]");
    By errTextLocator = By.xpath("//p[text()=\"Email Address already exist!\"]");

    public SignUpValidation(WebDriver driver) throws Exception {
        this.driver = driver;
    }

    public void clickSignUpBtn() throws Exception {
        WebElement signupBtn = driver.findElement(signupBtnLocator);
        signupBtn.click();
    }

    public boolean checkhomePage() throws Exception {
      return  driver.findElement(homeBtnLocator).isDisplayed();
    }

    public boolean  checkSignUpTitle() throws Exception{
        return driver.findElement(signUpTitle).isDisplayed();
    }

    public void nameTextField(String name) throws Exception{
        WebElement nameText = driver.findElement(namelocator);
        nameText.sendKeys(name);
    }

    public void emailTextField(String email) throws Exception{
        WebElement emailText = driver.findElement(emaillocator);
        emailText.sendKeys(email);
    }

    public void clickSignUpBtntext() throws Exception {
        WebElement signupTextBtn = driver.findElement(signUpBtnField);
        signupTextBtn.click();
    }

    public boolean  checkerrorTitle() throws Exception{
        return driver.findElement(errTextLocator).isDisplayed();
    }


}



