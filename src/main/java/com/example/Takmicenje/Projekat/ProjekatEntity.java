package com.example.Takmicenje.Projekat;

import com.example.Takmicenje.Projekat_sponzor.Projekat_Sponzor_Entity;
import com.example.Takmicenje.Sponzor.SponzorEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(schema = "takmicenja", name = "projekti")
public class ProjekatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String naziv, opis, datum;
    private double cijena;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "projekat_sponzor", joinColumns = {@JoinColumn(name = "projekat_id")},
    inverseJoinColumns = {@JoinColumn(name = "sponzor_id")})
    private Set<SponzorEntity> sponzori = new HashSet<>();

    @OneToMany(targetEntity = Projekat_Sponzor_Entity.class, mappedBy = "projekat")
    private Set<Projekat_Sponzor_Entity> projekat_sponzors = new HashSet<>();

    public ProjekatEntity() {
    }

    public ProjekatEntity(Integer id, String naziv, String opis, String datum, double cijena, Set<SponzorEntity> sponzori) {
        this.id = id;
        this.naziv = naziv;
        this.opis = opis;
        this.datum = datum;
        this.cijena = cijena;
        this.sponzori = sponzori;
    }

    public ProjekatEntity(String naziv, String opis, String datum, double cijena, Set<SponzorEntity> sponzori) {
        this.naziv = naziv;
        this.opis = opis;
        this.datum = datum;
        this.cijena = cijena;
        this.sponzori = sponzori;
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

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public double getCijena() {
        return cijena;
    }

    public void setCijena(double cijena) {
        this.cijena = cijena;
    }

    public Set<SponzorEntity> getSponzori() {
        return sponzori;
    }

    public void setSponzori(Set<SponzorEntity> sponzori) {
        this.sponzori = sponzori;
    }

    @Override
    public String toString() {
        return "ProjekatEntity{" +
                "id=" + id +
                ", naziv='" + naziv + '\'' +
                ", opis='" + opis + '\'' +
                ", datum='" + datum + '\'' +
                ", cijena=" + cijena +
                ", sponzori=" + sponzori +
                '}';
    }
}