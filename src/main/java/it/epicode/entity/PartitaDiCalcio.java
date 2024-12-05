package it.epicode.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@NamedQuery(name="Trova_tutto_PartitaDiCalcio", query="SELECT a FROM PartitaDiCalcio a")
public class PartitaDiCalcio extends Evento {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String squadraDiCasa;
    private String squadraOspite;
    private String squadraVincente;
    private int numeroGoalSquadraDiCasa;
    private int numeroGoalSquadraOspite;
}
