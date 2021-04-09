package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando Java", "José Silva");
				
		javaColecoes.adiciona(new Aula("Revisando ArrayList", 25));
		javaColecoes.adiciona(new Aula("Listas de objetos", 13));
		javaColecoes.adiciona(new Aula("Relacionamento de lista e objetos", 15));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		
		System.out.println(aulasImutaveis);
		System.out.println();
		
		List<Aula> aulasMutaveis = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulasMutaveis);
		System.out.println(aulasMutaveis);
		System.out.println();
		
		System.out.println(javaColecoes.getTempoTotal());
		System.out.println();
		
		System.out.println(javaColecoes);
	}

}
