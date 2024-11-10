package atividades;

public class TestadorPorta {

	public static void main(String[] args) {

		Porta prt1 = new Porta(false,"Preto",3.0,1.5,2.0);

		prt1.abre();

		System.out.println(prt1.aberta);

		System.out.println(prt1.cor);

		System.out.println(prt1.dimensaox);

		System.out.println(prt1.dimensaoy);

		System.out.println(prt1.dimensaoz);

		prt1.cor = "Azul";

		prt1.dimensaox = 3.5;

		prt1.dimensaoy = 2.4;

		prt1.dimensaoz = 2.5;

		prt1.fecha();
		// teste 2
		System.out.println();

		System.out.println("A porta está aberta: " + prt1.estaAberta());

		System.out.println(prt1.cor);

		System.out.println(prt1.dimensaox);

		System.out.println(prt1.dimensaoy);

		System.out.println(prt1.dimensaoz);

	}
}
