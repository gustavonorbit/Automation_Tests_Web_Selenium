package pages;

import cucumber.api.java.pt.Dado;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import runner.RunCucumberTest;
import support.Utils;

import static support.Utils.*;


public class LoginPage extends RunCucumberTest {


    private By create_name_field = By.cssSelector("input[data-qa='signup-name']");
    private By create_email_field = By.cssSelector("input[data-qa='signup-email']");
    private By create_account_button = By.cssSelector("button[data-qa='signup-button']");




    @Dado("^que estou na pagina de login$")
    public void paginaLogin(){
        getDriver().get("https://automationexercise.com/login");
        waitElementBePresent(create_name_field,10);
    }
    public void nameAndEmail(){
        getDriver().findElement(create_name_field).sendKeys("Carlos");
        getDriver().findElement(create_email_field).sendKeys(Utils.getRandonEmail());
    }
    public void clickCreateNewAccount(){
        getDriver().findElement(create_account_button).click();
    }
}
