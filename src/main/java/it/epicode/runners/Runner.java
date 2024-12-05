package it.epicode.runners;

import it.epicode.dao.EventoDao;
import it.epicode.dao.LocationDAO;
import it.epicode.dao.PartecipazioneDao;
import it.epicode.entity.Evento;
import it.epicode.entity.Location;
import it.epicode.entity.Partecipazione;
import it.epicode.enums.TipoEvento;
import jakarta.persistence.EntityManager;

import java.time.LocalDate;


public class Runner {
    public static void run(EntityManager em){
        Evento e = new Evento();
        Location l = new Location();

        Partecipazione p = new Partecipazione();
        e.setDataEvento(LocalDate.now());
        e.setDescrizione("ciao");
        e.setLocation(l);
        e.setTipoEvento(TipoEvento.PRIVATO);
        e.setTitolo("Danilo Studia");
        e.getPartecipazioni().add(p);
        EventoDao ed = new EventoDao(em);
        PartecipazioneDao pd = new PartecipazioneDao(em);
        LocationDAO ld = new LocationDAO(em);


        pd.save(p);
        ld.save(l);

        ed.save(e);



    }
}
