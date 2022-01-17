package com.game.canesta.controller;

import com.game.canesta.model.Bundle;
import com.game.canesta.model.Card;
import com.game.canesta.model.CardPack;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BundleController {

    @GetMapping("/canesta/create/bundle")
    private ResponseEntity<List<CardPack>> createBundle(@RequestParam("total") int totalNoOfCardPacks) {
        return new ResponseEntity<>(new Bundle(totalNoOfCardPacks).getCardPacks(), HttpStatus.OK);
    }
}
