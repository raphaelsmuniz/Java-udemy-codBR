package classe_exemplos;

public class Data {

	int dia;
	String mes;
	int ano;
	
	String obterDataFormatada() {
		return String.format("%d de %s de %d", dia, mes, ano);
	}
}
