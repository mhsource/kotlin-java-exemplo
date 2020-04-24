package com.exemplo.kotlinJava.javaController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test-java")
public class testJavaController {

    @GetMapping
    public String exibir(){
        return "Controller em Java";
    }

}
