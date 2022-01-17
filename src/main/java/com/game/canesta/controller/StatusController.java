package com.game.canesta.controller;

import com.game.canesta.model.Status;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping("/canesta/status")
    public ResponseEntity<Status> getStatus() {
        Status status = new Status();
        status.setStatus("RUNNING");
        return new ResponseEntity<>(status, HttpStatus.OK);
    }

    @GetMapping("/v1/canesta/status")
    public ResponseEntity<Status> getVqStatus() {
        Status status = new Status();
        status.setStatus("SECURELY RUNNING");
        return new ResponseEntity<>(status, HttpStatus.OK);
    }
}
