package com.modelo;

import com.modelo.model.Gato;

public class PrimeiroPrograma {

	private static final String Sysout = null;
	public static void main(String[] args) {
		/*int a = 2;
		int b = 3;
		System.out.println("Hello Word!! " + (a+b));*/
		
		/* primeiro digite o comando, depois, para importar, digite
		 * Crtl+Shift+O e então irá ocorrer a importação da classe.*/
		Gato gato = new Gato();
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);
	}
}

class Livros {
	private String nome;
	private String npag;
}