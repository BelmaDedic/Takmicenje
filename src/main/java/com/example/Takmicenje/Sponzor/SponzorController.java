package com.example.Takmicenje.Sponzor;

import com.example.Takmicenje.Projekat.ProjekatEntity;
import com.example.Takmicenje.Projekat.ProjekatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SponzorController {
    @Autowired
    private SponzorService sponzorService;

    @PostMapping("addSponzor")
    public void addSponzor(@RequestBody SponzorEntity sponzor) {
        sponzorService.addSponzor(sponzor);
    }
}
