package atividades;

public class Data {

	public Integer dia;

	public Integer mes;

	public Integer ano;

	public Data(Integer dia, Integer mes, Integer ano)
	{
		this.dia = dia;

		this.mes = mes;

		this.ano = ano;
	}

	public  String DataFormatadaString(){

		return this.dia + "/" + this.mes + "/" + this.ano;	

	}
}
