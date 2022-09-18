package com.coronavirustrackersite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class CoronaVirusTrackerSiteApplication {

    public static void main(String[] args) {
        SpringApplication.run ( CoronaVirusTrackerSiteApplication.class, args );
    }

}
