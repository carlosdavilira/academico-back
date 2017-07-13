package br.com.academico.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity(name="aula")
public class AulaModel {
@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer aula_id;
private String tipo;
private Integer sala_id;


public Integer getAula_id() {
	return aula_id;
}
public void setAula_id(Integer aula_id) {
	this.aula_id = aula_id;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public Integer getSala_id() {
	return sala_id;
}
public void setSala_id(Integer sala_id) {
	this.sala_id = sala_id;
}




}
