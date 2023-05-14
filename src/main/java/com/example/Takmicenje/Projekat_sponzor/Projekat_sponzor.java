package com.example.Takmicenje.Projekat_sponzor;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Projekat_sponzor implements Serializable {
    @Column(name = "projekat_id")
    Integer projekatId;

    @Column(name = "sponzor_id")
    Integer sponzorId;
}
