package com.challenge.foro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller //old
@RestController // new
@RequestMapping("/hello") // Dice que ruta de HTTP sigue
public class HelloController {

    @GetMapping // mapea el metodo get
    public String helloWorld(){
        return "Hello World";
    }
}
