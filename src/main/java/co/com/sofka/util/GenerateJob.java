package co.com.sofka.util;

import co.com.sofka.model.Job;
import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.Random;

public class GenerateJob {
    public static Job generarNuevoTrabajo(String language, String country) {

        Faker faker = Faker.instance(
                new Locale(language, country),
                new Random()
        );

        Job newJob = new Job();
        newJob.setJobTitle(faker.job().title());
        newJob.setJobDescription(faker.job().field());
        newJob.setNote(faker.shakespeare().hamletQuote());

        return newJob;
    }
}