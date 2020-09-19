package mvc;

public class Produtos_PedidoController {
	private Produtos_Pedido model;
	private Produto_PedidoView view;
	
	public Produtos_PedidoController(Produtos_Pedido model, Produto_PedidoView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setProdutos_pedido(Integer fk_produto) {
		model.setFk_produto(fk_produto);
	}
	
	public Integer getProdutos_pedido() {
		return model.getFk_produto();
	}
	
	
	
	public void setProdutos_pedido(String fk_pedido) {
		model.setFk_pedido(fk_pedido);
	}
	
	public String getProdutos_Pedido() {
		return model.getFk_pedido();
	}
	
	
	
	public void setProdutos_pedido(Double quantidade) {
		model.setQuantidade(quantidade);
	}
	
	public Double getProdutos_pedidos() {
		return model.getQuantidade();
	}
	
	
	
	
	public void updateView() {
		view.imprimeDadosPedido(model.getFk_produto(), model.getFk_pedido(), model.getQuantidade());
	}

}
