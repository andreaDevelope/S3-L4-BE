package it.epicode.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NamedQuery(name = "Trova_tutto_GaraDiAtletica", query = "SELECT a FROM GaraDiAtletica a")
public class GaraDiAtletica {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    List<Persona> setAtleti = new ArrayList<>();
    Persona vincitore;


}
