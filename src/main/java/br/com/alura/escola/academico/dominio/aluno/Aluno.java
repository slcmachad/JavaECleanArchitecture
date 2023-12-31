package br.com.alura.escola.academico.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.escola.shared.dominio.CPF;

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
		if(telefones.size() == 2) {
			throw new IllegalArgumentException("Numero maximo de telefones já atingido");
		}
		this.telefones.add(new Telefone(ddd, numero));
	}

	public CPF getCpf() {
		return cpf;
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
