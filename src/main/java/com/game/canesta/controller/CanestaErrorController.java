package com.game.canesta.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CanestaErrorController implements ErrorController {

    @RequestMapping("/error")
    private ResponseEntity<String> renderErrorPage() {
        return new ResponseEntity<>("This page does not exists", HttpStatus.OK);
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
