package co.com.sofka.userinterface.home;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static final Target ADMIN_TAB = Target
            .the("Admin tab")
            .located(By.xpath("//b[contains(.,'Admin')]"));

    public static final Target JOB_TAB = Target
            .the("job tab")
            .located(By.id("menu_admin_Job"));

    public static final Target JOB_TITLE_LINK = Target
            .the("job title link")
            .located(By.id("menu_admin_viewJobTitleList"));
}
