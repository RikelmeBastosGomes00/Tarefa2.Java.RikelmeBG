package atividades;

public class Conta {

	String nomeTitular;
	Integer numero; 
	String agencia;
	Double saldo;
	Data dataAbertura;



	public Conta(String nomeTitular, Integer numero, String agencia, Double saldo, Data dataAbertura) {

		this.nomeTitular = nomeTitular;
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.dataAbertura = dataAbertura;
	}

	public Boolean sacar(Double valor) {

		if(valor > this.saldo) {

			return false;	
		}

		else {

			this.saldo -= valor;

			return true;
		}	
	}

	public Boolean depositar(Double valor) {

		if(valor <= 0 ) {

			return false;	
		}

		else {

			this.saldo += valor;

			return true;
		}	
	}

	public Double calculaRendimento() {

		return this.saldo * 0.1;	 

	}

	public String recuperaDadosParaImpressao() {

		return "Nome do titular da conta:" + this.nomeTitular + 
				"\nNúmero da conta: " + this.numero +
				"\nAgência: " + this.agencia + 
				"\nSaldo da conta: " + this.saldo + 
				"\nData de bertura: " + this.dataAbertura.DataFormatadaString();
	}


}
