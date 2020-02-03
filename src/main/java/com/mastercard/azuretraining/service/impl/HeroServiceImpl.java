package com.mastercard.azuretraining.service.impl;

import com.mastercard.azuretraining.exception.HeroNotFoundException;
import com.mastercard.azuretraining.model.Hero;
import com.mastercard.azuretraining.persistence.HeroRepository;
import com.mastercard.azuretraining.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HeroServiceImpl implements HeroService {

    private HeroRepository heroRepository;

    @Autowired
    public HeroServiceImpl(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    @Override
    public Hero getHero(long id) {
        Optional<Hero> hero = heroRepository.findById(id);
        return hero.orElseThrow(() -> new HeroNotFoundException("That hero doesn't exist"));
    }

    @Override
    public List<Hero> getHeroes() {
        return heroRepository.findAll();
    }
}
