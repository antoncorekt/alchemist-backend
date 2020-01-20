package dev.ako.gmb.alchemist.rest.controllers;

import dev.ako.gmb.alchemist.core.dao.documents.Account;
import dev.ako.gmb.alchemist.core.dao.repositories.AccountCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

/**
 * @author Anton Kozlovskyi
 * @date 17 Jan 2020
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private AccountCrudRepository accountCrudRepository;

    @GetMapping(path = "/helloWorld")
    public Mono<String> helloWorld(){
        return Mono.just("Hello world");
    }


    @PostMapping(path = "/account", consumes = "application/json", produces = "application/json")
    public @ResponseBody Mono<Account> test(@RequestBody Account account){

//        final Account account = body.getBody();

        account.setId(UUID.randomUUID().toString());
        accountCrudRepository.save(account);

        return Mono.just(account);
    }

    @GetMapping(path = "/account/{uuid}", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public Mono<Account> getAccounts(@PathVariable String uuid){

        return accountCrudRepository.findById(uuid);
    }

    @GetMapping(path = "/account", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public Flux<Account> getAll(){

        return accountCrudRepository.findAll();
    }

}
