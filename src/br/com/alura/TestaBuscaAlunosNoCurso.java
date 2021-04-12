package br.com.alura;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando Java", "Jos� Silva");
		
		javaColecoes.adiciona(new Aula("Revisando ArrayList", 25));
		javaColecoes.adiciona(new Aula("Listas de objetos", 13));
		javaColecoes.adiciona(new Aula("Relacionamento de lista e objetos", 15));
		
		Aluno a1 = new Aluno("Jos� da Silva", 0001);
		Aluno a2 = new Aluno("Maria da Oliveira", 0002);
		Aluno a3 = new Aluno("Chico Manoel", 0003);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Quem � o aluno com Matricula 0002?");
		Aluno aluno = javaColecoes.buscaMatriculado(0004);
		System.out.println(aluno);

	}

}
