package it.epicode.entity;

import it.epicode.enums.Genere;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@NamedQuery(name = "Trova_tutto_Concerto", query = "SELECT a FROM Concerto a")
public class Concerto extends Evento{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Genere genere;
    private boolean inStreaming;
}
