package com.profileexample.controller.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.annotation.PostConstruct;

@Profile("dev")
@Configuration

public class ProfileConfiguration {

    @PostConstruct
    public void execute(){
        System.out.println("Load The Dev");
    }
}
