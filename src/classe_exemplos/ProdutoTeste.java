package classe_exemplos;

public class ProdutoTeste {

	public static void main(String[] args) {

		//construtor padrão foi perdido
		//Produto p1 = new Produto();
		//Produto p1 = new Produto("Notebook");
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		//p1.desconto = 0.25;
		
		//construtor padrão foi perdido
		//var p2 = new Produto();
		//var p2 = new Produto("Caneta azul");
		var p2 = new Produto();
		p2.nome = "Caneta preta";
		p2.preco = 12.56;
		//p2.desconto = 0.29;

		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.preco * (1 - Produto.desconto);
		double precoFinal2 = p2.preco * (1 - Produto.desconto);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		System.out.printf("Média do carrinho = R$ %.2f.", mediaCarrinho);
		
	}

}
