package Microservices.com.SpringRESTapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class myClassController {

    @GetMapping("/hello-ms")
    public String helloMicroservice()
    {
        return "Microservice practice";
    }


}
