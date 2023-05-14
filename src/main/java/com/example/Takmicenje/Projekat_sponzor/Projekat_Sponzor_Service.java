package com.example.Takmicenje.Projekat_sponzor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Projekat_Sponzor_Service {
    @Autowired
    Projekat_Sponzor_Repository projekat_sponzor_repository;

    public void addProjekatSponzor(Projekat_Sponzor_Entity projekat_sponzor) {
        projekat_sponzor_repository.save(projekat_sponzor);
    }
}
