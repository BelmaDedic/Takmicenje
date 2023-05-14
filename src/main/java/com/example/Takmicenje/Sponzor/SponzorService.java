package com.example.Takmicenje.Sponzor;

import com.example.Takmicenje.Projekat.ProjekatEntity;
import com.example.Takmicenje.Projekat.ProjekatRepository;
import com.example.Takmicenje.Projekat_sponzor.Projekat_Sponzor_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SponzorService {
    @Autowired
    private SponzorRepository sponzorRepository;

    public void addSponzor(SponzorEntity sponzor) {
        sponzorRepository.save(sponzor);
    }
}
