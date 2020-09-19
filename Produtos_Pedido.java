package mvc;

public class Produtos_Pedido {
	private Integer fk_produto;
	private String fk_pedido;
	private Double quantidade;
	
	
	public Integer getFk_produto() {
		return fk_produto;
	}
	public void setFk_produto(Integer fk_produto) {
		this.fk_produto = fk_produto;
	}
	public String getFk_pedido() {
		return fk_pedido;
	}
	public void setFk_pedido(String fk_cliente) {
		this.fk_pedido = fk_cliente;
	}
	public Double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
	

}
