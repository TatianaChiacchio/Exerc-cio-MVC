package mvc;

public class Pedido {
	
	private String nfe;
	private String data_emissao;
	private Double valor_total;
	private String status;
	private String fk_cliente;
	public String getNfe() {
		return nfe;
	}
	public void setNfe(String nfe) {
		this.nfe = nfe;
	}
	public String getData_emissao() {
		return data_emissao;
	}
	public void setData_emissao(String data_emissao) {
		this.data_emissao = data_emissao;
	}
	public Double getValor_total() {
		return valor_total;
	}
	public void setValor_total(Double valor_total) {
		this.valor_total = valor_total;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFk_cliente() {
		return fk_cliente;
	}
	public void setFk_cliente(String fk_cliente) {
		this.fk_cliente = fk_cliente;
	}

	
	
}
