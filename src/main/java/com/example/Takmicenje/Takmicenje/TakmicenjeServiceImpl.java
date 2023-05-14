package com.example.Takmicenje.Takmicenje;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TakmicenjeServiceImpl implements TakmicenjeService{
    @Autowired
    private TakmicenjeRepository takmicenjeRepository;

    @Override
    public void addTakmicenje(TakmicenjeEntity takmicenje) {
        takmicenjeRepository.save(takmicenje);
    }

    @Override
    public List<TakmicenjeEntity> getAllTakmicenja() {
        return takmicenjeRepository.findAll();
    }

    @Override
    public void deleteTakmicenje(Integer id) {
        takmicenjeRepository.deleteById(id);
    }

    @Override
    public void updateTakmicenje(Integer id, TakmicenjeEntity takmicenje) {
        takmicenjeRepository.findById(id)
                .ifPresent(novoTakmicenje -> {
                    novoTakmicenje.setBrojUcesnika(takmicenje.getBrojUcesnika());
                    novoTakmicenje.setDatumOdrzavanja(takmicenje.getDatumOdrzavanja());
                    novoTakmicenje.setGradOdrzavanja(takmicenje.getGradOdrzavanja());

                    takmicenjeRepository.save(novoTakmicenje);
                });
    }
}
