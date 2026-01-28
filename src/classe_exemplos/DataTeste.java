package classe_exemplos;

public class DataTeste {

	public static void main(String[] args) {

		Data d1 = new Data();
		//d1.dia = 26;
		//d1.mes = "Janeiro";
		//d1.ano = 2026;
				
		Data d2 = new Data(31, "Dezembro", 2025);
		/*d2.dia = 31;
		d2.mes = "Dezembro";
		d2.ano = 2025;*/
		
		System.out.println(d1.dia + " de " + d1.mes + " de " + d1.ano);
		//System.out.printf("%d de %s de %d%n", d2.dia, d2.mes, d2.ano);
		System.out.println(d2.obterDataFormatada());
		
		System.out.println(d1.obterDataFormatada());
	}

}
