package it.epicode.dao;

import it.epicode.entity.Location;
import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LocationDAO {
    EntityManager em;

    public void save(Location l){
        em.getTransaction().begin();
        em.persist(l);
        em.getTransaction().commit();
    }
}
