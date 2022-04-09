package co.com.sofka.question;

import co.com.sofka.userinterface.jobtitle.JobTitlePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class IsJobOnTheList implements Question<Boolean> {

    String jobTitle;

    @Override
    public Boolean answeredBy(Actor actor) {
        return JobTitlePage.JOB_TITLE_ROW.of(jobTitle).resolveFor(actor).containsOnlyText(jobTitle);
    }

    public static IsJobOnTheList andTheJobIsOnTheList(){
        return new IsJobOnTheList();
    }

    public IsJobOnTheList withJobTitle(String jobTitle){
        this.jobTitle=jobTitle;
        return this;
    }
}
