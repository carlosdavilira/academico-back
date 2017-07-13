package br.com.academico.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity(name="historico")
public class HistoricoModel {
@Id @GeneratedValue(strategy=GenerationType.IDENTITY)	
private Integer historico_id;
private Integer aluno_id;
private String data_inicio;
private String data_termino;
private String diploma;
private Integer disciplina_id;

public Integer getHistorico_id() {
	return historico_id;
}
public void setHistorico_id(Integer historico_id) {
	this.historico_id = historico_id;
}
public Integer getAluno_id() {
	return aluno_id;
}
public void setAluno_id(Integer aluno_id) {
	this.aluno_id = aluno_id;
}
public String getData_inicio() {
	return data_inicio;
}
public void setData_inicio(String data_inicio) {
	this.data_inicio = data_inicio;
}
public String getData_termino() {
	return data_termino;
}
public void setData_termino(String data_termino) {
	this.data_termino = data_termino;
}
public String getDiploma() {
	return diploma;
}
public void setDiploma(String diploma) {
	this.diploma = diploma;
}
public Integer getDisciplina_id() {
	return disciplina_id;
}
public void setDisciplina_id(Integer disciplina_id) {
	this.disciplina_id = disciplina_id;
}



}
