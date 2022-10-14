package com.hypeadvice.demo.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;


@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min = 3, message = "O nome deve ter no mínimo 3 carateres")
	private String nome;
	
	@CPF(message = "CPF inválido")
	private String cpf; 
	
	@NotNull
	@Size (max = 1, message = "Escolha uma opção")
	private String curso;
	
	@Email(message = "Email inválido")
	private String email;
		
	@NotEmpty(message = "A senha deve ser informada")
	@Size(min = 3, message = "A senha deve ter no mínimo 3 caracteres")
	private String password;	
	
	@NotEmpty(message = "O login deve ser informado")
	@Size(min = 4, message = "O login deve ter no mínimo 4 caracteres")
	private String login;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	

	
	
	
}