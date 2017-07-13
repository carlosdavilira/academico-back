package br.com.academico.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity(name="frequencia")
public class FrequenciaModel {
@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer frequencia_id;
private Integer aula_id;
private Integer aluno_id;
private String data_;
private String presente;


public Integer getFrequencia_id() {
	return frequencia_id;
}
public void setFrequencia_id(Integer frequencia_id) {
	this.frequencia_id = frequencia_id;
}
public Integer getAula_id() {
	return aula_id;
}
public void setAula_id(Integer aula_id) {
	this.aula_id = aula_id;
}
public Integer getAluno_id() {
	return aluno_id;
}
public void setAluno_id(Integer aluno_id) {
	this.aluno_id = aluno_id;
}
public String getData_() {
	return data_;
}
public void setData_(String data_) {
	this.data_ = data_;
}
public String getPresente() {
	return presente;
}
public void setPresente(String presente) {
	this.presente = presente;
}



}
