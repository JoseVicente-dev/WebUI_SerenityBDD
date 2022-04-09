package co.com.sofka.task.landingpage;

import co.com.sofka.userinterface.landingpage.LandingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

public class FillTheSignInForm implements Task {

    private String username;
    private String password;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(LandingPage.USERNAME_FIELD),
                Click.on(LandingPage.USERNAME_FIELD),
                Enter.theValue(username).into(LandingPage.USERNAME_FIELD),

                Scroll.to(LandingPage.PASSWORD_FIELD),
                Click.on(LandingPage.PASSWORD_FIELD),
                Enter.theValue(password).into(LandingPage.PASSWORD_FIELD),

                Scroll.to(LandingPage.LOGIN_BUTTON),
                Click.on(LandingPage.LOGIN_BUTTON)
        );
    }

    public FillTheSignInForm withUsername(String username) {
        this.username = username;
        return this;
    }

    public FillTheSignInForm andPassword(String password) {
        this.password = password;
        return this;
    }

    public static FillTheSignInForm fillTheSignInForm(){
        return new FillTheSignInForm();
    }
}
