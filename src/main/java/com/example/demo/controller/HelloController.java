package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
@Slf4j
public class HelloController {

    private final AtomicInteger counter = new AtomicInteger();

    @GetMapping("/say-hello")
    public String helloEndpoint() {
        int called = counter.incrementAndGet();
        log.info("CALLED say-hello {} times, viola", called);
        return "HELLO, HOWDY " + called;
    }

}
