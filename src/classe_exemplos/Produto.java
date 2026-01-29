package classe_exemplos;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;
	//estas variáveis pertencem ao objeto.
	
	public Produto() {
	
	}
	
	//foi definido de forma explicita o construtor padrão
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
}
