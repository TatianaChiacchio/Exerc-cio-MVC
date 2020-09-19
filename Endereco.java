package mvc;

public class Endereco {
	
	private Integer numero;
	private String rua;
	private String bairro;
	private String complemento;
	private String cidade;
	private String uf;
	private String fk_Cliente;
	
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getFk_Cliente() {
		return fk_Cliente;
	}
	public void setFk_Cliente(String fk_Cliente) {
		this.fk_Cliente = fk_Cliente;
	}
	
	

}
