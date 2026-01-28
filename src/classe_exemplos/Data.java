package classe_exemplos;

public class Data {

	int dia;
	String mes;
	int ano;
	
	String obterDataFormatada() {
		return String.format("%d de %s de %d", dia, mes, ano);
	}

	Data(){
		dia = 01;
		mes = "Janeiro";
		ano = 1970;
	}
	
	Data(int dia, String mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
}
