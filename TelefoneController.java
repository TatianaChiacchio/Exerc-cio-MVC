package mvc;

public class TelefoneController {
	private Telefone model;
	private TelefoneView view;
	
	public TelefoneController(Telefone model, TelefoneView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setTelefoneDdd(String ddd) {
		model.setDdd(ddd);
	}
	
	public String getTelefoneDdd() {
		return model.getDdd();
	}
	
	
	public void setTelefoneNumero(String numero) {
		model.setNumero(numero);
	}
	
	public String getTelefoneNumero() {
		return model.getNumero();
	}
	
	
	public void setTelefoneFk_id_cliente(String fk_id_cliente) {
		model.setNumero(fk_id_cliente);
	}
	
	public String getTelefoneFk_id_cliente() {
		return model.getFk_id_cliente();
	}
	
	
	
	public void updateView() {
		view.imprimeTelefones(model.getDdd(), model.getNumero(), model.getFk_id_cliente());
	}
	
	

}
