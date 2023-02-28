package support;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;
import sun.awt.X11.XInputMethod;

import java.util.Random;

public class Utils extends RunCucumberTest {

    public static void waitElementBePresent(By element, Integer tempo){
        WebDriverWait wait = new WebDriverWait(getDriver(), tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public static String getRandonEmail(){
        String email_init = "carlos_";
        String email_final = "@email.com.br";
        Random random = new Random();
        int min = 1;
        int max = 9999999;
        int results = random.nextInt(max-min)+ min;

        return email_init + results + email_final;
    }

}
