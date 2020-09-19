package mvc;

public class PedidoController {
	private Pedido model;
	private PedidoView view;
	
	public PedidoController(Pedido model, PedidoView view) {
		this.model = model;
		this.view = view;
	}
	
	
		
	public void setPedidoNfe(String nfe) {
		model.setNfe(nfe);
	}
	
	public String getPedidoNfe() {
		return model.getNfe();
	}
	
	
	
	public void setPedidoData_emissao(String data_emissao) {
		model.setData_emissao(data_emissao);
	}
	
	public String getPedioData_emissao() {
		return model.getData_emissao();
	}
	
	
	
	public void setPedidoValor_total(Double valor_total) {
		model.setValor_total(valor_total);
	}
	
	public Double getPedidoValor_total() {
		return model.getValor_total();
	}
	
	
	
	public void setPedidoStatus(String status) {
		model.setStatus(status);
	}
	
	public String getPedidoStatus() {
		return model.getStatus();
	}
	
	
	
	public void setPedidofk_cliente(String email) {
		model.setFk_cliente(email);
	}
	
	public String getPedidoFk_Cliente() {
		return model.getFk_cliente();
	}
	
	
	
	public void updateView() {
		view.imprimePedido(model.getNfe(), model.getData_emissao(), model.getValor_total(), model.getStatus(), model.getFk_cliente());
	}



}
