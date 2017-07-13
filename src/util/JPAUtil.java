package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	public  EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MisFinance");
	
	public  EntityManager getEntityManager(){
		return entityManagerFactory.createEntityManager();
	}
}
