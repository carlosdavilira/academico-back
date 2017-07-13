package br.com.academico.model;

public class DepartamentoModel {

	private Integer departamento_id;
	private String nome;
	private String descricao;
	private Integer professor_id;
	private Integer contato_id;
	
	
	public Integer getDepartamento_id() {
		return departamento_id;
	}
	public void setDepartamento_id(Integer departamento_id) {
		this.departamento_id = departamento_id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	public Integer getContato_id() {
		return contato_id;
	}
	public void setContato_id(Integer contato_id) {
		this.contato_id = contato_id;
	}
	
	
	
	
}
