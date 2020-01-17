package dev.ako.gmb.alchemist.core.configuration;

import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

/**
 * @author Anton Kozlovskyi
 * @date 17 Jan 2020
 */
@Configuration
@EnableReactiveMongoRepositories
public class MongoReactiveAppConfig extends AbstractReactiveMongoConfiguration {

    public MongoClient reactiveMongoClient() {
        return MongoClients.create();
    }

    protected String getDatabaseName() {
        return "alchemist";
    }

}
