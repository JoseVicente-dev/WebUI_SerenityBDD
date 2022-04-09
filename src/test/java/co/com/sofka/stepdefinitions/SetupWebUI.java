package co.com.sofka.stepdefinitions;

import co.com.sofka.util.Log4jValues;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;


import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class SetupWebUI {

    @Managed()
    protected WebDriver browser;

    private void setupBrowser(WebDriver browser){
        browser.manage().deleteAllCookies();
        browser.manage().window().maximize();
    }

    private void setupUser(String name, WebDriver browser){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(name).can(BrowseTheWeb.with(browser));
    }

    protected void actorSetupTheBrowser(String actorName){
        setUpLog4j2();
        setupBrowser(browser);
        setupUser(actorName, browser);
    }

    private void setUpLog4j2(){
        PropertyConfigurator.configure(Log4jValues.USER_DIR.getValue()  + Log4jValues.LOG4J_PROPERTIES_FILE_PATH.getValue());
    }

}
