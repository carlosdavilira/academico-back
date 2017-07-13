package br.com.academico.model;

public class DisciplinaModel {

	private Integer disciplina_id;
	private String descricao;
	private String cargaHoraria;
	private String ementa;
	private String bibliografia;
	private String pre_requisitos;
	
	
	public Integer getDisciplina_id() {
		return disciplina_id;
	}
	public void setDisciplina_id(Integer disciplina_id) {
		this.disciplina_id = disciplina_id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public String getEmenta() {
		return ementa;
	}
	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}
	public String getBibliografia() {
		return bibliografia;
	}
	public void setBibliografia(String bibliografia) {
		this.bibliografia = bibliografia;
	}
	public String getPre_requisitos() {
		return pre_requisitos;
	}
	public void setPre_requisitos(String pre_requisitos) {
		this.pre_requisitos = pre_requisitos;
	}
	
	
	
}
