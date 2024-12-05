package it.epicode.dao;

import it.epicode.entity.Partecipazione;
import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PartecipazioneDao {
    EntityManager em;

    public void save(Partecipazione p){
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
    }
}
