package com.game.canesta.controller;

import com.game.canesta.model.Profile;
import com.game.canesta.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CanestaProfileController {

    @Autowired
    private ProfileService profileService;

    @PostMapping("/canesta/create/profile")
    private ResponseEntity<Void> createProfile(@RequestParam("total") int totalNoOfPlayers, @RequestBody List<Profile> gameProfiles) {
        if (totalNoOfPlayers % 2 != 0) {
            return new ResponseEntity<>(HttpStatus.FORBIDDEN);
        } else {
            for (int i=0;i<totalNoOfPlayers;i++) {
                if (i % 2 == 0) {
                    gameProfiles.get(i).setTeam(Profile.Team.A);
                } else {
                    gameProfiles.get(i).setTeam(Profile.Team.B);
                }
            }
        }

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/v1/canesta/profile/{id}")
    private ResponseEntity<Profile> getProfile(@PathVariable("id") int id) {
        return new ResponseEntity<>(profileService.getProfile(id), HttpStatus.OK);
    }

    @GetMapping("/v1/canesta/profiles")
    private ResponseEntity<List<Profile>> getAllProfiles() {
        return new ResponseEntity<>(profileService.getAllProfiles(), HttpStatus.OK);
    }
}
