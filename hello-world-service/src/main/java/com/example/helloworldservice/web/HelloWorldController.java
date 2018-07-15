package com.example.helloworldservice.web;

import com.example.helloworldservice.client.HelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Igor Rybak
 * @since 15-Jul-2018
 */
@RestController
public class HelloWorldController {

    @Autowired
    private HelloClient helloClient;

    @GetMapping
    public String getHello() {
        return helloClient.getHello("World");
    }

}
