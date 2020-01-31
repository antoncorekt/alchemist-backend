package dev.ako.gmb.infra.auth.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;

/**
 * @author Anton Kozlovskyi
 * @date 30 Jan 2020
 */
@Document
@Data
public class UserAccount {

    @Id
    private String id;

    @Email(message = "Not valid email field")
    private String email;

    @NotBlank(message = "Account login must not be null")
    private String login;

    @Positive
    private int age;
    private String country;
    private String city;

    private String firstName;
    private String lastName;



}
