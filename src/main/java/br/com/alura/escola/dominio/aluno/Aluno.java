package br.com.alura.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	private CPF cpf; 
	private String nome;
	private Email email;
	
	private List<Telefone> telefones = new ArrayList<>();
	
	public Aluno(CPF cpf, String nome, Email email) {
		this.cpf = cpf;
		this.email = email;
		this.nome = nome;
	}
	
	public void adicionarTelefone(String ddd, String numero) {
		this.telefones.add(new Telefone(ddd, numero));
	}

	public String getCpf() {
		return cpf.getNumero();
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email.getEndereco();
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
}
