package atividades;

public class TestadorPessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Rikelme Bastos",18);

		System.out.println("idade da pessoa 1: " + p1.idade);

		p1.fazAniversario(p1.idade);
		p1.fazAniversario(p1.idade);
		p1.fazAniversario(p1.idade);
		p1.fazAniversario(p1.idade);
		p1.fazAniversario(p1.idade);

		System.out.println("Nome da pessoa 1: " + p1.nome);
		System.out.println("idade da pessoa 1 após usar o método: " + p1.idade);
	}
}
