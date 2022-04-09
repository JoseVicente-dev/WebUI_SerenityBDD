package co.com.sofka.userinterface.landingpage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LandingPage extends PageObject {

    public static final Target USERNAME_FIELD = Target
            .the("user name field")
            .located(By.id("txtUsername"));

    public static final Target PASSWORD_FIELD = Target
            .the("password field")
            .located(By.id("txtPassword"));

    public static final Target LOGIN_BUTTON = Target
            .the("login button")
            .located(By.id("btnLogin"));

}
