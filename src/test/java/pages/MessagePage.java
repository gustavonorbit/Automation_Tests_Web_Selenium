package pages;


import cucumber.api.java.cs.Ale;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.Utils;

public class MessagePage{

    static WebDriver driver;
    private By message_name_field = By.cssSelector("input[data-qa='name']");
    private By message_email_field = By.cssSelector("input[data-qa='email']");
    private By subject_field = By.cssSelector("input[data-qa='subject']");
    private By message_field = By.cssSelector("input[data-qa='message']");
    private By upload_field = By.name("upload_file");
    private By message_click_button = By.cssSelector("input[data-qa='submit-button']");
    private By message_sucess = By.cssSelector("div[class='status alert alert-success']");

    public MessagePage(WebDriver driver){
        this.driver=driver;
    }

    /*public void selecionaAssunto(String assunto){
        Select select_assunto = new Select(driver.findElement(subject_field));
        select_assunto.selectByVisibleText(assunto);
    }*/

    public void acessarMesesage(){
        driver.get("https://automationexercise.com/contact_us");
        Utils.waitElementBePresent(message_name_field,10);
    }
    public void preencheNome(String nome){
        driver.findElement(message_name_field).sendKeys(nome);
    }
    public void preencheEmail(String email){
        driver.findElement(message_email_field).sendKeys(email);
    }
    public void preencheMensagem(String message){
        driver.findElement(message_field).sendKeys(message);
    }
    public void preencheSubject(String subject){
        driver.findElement(subject_field).sendKeys(subject);
    }
    public void uploadFile(String caminhoArquivo){
        driver.findElement(upload_field).sendKeys(caminhoArquivo);
    }
    public void click_button_message(){
        driver.findElement(message_click_button).click();
    }
    public void feedbackSucess(){
        Utils.waitElementBePresent(message_sucess,15);
        String message = driver.findElement(message_sucess).getText();
        Assert.assertEquals("Error não encontrado","Success! Your details have been submitted successfully.",message);
    }
    public void getAlert()throws InterruptedException{

    }

}