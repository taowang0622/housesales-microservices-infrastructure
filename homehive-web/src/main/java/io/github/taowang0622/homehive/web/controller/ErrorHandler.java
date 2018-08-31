package io.github.taowang0622.homehive.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ErrorHandler {
    private Logger logger = LoggerFactory.getLogger(ErrorHandler.class);

    @ExceptionHandler({Exception.class})
    public String error500(HttpServletRequest request, Exception e) {
        logger.error(e.getMessage()); //Just print message, not the entire stack trace!!!
        logger.error(request.getRequestURL() + "encounters 500"); //print which URL causes errors!!
        return "/error/500";
    }
}
