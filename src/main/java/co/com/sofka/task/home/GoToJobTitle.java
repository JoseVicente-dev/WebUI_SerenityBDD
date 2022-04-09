package co.com.sofka.task.home;

import co.com.sofka.userinterface.home.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

public class GoToJobTitle implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(HomePage.ADMIN_TAB),
                Click.on(HomePage.ADMIN_TAB),
                HoverOverTarget.over(HomePage.ADMIN_TAB),

                MoveMouse.to(HomePage.JOB_TAB),
                Click.on(HomePage.JOB_TAB),

                HoverOverTarget.over(HomePage.JOB_TITLE_LINK),
                MoveMouse.to(HomePage.JOB_TITLE_LINK),
                Click.on(HomePage.JOB_TITLE_LINK)

        );
    }

    public static GoToJobTitle goToJobTitlePage(){
        return new GoToJobTitle();
    }

}
