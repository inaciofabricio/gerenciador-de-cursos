package br.com.alura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		
		alunos.add("José da Silva");
		alunos.add("Manoel de Almeida");
		alunos.add("Maria José");
		alunos.add("Ricardo da Silva");
		alunos.add("Chico de Almeida");
		alunos.add("Silvio José");
		
		System.out.println(alunos);
		System.out.println();
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		System.out.println();
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		System.out.println();
		
		boolean joaoMatriculado = alunos.contains("Joao Rafeal");
		System.out.println(joaoMatriculado);
		System.out.println();
		
		alunos.remove("Ricardo da Silva");
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		System.out.println();
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
		alunosEmLista.forEach(aluno -> {
			System.out.println(aluno);
		});
		System.out.println();
		

	}

}
