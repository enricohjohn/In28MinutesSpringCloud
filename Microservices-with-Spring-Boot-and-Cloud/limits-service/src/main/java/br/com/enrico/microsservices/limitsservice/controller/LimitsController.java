package br.com.enrico.microsservices.limitsservice.controller;

import br.com.enrico.microsservices.limitsservice.bean.Limits;
import br.com.enrico.microsservices.limitsservice.config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private static Configuration configuration;

    @GetMapping("/limits")
    public Limits retrieveLimits() {
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
        //return new Limits(1,1000);
    }

}
