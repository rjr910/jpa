import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import de.data.LogEntry;

public class Main {

	public static void main(String[] args) {

		LogEntry e1 = new LogEntry(new Date(), "Erster Eintrag");
		LogEntry e2 = new LogEntry(new Date(), "Zweiter Eintrag");
		LogEntry e3 = new LogEntry(new Date(), "Dritter Eintrag");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa-example");
		
		EntityManager em = factory.createEntityManager();
		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		em.close();
		
		
	}

}
