package co.com.sofka.question;

import co.com.sofka.userinterface.jobtitle.JobTitlePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class IsJobCreated implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return JobTitlePage.JOB_CREATED_MESSAGE.resolveFor(actor).isCurrentlyVisible();
    }

    public static IsJobCreated theNewJobIsSuccessfullySaved(){
        return new IsJobCreated();
    }
}
