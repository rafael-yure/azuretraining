package com.mastercard.azuretraining.service;

import com.mastercard.azuretraining.model.Hero;

import java.util.List;

public interface HeroService {

    Hero getHero(long id);
    List<Hero> getHeroes();

}
