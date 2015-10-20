package br.com.webipede.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Consumidor {
	
	@Id
	@GeneratedValue
	private int idConsumidor;
	
	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	private String usuario;
	private String senha;
	
	public int getIdConsumidor() {
		return idConsumidor;
	}
	public void setIdConsumidor(int idConsumidor) {
		this.idConsumidor = idConsumidor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
