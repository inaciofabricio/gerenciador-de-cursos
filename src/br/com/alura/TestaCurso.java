package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando Java", "José Silva");
		
		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas);
		System.out.println();
		
//		aulas.add(new Aula("Aula inicial", 21));
//		javaColecoes.getAulas().add(new Aula("Aula inicial", 21));
		System.out.println(aulas);
		System.out.println();
		
		System.out.println(javaColecoes.getAulas());
		System.out.println();
		
		System.out.println(aulas == javaColecoes.getAulas());
		System.out.println();

		javaColecoes.adiciona(new Aula("Revisando ArrayList", 25));
		javaColecoes.adiciona(new Aula("Listas de objetos", 13));
		javaColecoes.adiciona(new Aula("Relacionamento de lista e objetos", 15));
		
		System.out.println(javaColecoes.getAulas());
		System.out.println();
	}

}
