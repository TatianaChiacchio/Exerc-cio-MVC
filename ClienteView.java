package mvc;

public class ClienteView {
	public void imprimeDadosCliente(String id_Cliente, String nome, String cpf, String rg, String email) {
		System.out.println("*** Cliente ***");
		System.out.println("Código do cliente: " + id_Cliente);
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("RG: " + rg);
		System.out.println("Seu e-mail: " + email);
		System.out.println("\n");
	}

}
