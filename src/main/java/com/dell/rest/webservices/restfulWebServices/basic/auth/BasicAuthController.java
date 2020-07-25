package com.dell.rest.webservices.restfulWebServices.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BasicAuthController {


    @GetMapping(path="/basicauth")
    public AuthenticationBean helloWorldPathVariable(@PathVariable String name)  {
        return new AuthenticationBean("You are authenticated") ;
       }
}
