package mvc;

public class Produto_PedidoView {
	public void imprimeDadosPedido(Integer fk_produto, String fk_pedido, Double quantidade) {
		System.out.println("*** Dados do seu pedido ***");
		System.out.println("N�mero da nota fiscal do pedido: " + fk_pedido);
		System.out.println("C�digo do produto: " + fk_produto);
		System.out.println("Quantidade comprada: " + quantidade);
		System.out.println("\n");
	}

}
