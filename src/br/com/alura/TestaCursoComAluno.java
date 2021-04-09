package br.com.alura;

public class TestaCursoComAluno {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando Java", "José Silva");
		
		javaColecoes.adiciona(new Aula("Revisando ArrayList", 25));
		javaColecoes.adiciona(new Aula("Listas de objetos", 13));
		javaColecoes.adiciona(new Aula("Relacionamento de lista e objetos", 15));
		
		Aluno a1 = new Aluno("José da Silva", 0001);
		Aluno a2 = new Aluno("Maria da Oliveira", 0002);
		Aluno a3 = new Aluno("Chico Manoel", 0003);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Alunos:");
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});

	}

}
