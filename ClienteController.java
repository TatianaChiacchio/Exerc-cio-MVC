package mvc;

public class ClienteController {
	private Cliente model;
	private ClienteView view;
	
	public ClienteController(Cliente model, ClienteView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setClienteId_Cliente(String id_Cliente) {
		model.setId_Cliente(id_Cliente);
	}
	
	public String getSClienteId_Cliente() {
		return model.getId_Cliente();
	}
	
	public void setClienteNome(String nome) {
		model.setNome(nome);
	}
	
	public String getStudentName() {
		return model.getNome();
	}
	
	public void setClienteCpf(String cpf) {
		model.setCpf(cpf);
	}
	
	public String getClienteCpf() {
		return model.getCpf();
	}
	
	public void setClienteRg(String rg) {
		model.setCpf(rg);
	}
	
	public String getClienteRg() {
		return model.getRg();
	}
	
	public void setClienteEmail(String email) {
		model.setCpf(email);
	}
	
	public String getClienteEmail() {
		return model.getEmail();
	}
	
	
	
	public void updateView() {
		view.imprimeDadosCliente(model.getId_Cliente(), model.getNome(), model.getCpf(), model.getRg(), model.getEmail());
	}
}
