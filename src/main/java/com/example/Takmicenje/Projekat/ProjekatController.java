package com.example.Takmicenje.Projekat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjekatController {
    @Autowired
    private ProjekatService projekatService;

    @PostMapping("addProjekat")
    public void addProjekat(@RequestBody ProjekatEntity projekat) {
        projekatService.addProjekat(projekat);
    }
}
