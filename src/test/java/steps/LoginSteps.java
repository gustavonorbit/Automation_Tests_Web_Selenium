package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import pages.LoginPage;
import runner.RunBase;
import runner.RunCucumberTest;

import static runner.RunBase.Browser.CHROME;
import static runner.RunBase.Browser.FIREFOX;

public class LoginSteps extends RunCucumberTest {

    LoginPage loginPage = new LoginPage();

    @Dado("^que estou na pagina de login$")
    public void acessarLogin(){
        getDriver(CHROME);
        loginPage.paginaLogin();
    }
    @E("^acesso cadastro de novo usuario$")
    public void acesso_cadastro_de_novo_usuario()  {
        loginPage.nameAndEmail();
        loginPage.clickCreateNewAccount();
    }

}
