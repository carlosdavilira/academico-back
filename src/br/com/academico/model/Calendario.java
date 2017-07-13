package br.com.academico.model;

public class Calendario {
private Integer calendarioa_id;
private String descricao;
private String semestre;
private String data_inicio;
private String data_fim;
private String tipo;



public Integer getCalendarioa_id() {
	return calendarioa_id;
}
public void setCalendarioa_id(Integer calendarioa_id) {
	this.calendarioa_id = calendarioa_id;
}
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
public String getSemestre() {
	return semestre;
}
public void setSemestre(String semestre) {
	this.semestre = semestre;
}
public String getData_inicio() {
	return data_inicio;
}
public void setData_inicio(String data_inicio) {
	this.data_inicio = data_inicio;
}
public String getData_fim() {
	return data_fim;
}
public void setData_fim(String data_fim) {
	this.data_fim = data_fim;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}



}
