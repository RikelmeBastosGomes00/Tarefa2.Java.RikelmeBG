package atividades;

public class Porta {

	public Boolean aberta;

	public String cor;

	public Double dimensaox;

	public Double dimensaoy;

	public Double dimensaoz;


	public Porta(Boolean aberta, String cor, Double dimensaox,Double dimensaoy, Double dimensaoz) {

		this.aberta = aberta;

		this.cor = cor;

		this.dimensaox = dimensaox;

		this.dimensaoy = dimensaoy;

		this.dimensaoz = dimensaoz;
	}

	public void abre () {

		this.aberta = true;
	}

	public void fecha () {

		this.aberta = false;
	}

	public void pinta(String cor) {

		this.cor = cor;
	}

	public Boolean estaAberta() {

		return this.aberta; 
	}

}
