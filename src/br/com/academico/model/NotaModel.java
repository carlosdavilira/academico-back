package br.com.academico.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity(name="nota")
public class NotaModel {
@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer nota_id;
private Integer aluno_id;
private double  valor;


public Integer getNota_id() {
	return nota_id;
}
public void setNota_id(Integer nota_id) {
	this.nota_id = nota_id;
}
public Integer getAluno_id() {
	return aluno_id;
}
public void setAluno_id(Integer aluno_id) {
	this.aluno_id = aluno_id;
}
public double getValor() {
	return valor;
}
public void setValor(double valor) {
	this.valor = valor;
}


}
