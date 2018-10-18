import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import de.data.GameSession;
import de.data.LogEntry;

public class Main {

	public static void main(String[] args) {

//		LogEntry e1 = new LogEntry(new Date(), "Erster Eintrag");
//		LogEntry e2 = new LogEntry(new Date(), "Zweiter Eintrag");
//		LogEntry e3 = new LogEntry(new Date(), "Dritter Eintrag");
		
		GameSession gs;
		
		List<GameSession> gsList = new ArrayList<>();
		
		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-example");
		
		EntityManager em = factory.createEntityManager();
		
		TypedQuery<GameSession> q = em.createQuery("SELECT a FROM Gamesession a where a.sessionName = 'Spiel 1'", GameSession.class);
//		int result = q.executeUpdate();
		gsList = q.getResultList();

		for (GameSession gameSession : gsList) {
			System.out.println(gameSession);
		}
//		gs = em.find(GameSession.class, new Long(26));

		
//		System.out.println("----------------------\n" + gs + "\n-----------------------------");
//		em.getTransaction().begin();
//		em.persist(gs1);
//		em.persist(gs2);
//		em.persist(gs3);
//		em.getTransaction().commit();
//		em.close();
		
		System.exit(0);
	}

}
