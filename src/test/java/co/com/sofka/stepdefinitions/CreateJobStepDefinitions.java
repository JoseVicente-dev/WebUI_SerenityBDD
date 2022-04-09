package co.com.sofka.stepdefinitions;

import co.com.sofka.model.Job;
import co.com.sofka.util.AdminLoginValues;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.apache.log4j.Logger;


import static co.com.sofka.question.IsJobCreated.theNewJobIsSuccessfullySaved;
import static co.com.sofka.task.home.GoToJobTitle.goToJobTitlePage;
import static co.com.sofka.task.jobtitle.CreateNewJob.createANewJob;
import static co.com.sofka.task.landingpage.FillTheSignInForm.fillTheSignInForm;
import static co.com.sofka.task.landingpage.OpenLandingPage.openLandingPage;
import static co.com.sofka.util.Dictionary.*;
import static co.com.sofka.util.GenerateJob.generateNewJob;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CreateJobStepDefinitions extends SetupWebUI{

    private final Logger LOGGER = Logger.getLogger(CreateJobStepDefinitions.class);
    private final String ACTOR_NAME = "Admin";
    private Job newJob;

    @Dado("que estoy en la pagina creacion de trabajos")
    public void queEstoyEnLaPaginaCreacionDeTrabajos() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openLandingPage(),
                fillTheSignInForm()
                        .withUsername(AdminLoginValues.USERNAME.getValue())
                        .andPassword(AdminLoginValues.PASSWORD.getValue()),
                goToJobTitlePage()
        );
    }

    @Cuando("diligencie todos los campos para crear un nuevo trabajo")
    public void diligencieTodosLosCamposParaCrearUnNuevoTrabajo() {

        newJob = generateNewJob(SPANISH_CODE_LANGUAGE.getValue(),COUNTRY_CODE.getValue());

        theActorInTheSpotlight().attemptsTo(
                createANewJob()
                        .withJobTitle(newJob.getJobTitle())
                        .withJobDescription(newJob.getJobDescription())
                        .withJobSpecificationFile(JOB_SPECIFICATION_FILE.getValue())
                        .andJobNotes(newJob.getNote())
        );
    }

    @Entonces("se mostrara un mensaje de confirmacion del nuevo trabajo creado")
    public void seMostraraUnMensajeDeConfirmacionDelNuevoTrabajoCreado() {

        theActorInTheSpotlight().should(
                seeThat(theNewJobIsSuccessfullySaved())
        );
    }
}
