package com.example.Takmicenje.Takmicenje;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TakmicenjeController {
    @Autowired
    private TakmicenjeService takmicenjeService;

    @PostMapping("addTakmicenje")
    public void addTakmicenje(@RequestBody TakmicenjeEntity takmicenje) {
        takmicenjeService.addTakmicenje(takmicenje);
    }

    @GetMapping("getAllTakmicenja")
    public List<TakmicenjeEntity> getAllTakmicenja() {
        return takmicenjeService.getAllTakmicenja();
    }

    @DeleteMapping("deleteTakmicenje/{id}")
    public void deleteTakmicenje(@PathVariable(value = "id") Integer id) {
        takmicenjeService.deleteTakmicenje(id);
    }

    @PutMapping("updateTakmicenje/{id}")
    public void updateTakmicenje(@PathVariable Integer id, @RequestBody TakmicenjeEntity takmicenje) {
        takmicenjeService.updateTakmicenje(id, takmicenje);
    }
}
