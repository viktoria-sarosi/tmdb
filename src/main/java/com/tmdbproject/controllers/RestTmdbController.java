package com.tmdbproject.controllers;

import com.tmdbproject.services.CountriesAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class RestTmdbController {

    private CountriesAPIService countriesAPIService;

    @Autowired
    public RestTmdbController(CountriesAPIService countriesAPIService) {
        this.countriesAPIService = countriesAPIService;
    }

    @GetMapping("/index")
    public String greeting() {
        return "<h1>Welcome!<h1>";
    }

    @GetMapping("/admin")
    public String adminGreeting() {
         return "<h1>Welcome Admin!<h1>";
    }

    @GetMapping("/all")
    public ResponseEntity getAllCountriesWithCapitalRegionAndPopulation() throws IOException {
        return ResponseEntity.ok().body(countriesAPIService.getAll());
    }
}
