package mvc;

public class PedidoView {
	public void imprimePedido(String nfe, String Data_emissao, Double valor_total, String status, String fk_cliente) {
		System.out.println("*** Pedido ***");
		System.out.println("Número da nota fiscal: " + nfe);
		System.out.println("Data da compra: " + Data_emissao);
		System.out.println("Valor total do pedido: R$ " + valor_total);
		System.out.println("Status do seu pedido: " + status);
		System.out.println("código do Cliente: " + fk_cliente);
		System.out.println("\n");
	}

}
