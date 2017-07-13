package br.com.academico.model;

import java.sql.Date;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="curso")
public class CursoModel {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer curso_id;
	
	private String nomeCurso;
	
	private String descricao;
	
	private Integer professor_id;
	private Integer departamento_id;
	public Integer getCurso_id() {
		return curso_id;
	}
	public void setCurso_id(Integer curso_id) {
		this.curso_id = curso_id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getProfessor_id() {
		return professor_id;
	}
	public void setProfessor_id(Integer professor_id) {
		this.professor_id = professor_id;
	}
	public Integer getDepartamento_id() {
		return departamento_id;
	}
	public void setDepartamento_id(Integer departamento_id) {
		this.departamento_id = departamento_id;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	
	
	
	
	
	

		
}
