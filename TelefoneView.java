package mvc;

public class TelefoneView {
	public void imprimeTelefones(String ddd, String numero, String fk_id_cliente) {
		System.out.println("*** Telefone ***");
		System.out.println("DDD: " + ddd);
		System.out.println("Numero: " + numero);
		System.out.println("Código do Cliente: " + fk_id_cliente) ;
		System.out.println("\n");
	}

}
