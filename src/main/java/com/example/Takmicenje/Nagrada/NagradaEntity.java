package com.example.Takmicenje.Nagrada;

import com.example.Takmicenje.Enum.NagradaEnum;
import com.example.Takmicenje.Takmicenje.TakmicenjeEntity;

import javax.persistence.*;

@Entity
@Table(schema = "takmicenja", name = "nagrada")
public class NagradaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private NagradaEnum nagrada;

    @ManyToOne
    @PrimaryKeyJoinColumn(name = "id", referencedColumnName = "id")
    private TakmicenjeEntity takmicenje;

    public TakmicenjeEntity getTakmicenje() {
        return takmicenje;
    }

    public void setTakmicenje(TakmicenjeEntity takmicenje) {
        this.takmicenje = takmicenje;
    }

    public NagradaEntity() {
    }

    public NagradaEntity(Integer id, NagradaEnum nagrada) {
        this.id = id;
        this.nagrada = nagrada;
    }

    public NagradaEntity(NagradaEnum nagrada) {
        this.nagrada = nagrada;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public NagradaEnum getNagrada() {
        return nagrada;
    }

    public void setNagrada(NagradaEnum nagrada) {
        this.nagrada = nagrada;
    }

    @Override
    public String toString() {
        return "NagradaEntity{" +
                "id=" + id +
                ", nagrada=" + nagrada +
                '}';
    }
}