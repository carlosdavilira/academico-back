package br.com.academico.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity(name="avaliacao")
public class AvaliacaoModel {
@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer avaliacao_id;
private Integer curso_id;
private String tipo;
private String data;


public Integer getAvaliacao_id() {
	return avaliacao_id;
}
public void setAvaliacao_id(Integer avaliacao_id) {
	this.avaliacao_id = avaliacao_id;
}
public Integer getCurso_id() {
	return curso_id;
}
public void setCurso_id(Integer curso_id) {
	this.curso_id = curso_id;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getData() {
	return data;
}
public void setData(String data) {
	this.data = data;
}


}
