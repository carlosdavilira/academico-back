package br.com.academico;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.academico.model.CursoModel;
@Path("professor")
public class ProfessorServico {
	@POST
	@Path("/insert")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String inserirCurso(CursoModel curso)
	{
		
		return null;
	}

	@POST
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String AtualizarCurso(CursoModel curso)
	{
		return null;
	}

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public CursoModel getCurso()
	{
		/*CursoModel curso =  new CursoDao().getCurso(1); // teste
		curso.setNomeCurso(curso.getNomeCurso());
		*/
		

		
		return null;
	}

	@POST
	@Path("/list")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<CursoModel> listarDiscipulos() throws SQLException
	{
				
		EntityManagerFactory entityManagerFactory = Persistence
	            .createEntityManagerFactory("Academico");

		EntityManager em = entityManagerFactory.createEntityManager();
		//jpa = new JPAUtil();	
		//em = jpa.getEntityManager();
		em.getTransaction().begin();
		CursoModel curso = em.find(CursoModel.class, 1);
		em.getTransaction().commit();
		em.close();

		
		
		return null;
	}

	@POST
	@Path("/delete")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String ApagarDiscipulo(CursoModel discipulo)
	{
		return null;
	}
}
