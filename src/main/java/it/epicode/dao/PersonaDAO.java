package it.epicode.dao;

import it.epicode.entity.Persona;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class PersonaDAO {
    private EntityManager em;

    public void save(Persona oggetto) {
        em.getTransaction().begin();
        em.persist(oggetto);
        em.getTransaction().commit();
    }

    public Persona findById(Long id) {
        return em.find(Persona.class, id);
    }

    public List<Persona> findAll() {
        return em.createNamedQuery("Trova_tutto_Persona", Persona.class).getResultList();
    }

    public void update(Persona oggetto) {
        em.getTransaction().begin();
        em.merge(oggetto);
        em.getTransaction().commit();
    }

    public void delete(Persona oggetto) {
        em.getTransaction().begin();
        em.remove(oggetto);
        em.getTransaction().commit();
    }


}
