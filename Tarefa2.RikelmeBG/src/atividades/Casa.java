package atividades;

public class Casa {

	String cor;

	public Porta porta1,porta2,porta3; 

	public Pessoa proprietario;

	public Casa(String cor, Porta porta1, Porta porta2, Porta porta3, Pessoa proprietario) {	

		this.cor = cor;

		this.porta1 = porta1;

		this.porta2 = porta2;

		this.porta3 = porta3;

		this.proprietario = proprietario;
	}

	public void pinta(String s) {

		this.cor = s;
	}

	public Integer qtdPortasEstaoAbertas(){

		Integer qtdPortasAbertas = 0;

		if(porta1.estaAberta() == true)qtdPortasAbertas++; 

		if(porta2.estaAberta() == true)qtdPortasAbertas++; 

		if(porta3.estaAberta() == true)qtdPortasAbertas++; 

		return qtdPortasAbertas;
	}

	public void alteraProprietario(Pessoa novoProprietario) {

		this.proprietario = novoProprietario;
	}

}
