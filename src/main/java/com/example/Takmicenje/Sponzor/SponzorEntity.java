package com.example.Takmicenje.Sponzor;

import com.example.Takmicenje.Projekat.ProjekatEntity;
import com.example.Takmicenje.Projekat_sponzor.Projekat_Sponzor_Entity;
import com.example.Takmicenje.Projekat_sponzor.Projekat_sponzor;
import com.example.Takmicenje.Ucesnik.UcesnikEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(schema = "takmicenja", name = "sponzori")
public class SponzorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String naziv, moto;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },
            mappedBy = "sponzori")
    @JsonIgnore
    private Set<ProjekatEntity> projekti = new HashSet<>();

    @OneToMany(targetEntity = Projekat_Sponzor_Entity.class, mappedBy = "sponzor")
    private Set<Projekat_Sponzor_Entity> projekat_sponzors = new HashSet<>();

    public SponzorEntity() {
    }

    public SponzorEntity(Integer id, String naziv, String moto, Set<ProjekatEntity> projekti) {
        this.id = id;
        this.naziv = naziv;
        this.moto = moto;
        this.projekti = projekti;
    }

    public SponzorEntity(String naziv, String moto, Set<ProjekatEntity> projekti) {
        this.naziv = naziv;
        this.moto = moto;
        this.projekti = projekti;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getMoto() {
        return moto;
    }

    public void setMoto(String moto) {
        this.moto = moto;
    }

    public Set<ProjekatEntity> getProjekti() {
        return projekti;
    }

    public void setProjekti(Set<ProjekatEntity> projekti) {
        this.projekti = projekti;
    }

    @Override
    public String toString() {
        return "SponzorEntity{" +
                "id=" + id +
                ", naziv='" + naziv + '\'' +
                ", moto='" + moto + '\'' +
                ", projekti=" + projekti +
                '}';
    }
}
