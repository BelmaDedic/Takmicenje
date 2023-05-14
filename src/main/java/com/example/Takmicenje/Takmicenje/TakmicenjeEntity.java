package com.example.Takmicenje.Takmicenje;

import com.example.Takmicenje.Nagrada.NagradaEntity;
import com.example.Takmicenje.Ucesnik.UcesnikEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jdk.jfr.Name;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(schema = "takmicenja", name = "takmicenje")
public class TakmicenjeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    private String gradOdrzavanja, datumOdrzavanja;
    private Integer brojUcesnika;

    @JsonIgnore
    @OneToMany(targetEntity = UcesnikEntity.class, mappedBy = "takmicenje")
    private List<UcesnikEntity> ucesnici = new ArrayList<>();

    @OneToMany(targetEntity = NagradaEntity.class, mappedBy = "takmicenje")
    private List<NagradaEntity> nagrade = new ArrayList<>();

    public TakmicenjeEntity() {
    }

    public TakmicenjeEntity(Integer id, String gradOdrzavanja, String datumOdrzavanja, Integer brojUcesnika) {
        this.id = id;
        this.gradOdrzavanja = gradOdrzavanja;
        this.datumOdrzavanja = datumOdrzavanja;
        this.brojUcesnika = brojUcesnika;
    }

    public TakmicenjeEntity(String gradOdrzavanja, String datumOdrzavanja, Integer brojUcesnika) {
        this.gradOdrzavanja = gradOdrzavanja;
        this.datumOdrzavanja = datumOdrzavanja;
        this.brojUcesnika = brojUcesnika;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGradOdrzavanja() {
        return gradOdrzavanja;
    }

    public void setGradOdrzavanja(String gradOdrzavanja) {
        this.gradOdrzavanja = gradOdrzavanja;
    }

    public String getDatumOdrzavanja() {
        return datumOdrzavanja;
    }

    public List<UcesnikEntity> getUcesnici() {
        return ucesnici;
    }

    public void setUcesnici(List<UcesnikEntity> ucesnici) {
        this.ucesnici = ucesnici;
    }

    public void setDatumOdrzavanja(String datumOdrzavanja) {
        this.datumOdrzavanja = datumOdrzavanja;
    }

    public Integer getBrojUcesnika() {
        return brojUcesnika;
    }

    public void setBrojUcesnika(Integer brojUcesnika) {
        this.brojUcesnika = brojUcesnika;
    }

    @Override
    public String toString() {
        return "TakmicenjeEntity{" +
                "id=" + id +
                ", gradOdrzavanja='" + gradOdrzavanja + '\'' +
                ", datumOdrzavanja='" + datumOdrzavanja + '\'' +
                ", brojUcesnika=" + brojUcesnika +
                '}';
    }
}
