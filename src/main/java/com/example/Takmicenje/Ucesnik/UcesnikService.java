package com.example.Takmicenje.Ucesnik;

import java.util.List;

public interface UcesnikService {
    void addUcesnik(UcesnikEntity ucesnik);

    List<UcesnikEntity> getAllUcesnici();


    void deleteUcesnik(Integer id);

    void updateUcesnik(Integer id, UcesnikEntity ucesnik);
}
