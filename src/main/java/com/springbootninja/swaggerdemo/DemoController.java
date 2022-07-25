package com.springbootninja.swaggerdemo;

import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @PostMapping("/greeting")
    public String addGreetings(@RequestBody Greetings greetings) {
        return "Greeting " + greetings.name + " added successfully";
    }

    @GetMapping("/greeting")
    public Greetings getGreetings() {
        return new Greetings("Namaste","1");
    }

}
