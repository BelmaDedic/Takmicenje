package com.example.Takmicenje.Ucesnik;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UcesnikServiceImpl implements UcesnikService {
    @Autowired
    private UcesnikRepository ucesnikRepository;

    @Override
    public void addUcesnik(UcesnikEntity ucesnik) {
        ucesnikRepository.save(ucesnik);
    }

    @Override
    public List<UcesnikEntity> getAllUcesnici() {
        return ucesnikRepository.findAll();
    }

    @Override
    public void deleteUcesnik(Integer id) {
        ucesnikRepository.deleteById(id);
    }

    @Override
    public void updateUcesnik(Integer id, UcesnikEntity ucesnik) {
        ucesnikRepository.findById(id)
                .ifPresent(noviUcesnik -> {
                    noviUcesnik.setIme(ucesnik.getIme());
                    noviUcesnik.setPrezime(ucesnik.getPrezime());
                    noviUcesnik.setJmbg(ucesnik.getJmbg());
                    noviUcesnik.setEmail(ucesnik.getEmail());
                    noviUcesnik.setBrojGodina(ucesnik.getBrojGodina());
                    noviUcesnik.setGrad(ucesnik.getGrad());

                    ucesnikRepository.save(noviUcesnik);
                });
    }
}
