package com.modelo.model;

import java.util.Objects;

public class Gato {
	
	private String nome;
	private String cor;
	private String idade;

	
	/* Construtor criado com Crtl+3, digitando construt para
	 *  identificar o construtor e não selecionado nenhum item (vázio) */ 
	public Gato() {
		/* super(); linha apagada com o comando Crtl+D */
	}

	
	/* Construtor criado com Crtl+3, digitando construt para
	 *  identificar o construtor e selecionado todos os itens */ 
	public Gato(String nome, String cor, String idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}

	
	/* Construtor criado com Crtl+3, digitando get, escolher Generat Getters and Setter
	 *  identificado no construtor e selecionado todos os itens */ 
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	
	/* Construtor criado com Crtl+3, digitando equals, escolher Generat Equals and HashCode
	 *  identificado no construtor e selecionado todos os itens */ 
	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}

	
	/* Construtor criado com Crtl+3, digitando tostring, escolher Generat Getters and Setter
	 *  identificado no construtor e selecionado todos os itens */ 
	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
	}


	
	
	
	
	
	
	
	

}
