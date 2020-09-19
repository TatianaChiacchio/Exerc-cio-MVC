package mvc;

public class EnderecoController {
	
	private Endereco model;
	private EnderecoView view;
	
	public EnderecoController(Endereco model, EnderecoView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setEnderecoNumero(Integer numero) {
		model.setNumero(numero);
	}
	
	public Integer getEndereconumero() {
		return model.getNumero();
	}
	
	
	public void setEnderecoRua(String rua) {
		model.setRua(rua);
	}
	
	public String getEnderecoRua() {
		return model.getRua();
	}
	
	
	public void setEnderecoBairro(String bairro) {
		model.setBairro(bairro);
	}
	
		public String getEnderecoBairro() {
		return model.getBairro();
	}
	
	
	public void setEnderecoComplemento(String complemento) {
		model.setComplemento(complemento);
	}
	
	public String getEnderecoComplemento() {
		return model.getComplemento();
	}
	
	
	
	public void setEnderecoCidade(String cidade) {
		model.setCidade(cidade);
	}
	
	public String getEnderecoCidade() {
		return model.getCidade();
	}
	
	public void setEnderecoUf(String uf) {
		model.setUf(uf);
	}
	
	public String getEnderecoUf() {
		return model.getUf();
	}
	
	
	public void setEnderecoFk_cliente(String fk_cliente) {
		model.setFk_Cliente(fk_cliente);
	}
	
	public String getEnderecoFk_cliente() {
		return model.getFk_Cliente();
	}
	
	
	public void updateView() {
		view.imprimeEnderecoCliente(model.getNumero(), model.getRua(), model.getBairro(), model.getComplemento(), model.getCidade(), model.getUf(), model.getFk_Cliente());
	}

}
