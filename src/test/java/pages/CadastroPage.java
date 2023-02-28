package pages;

import cucumber.api.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import runner.RunCucumberTest;
import support.Utils;

public class CadastroPage extends RunCucumberTest {


    private By titleM = By.id("id_gender1");
    private By titleF = By.id("id_gender2");
    private By first_name_field = By.id("first_name");
    private By last_name_field = By.id("last_name");
    private By password_field = By.id("password");
    private By select_day_field = By.id("days");
    private By select_month_field = By.id("months");
    private By select_years_field = By.id("years");
    private By address_field = By.id("address1");
    private By country_field = By.cssSelector("select[data-qa='country']");
    private By state_field = By.id("state");
    private By city_field = By.id("city");
    private By zipcode_field = By.id("zipcode");
    private By mobile_number_field = By.id("mobile_number");
    private By click_createAccount = By.cssSelector("button[data-qa='create-account']");
    private By iframe_click = By.cssSelector("label[for='country']");



    public void selectTitle(Integer type){
        Utils.waitElementBePresent(titleM,20);
        if (type == 1){
            getDriver().findElement(titleM).click();
        }else {
            getDriver().findElement(titleF).click();
        }
    }
    public void preencheNome(String name){
        getDriver().findElement(first_name_field).sendKeys(name);
    }
    public void preencheSobrenome(String sobrenome){
        getDriver().findElement(last_name_field).sendKeys(sobrenome);
    }
    public void preenchePassword(String passwd){
        getDriver().findElement(password_field).sendKeys(passwd);
    }
    public void nascimento(Integer day, Integer months, String year){
        Select select_day = new Select(getDriver().findElement(select_day_field));
        select_day.selectByIndex(day);

        Select select_month = new Select(getDriver().findElement(select_month_field));
        select_month.selectByIndex(months);

        Select select_year = new Select(getDriver().findElement(select_years_field));
        select_year.selectByValue(year);
    }
    public void preencheAddress(String address){
        getDriver().findElement(address_field).sendKeys(address);
    }
    public void preencheCity(String city){
        getDriver().findElement(city_field).sendKeys(city);
    }
    public void selectCountry(String country){
        getDriver().findElement(iframe_click).click();
        Utils.waitElementBePresent(country_field,20);
        Select select_country = new Select(getDriver().findElement(country_field));
        select_country.selectByValue(country);
    }
    public void preencheState(String state){
        getDriver().findElement(state_field).sendKeys(state);
    }
    public void preencheZipCode(String postalcode){
        getDriver().findElement(zipcode_field).sendKeys(postalcode);
    }
    public void preenchePhoneNumber(String phone){
        getDriver().findElement(mobile_number_field).sendKeys(phone);
    }
    public void setClick_createAccount(){
        getDriver().findElement(click_createAccount).click();
    }

}
