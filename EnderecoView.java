package mvc;

public class EnderecoView {
	public void imprimeEnderecoCliente(Integer numero, String rua, String bairro, String complemento, String cidade, String uf, String fk_cliente) {
		System.out.println("*** Endere�o do Cliente ***");
		System.out.print("rua: " + rua + ", ");
		System.out.println(numero);
		System.out.println("Complemento: " + complemento);
		System.out.println("Bairro: " + bairro);
		System.out.println("Cidade: " + cidade);
		System.out.println("Estado: " + uf);
		System.out.println("C�digo do cliente: " + fk_cliente);
		System.out.println("\n");
	}

}
