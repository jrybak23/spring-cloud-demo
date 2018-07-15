package com.example.helloworldservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Igor Rybak
 * @since 15-Jul-2018
 */
@FeignClient("hello-service")
public interface HelloClient {
    @GetMapping
    String getHello(@RequestParam("name") String name);
}
