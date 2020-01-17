package dev.ako.gmb.alchemist.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Anton Kozlovskyi
 * @date 17 Jan 2020
 */
@SpringBootApplication
@ComponentScan("dev.ako.gmb.alchemist")
public class AlchemistApplications {
    public static void main(String[] args) {
        SpringApplication.run(AlchemistApplications.class, args);
    }
}
