package atividades;

public class TestadorCasa {
	public static void main(String[] args) {

		Porta porta1 = new Porta(false,"Preto",3.0,1.5,2.0);
		Porta porta2 = new Porta(true,"Branco",3.5,1.0,2.4);
		Porta porta3 = new Porta(true,"Vermelho",4.0,1.8,2.7);
		Pessoa pessoa1 = new Pessoa("Rikelme Bastos Gomes",18);

		Casa casa = new Casa("Cinza",porta1,porta2,porta3,pessoa1);
		//testando casa sem alterações 
		System.out.println(casa.cor);

		System.out.println(casa.porta1.cor);

		System.out.println(casa.porta2.aberta);

		System.out.println(casa.porta3.dimensaox);

		System.out.println("Nome do antigo proprietário:"+ casa.proprietario.nome);

		System.out.println("Quantidade de portas abertas: " + casa.qtdPortasEstaoAbertas());
		//testando as alterações

		casa.porta1.abre();

		casa.porta2.fecha();

		casa.porta3.fecha();

		Pessoa pessoa2 = new Pessoa("Najua Khaled",20);

		casa.alteraProprietario(pessoa2);

		System.out.println("Nome do novo proprietário: " + casa.proprietario.nome);
		System.out.println("Quantidade de portas abertas: " + casa.qtdPortasEstaoAbertas());


	}
}



