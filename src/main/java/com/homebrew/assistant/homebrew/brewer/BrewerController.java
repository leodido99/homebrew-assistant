package com.homebrew.assistant.homebrew.brewer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BrewerController {
    private BrewerRepository brewers;

    public BrewerController(BrewerRepository homebrewService) {
        this.brewers = homebrewService;
    }

    @GetMapping("/brewers")
    public List<Brewer> getAll() {
        return brewers.findAll();
    }
}
