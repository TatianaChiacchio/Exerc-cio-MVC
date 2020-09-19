package mvc;

public class ProdutoView {
	public void imprimeDadosProduto(Integer id_produto, String nome_produto, String descricao, double preco) {
		System.out.println("*** Produto ***");
		System.out.println("Código do produto: " + id_produto);
		System.out.println("Nome do produto: " + nome_produto);
		System.out.println("Descrição: " + descricao);
		System.out.println("Preço R$: " + preco);
		System.out.println("\n");
	}

}
