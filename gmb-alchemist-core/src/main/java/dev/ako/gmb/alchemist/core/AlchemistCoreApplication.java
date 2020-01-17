package dev.ako.gmb.alchemist.core;

import com.mongodb.client.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Anton Kozlovskyi
 * @date 17 Jan 2020
 */
@SpringBootApplication
public class AlchemistCoreApplication {




    public static void main(String[] args) {
        SpringApplication.run(AlchemistCoreApplication.class, args);
    }
}
