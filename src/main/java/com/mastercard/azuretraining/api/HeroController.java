package com.mastercard.azuretraining.api;

import com.mastercard.azuretraining.model.Hero;
import com.mastercard.azuretraining.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/hero")
public class HeroController {

    private HeroService heroService;

    @Autowired
    public HeroController(HeroService heroService) {
        this.heroService = heroService;
    }

    @GetMapping("/{id}")
    public Hero getHero(@PathVariable(required = true) long id) {
        return heroService.getHero(id);
    }

    @GetMapping
    public List<Hero> getHeroes() {
        return heroService.getHeroes();
    }

}
