package steps;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.pt.E;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CadastroPage;
import runner.RunCucumberTest;
import support.Utils;


public class CadastroSteps extends RunCucumberTest {

    CadastroPage cadastroPage = new CadastroPage();

    @Quando("^eu preencho o cadastro$")
    public void eu_preencho_o_cadastro()  {
        cadastroPage.selectTitle(1);
        cadastroPage.preencheNome("Carlos");
        cadastroPage.preencheSobrenome("Mattos");
        cadastroPage.preenchePassword("hello1");
        cadastroPage.nascimento(19,11,"1997");
        cadastroPage.preencheAddress("Rua muito doida e nois demais");
        cadastroPage.selectCountry("Canada");
        cadastroPage.preencheState("Alberta");
        cadastroPage.preencheCity("Calgary");
        cadastroPage.preencheZipCode("44444");
        cadastroPage.preenchePhoneNumber("485-458-555");
    }

    @E("^finalizo o cadastro$")
    public void finalizo_o_cadastro() {
        cadastroPage.setClick_createAccount();
    }

    @Entao("^eu vejo a mensagem de novo usuario$")
    public void eu_vejo_a_mensagem_de_novo_usuario() {
        String resultado_atual = getDriver().findElement(By.cssSelector("h2[data-qa='account-created']")).getText();
        Assert.assertEquals("Não encontrado","ACCOUNT CREATED!", resultado_atual);
    }

}