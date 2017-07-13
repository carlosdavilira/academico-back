package br.com.academico.model;

public class AlunoModel {
private Integer aluno_id;
private String nomes;
private String telefone;
private String celular;
private Integer curso_id;
private Integer historico;


public Integer getAluno_id() {
	return aluno_id;
}
public void setAluno_id(Integer aluno_id) {
	this.aluno_id = aluno_id;
}
public String getNomes() {
	return nomes;
}
public void setNomes(String nomes) {
	this.nomes = nomes;
}
public String getTelefone() {
	return telefone;
}
public void setTelefone(String telefone) {
	this.telefone = telefone;
}
public String getCelular() {
	return celular;
}
public void setCelular(String celular) {
	this.celular = celular;
}
public Integer getCurso_id() {
	return curso_id;
}
public void setCurso_id(Integer curso_id) {
	this.curso_id = curso_id;
}
public Integer getHistorico() {
	return historico;
}
public void setHistorico(Integer historico) {
	this.historico = historico;
}



}
