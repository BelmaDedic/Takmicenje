package com.example.Takmicenje.Takmicenje;

import java.util.List;

public interface TakmicenjeService {
    void addTakmicenje(TakmicenjeEntity takmicenje);

    List<TakmicenjeEntity> getAllTakmicenja();

    void deleteTakmicenje(Integer id);

    void updateTakmicenje(Integer id, TakmicenjeEntity takmicenje);
}
