package br.com.academico.model;

public class ContatoModel {
private Integer contato_id;
private String telefone;
private String fax;
private String email;
private String homepage;
public Integer getContato_id() {
	return contato_id;
}
public void setContato_id(Integer contato_id) {
	this.contato_id = contato_id;
}
public String getTelefone() {
	return telefone;
}
public void setTelefone(String telefone) {
	this.telefone = telefone;
}
public String getFax() {
	return fax;
}
public void setFax(String fax) {
	this.fax = fax;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getHomepage() {
	return homepage;
}
public void setHomepage(String homepage) {
	this.homepage = homepage;
}



}
