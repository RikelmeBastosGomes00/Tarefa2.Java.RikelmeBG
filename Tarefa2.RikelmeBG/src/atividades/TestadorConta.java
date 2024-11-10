package atividades;

public class TestadorConta {
	public static void main(String[] args) {

		
		Data dt1 = new Data(19,03,2023);
		Conta c1 = new Conta("Rikelme",8975230,"Velha Maraba",250.0,dt1);
		Conta c2 = new Conta("Rikelme",8975230,"Velha Maraba",250.0,dt1);

		c1.depositar(100.0);

		c1.sacar(250.0);

		c2.depositar(100.0);

		c2.sacar(250.0);

		System.out.println(c1.saldo);

		System.out.println(c1.calculaRendimento());
		
		System.out.println(c1.recuperaDadosParaImpressao());
		
		// Não são iguais pois estão em endereços de memória diferente então são objetos diferentes
		
		if (c1 == c2) {
		
			System.out.println("iguais.");
		}
		else {
			
			System.out.println("diferentes.");
		}

		c2 = c1; // Como a conta2 = c2 recebe c1 que é a conta 1 as duas terão o mesmo endereço de memória então serão iguais	
		
		if (c1 == c2) {
			
			System.out.println("iguais.");
		}
		else {
			
			System.out.println("diferentes.");
		}
		
		System.out.println(c1.dataAbertura.DataFormatadaString());
	}
}
