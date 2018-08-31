package io.github.taowang0622.homehive.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test500")
    public String testError() {
        throw new UnsupportedOperationException();
    }
}
