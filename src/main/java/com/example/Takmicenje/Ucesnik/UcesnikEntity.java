package com.example.Takmicenje.Ucesnik;

import com.example.Takmicenje.Takmicenje.TakmicenjeEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(schema = "takmicenja", name = "ucesnik")
public class UcesnikEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String jmbg, ime, prezime, grad, email;
    private Integer brojGodina;

    @ManyToOne
    @PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
    private TakmicenjeEntity takmicenje;

    public TakmicenjeEntity getTakmicenje() {
        return takmicenje;
    }

    public void setTakmicenje(TakmicenjeEntity takmicenje) {
        this.takmicenje = takmicenje;
    }

    public UcesnikEntity() {
    }

    public UcesnikEntity(Integer id, String jmbg, String ime, String prezime, String grad, String email,
                         Integer brojGodina) {
        this.id = id;
        this.jmbg = jmbg;
        this.ime = ime;
        this.prezime = prezime;
        this.grad = grad;
        this.email = email;
        this.brojGodina = brojGodina;
    }

    public UcesnikEntity(String jmbg, String ime, String prezime, String grad, String email, Integer brojGodina) {
        this.jmbg = jmbg;
        this.ime = ime;
        this.prezime = prezime;
        this.grad = grad;
        this.email = email;
        this.brojGodina = brojGodina;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getBrojGodina() {
        return brojGodina;
    }

    public void setBrojGodina(Integer brojGodina) {
        this.brojGodina = brojGodina;
    }

    @Override
    public String toString() {
        return "Ucesnik{" +
                "id=" + id +
                ", jmbg='" + jmbg + '\'' +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", grad='" + grad + '\'' +
                ", email='" + email + '\'' +
                ", brojGodina=" + brojGodina +
                '}';
    }
}
