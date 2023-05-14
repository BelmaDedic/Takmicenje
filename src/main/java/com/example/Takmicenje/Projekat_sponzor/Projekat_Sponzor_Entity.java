package com.example.Takmicenje.Projekat_sponzor;

import com.example.Takmicenje.Projekat.ProjekatEntity;
import com.example.Takmicenje.Sponzor.SponzorEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(schema = "takmicenja", name = "projekat_sponzors")
public class Projekat_Sponzor_Entity {
    @EmbeddedId
    Projekat_sponzor id;

    @ManyToOne
    @MapsId("projekatId")
    @JoinColumn(name = "projekat_id")
    ProjekatEntity projekat;

    @ManyToOne
    @MapsId("sponzorId")
    @JoinColumn(name = "sponzor_id")
    SponzorEntity sponzor;

    public Projekat_Sponzor_Entity() {
    }

    public Projekat_Sponzor_Entity(Projekat_sponzor id, ProjekatEntity projekat, SponzorEntity sponzor) {
        this.id = id;
        this.projekat = projekat;
        this.sponzor = sponzor;
    }

    public Projekat_Sponzor_Entity(ProjekatEntity projekat, SponzorEntity sponzor) {
        this.projekat = projekat;
        this.sponzor = sponzor;
    }

    public Projekat_sponzor getId() {
        return id;
    }

    public void setId(Projekat_sponzor id) {
        this.id = id;
    }

    public ProjekatEntity getProjekat() {
        return projekat;
    }

    public void setProjekat(ProjekatEntity projekat) {
        this.projekat = projekat;
    }

    public SponzorEntity getSponzor() {
        return sponzor;
    }

    public void setSponzor(SponzorEntity sponzor) {
        this.sponzor = sponzor;
    }

    @Override
    public String toString() {
        return "Projekat_Sponzor_Entity{" +
                "id=" + id +
                ", projekat=" + projekat +
                ", sponzor=" + sponzor +
                '}';
    }
}
