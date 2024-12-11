package com.chimiacorp.first_spring_app.controller;

import com.chimiacorp.first_spring_app.domain.User;
import com.chimiacorp.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
    @Autowired
    private HelloWorldService helloWorldService;


    @GetMapping
    public String helloWorld(String name) {
        return helloWorldService.helloWorld(name);
    }

    @PostMapping("/{id}/{cpf}")
    public String helloWorldPost(@PathVariable("id") String id,
                                 @PathVariable("cpf") String cpf,
                                 @RequestBody User body,
                                 @RequestParam(defaultValue = "sexxx") String dia,
                                 @RequestParam(defaultValue = "girafa") String bicho) {
        return ("Fala ae " + body.getName() + " " + body.getEmail() + " " + cpf + " " + id + " " + dia + " " + bicho);
    }
}
