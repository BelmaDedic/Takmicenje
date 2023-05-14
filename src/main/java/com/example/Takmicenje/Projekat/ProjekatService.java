package com.example.Takmicenje.Projekat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjekatService {
    @Autowired
    private ProjekatRepository projekatRepository;

    public void addProjekat(ProjekatEntity projekat) {
        projekatRepository.save(projekat);
    }
}
