package com.example.Takmicenje.Projekat_sponzor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Projekat_Sponzor_Controller {
    @Autowired
    private Projekat_Sponzor_Service projekat_sponzor_service;

    @PostMapping("addProjekatSponzor")
    public void addProjekatSponzor(@RequestBody Projekat_Sponzor_Entity projekat_sponzor) {
        projekat_sponzor_service.addProjekatSponzor(projekat_sponzor);
    }
}
