package br.com.academico.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.academico.model.CursoModel;
import util.JPAUtil;

public class CursoDao {

	private JPAUtil jpa;	
	//private EntityManager em;

	public CursoDao(){
		


	}


	public static CursoModel getCurso(int id){
		EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("Academico");

		EntityManager em = entityManagerFactory.createEntityManager();
		//jpa = new JPAUtil();	
		//em = jpa.getEntityManager();
		em.getTransaction().begin();
		CursoModel curso = em.find(CursoModel.class, id);
		em.getTransaction().commit();
		em.close();
		return curso;
	}
	
	
}
