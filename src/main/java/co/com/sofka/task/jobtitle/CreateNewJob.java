package co.com.sofka.task.jobtitle;

import co.com.sofka.userinterface.jobtitle.JobTitlePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import java.nio.file.Path;
import java.nio.file.Paths;

import static co.com.sofka.util.Dictionary.JOB_SPECIFICATION_FILE;

public class CreateNewJob implements Task {


    private String jobTitle;
    private String jobDescription;
    private String note;
    private Path file;


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(JobTitlePage.ADD_BUTTON),
                Click.on(JobTitlePage.ADD_BUTTON),

                Scroll.to(JobTitlePage.JOB_TITLE_FIELD),
                Enter.theValue(jobTitle).into(JobTitlePage.JOB_TITLE_FIELD),

                Scroll.to(JobTitlePage.JOB_DESCRIPTION_FIELD),
                Enter.theValue(jobDescription).into(JobTitlePage.JOB_DESCRIPTION_FIELD),

                Scroll.to(JobTitlePage.JOB_SPECIFICATION_FILE),
                Upload.theFile(file).to(JobTitlePage.JOB_SPECIFICATION_FILE),

                Scroll.to(JobTitlePage.JOB_NOTE_FIELD),
                Enter.theValue(note).into(JobTitlePage.JOB_NOTE_FIELD),

                Scroll.to(JobTitlePage.SAVE_JOB_BUTTON),
                Click.on(JobTitlePage.SAVE_JOB_BUTTON)

        );
    }

    public static CreateNewJob createANewJob() {
        return new CreateNewJob();
    }

    public CreateNewJob withJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    public CreateNewJob withJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
        return this;
    }

    public CreateNewJob withJobSpecificationFile(String filePath) {

        this.file = Paths.get(JOB_SPECIFICATION_FILE.getValue());
        return this;
    }

    public CreateNewJob andJobNotes(String note){
        this.note=note;
        return this;
    }
}
