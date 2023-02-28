package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Sleeper;
import pages.MessagePage;
import runner.RunCucumberTest;
import support.Utils;

public class MessageSteps extends RunCucumberTest {

        MessagePage messagePage = new MessagePage(getDriver());
@Given("^i stay in page to contact$")
public void i_stay_in_page_to_contact(){
        messagePage.acessarMesesage();
}

@And("^inserts all information necessary$")
public void inserts_all_information_necessary() {
        messagePage.preencheNome("Carlos");
        messagePage.preencheEmail("carlos@email.com");
        messagePage.preencheSubject("error 4004");
        messagePage.uploadFile("/home/kali/IdeaProjects/Projeto_Curso_Automacao/Screenshot_2023-02-26_22_42_53.png");
}

@When("^click to submmit$")
public void click_to_submmit() throws InterruptedException{
        messagePage.click_button_message();
        }
@And("^accept popup$")
public void accept_popup() throws InterruptedException {
        Thread.sleep(2000);
        Alert al=getDriver().switchTo().alert();
        al.accept();
}

@Then("^receive feedback of sucess$")
public void receive_feedback_of_sucess()  {
        messagePage.feedbackSucess();
        }
}