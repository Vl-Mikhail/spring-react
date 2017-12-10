package ru.misha.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.misha.models.Tire;
import ru.misha.service.TireService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TireController {

    private final TireService tireService;

    @Autowired
    public TireController(TireService tireService) {
        this.tireService = tireService;
    }

    @RequestMapping("/tires")
    @CrossOrigin
    public Iterable<Tire> getTires() {
        return tireService.findAll();
    }
}
