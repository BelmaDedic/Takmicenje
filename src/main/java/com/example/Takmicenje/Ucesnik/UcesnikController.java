package com.example.Takmicenje.Ucesnik;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UcesnikController {
    @Autowired
    private UcesnikService ucesnikService;

    @PostMapping("addUcesnik")
    public void addUcesnik(@RequestBody UcesnikEntity ucesnik) {
        ucesnikService.addUcesnik(ucesnik);
    }

    @GetMapping("getAllUcesnici")
    public List<UcesnikEntity> getAllUcesnici() {
        return ucesnikService.getAllUcesnici();
    }

    @DeleteMapping("deleteUcesnik/{id}")
    public void deleteUcesnik(@PathVariable(value = "id") Integer id) {
        ucesnikService.deleteUcesnik(id);
    }

    @PutMapping("updateUcesnik/{id}")
    public void updateUcesnik(@PathVariable Integer id, @RequestBody UcesnikEntity ucesnik) {
        ucesnikService.updateUcesnik(id, ucesnik);
    }
}
