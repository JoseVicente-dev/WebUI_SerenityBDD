package co.com.sofka.userinterface.jobtitle;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class JobTitlePage {
    public static final Target ADD_BUTTON = Target
            .the("Add button")
            .located(By.id("btnAdd"));

    public static final Target JOB_TITLE_FIELD = Target
            .the("job title field")
            .located(By.id("jobTitle_jobTitle"));

    public static final Target JOB_DESCRIPTION_FIELD = Target
            .the("job description field")
            .located(By.id("jobTitle_jobDescription"));

    public static final Target JOB_SPECIFICATION_FILE = Target
            .the("job file")
            .located(By.id("jobTitle_jobSpec"));

    public static final Target JOB_NOTE_FIELD = Target
            .the("job note field")
            .located(By.id("jobTitle_note"));

    public static final Target SAVE_JOB_BUTTON = Target
            .the("save job button")
            .located(By.id("btnSave"));

    //for assertions
    public static final Target JOB_CREATED_MESSAGE = Target
            .the("job created message")
            .located(By.cssSelector(".message"));
}
