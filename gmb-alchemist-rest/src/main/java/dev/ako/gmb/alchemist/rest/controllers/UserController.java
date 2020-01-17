package dev.ako.gmb.alchemist.rest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author Anton Kozlovskyi
 * @date 17 Jan 2020
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/helloWorld")
    public Mono<String> helloWorld(){
        return Mono.just("Hello world");
    }

}
