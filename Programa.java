package mvc;

public class Programa {
	public static void main(String[] args) {
		Cliente cliente = getFromBD();
		ClienteView cv = new ClienteView();
		
		Telefone telefone = getFromBDTel();
		TelefoneView tv = new TelefoneView();
		
		Endereco endereco = getFromBDEnde();
		EnderecoView ev = new EnderecoView();
		
		Produto produto = getFromBDProd();
		ProdutoView pv = new ProdutoView();
		
		Pedido pedido = getFromBDPed();
		PedidoView pdv = new PedidoView();
		
		Produtos_Pedido prodPed = getFromBDProdPed();
		Produto_PedidoView ppv = new Produto_PedidoView();
		
		
		
		
		
		ClienteController cc = new ClienteController(cliente,cv);
		TelefoneController tc = new TelefoneController(telefone,tv);
		EnderecoController ec = new EnderecoController(endereco,ev);
		ProdutoController pc = new ProdutoController(produto,pv);
		PedidoController pdc = new PedidoController(pedido,pdv);
		Produtos_PedidoController ppc = new Produtos_PedidoController(prodPed,ppv);
		
		
		cc.updateView();
		tc.updateView();
		ec.updateView();
		pc.updateView();
		pdc.updateView();
		ppc.updateView();
		
		
	}
	
	public static Cliente getFromBD() {
		Cliente cli = new Cliente();
		cli.setId_Cliente("2020123");
		cli.setNome("Tatiana Chiacchio");
		cli.setCpf("xxx.xxxx.xxxx-xx");
		cli.setRg("x-x.xxx.xxx");
		cli.setEmail("tatachiacchio@gmail.com");
		return cli;
	}
	
	
	public static Telefone getFromBDTel() {
		Telefone tel = new Telefone();
		tel.setDdd("19");
		tel.setNumero("xxxxx-xxxx");
		tel.setFk_id_cliente("2020123");
		return tel;
	}
	
	public static Endereco getFromBDEnde() {
		Endereco end = new Endereco();
		
		end.setNumero(136);
		end.setRua("Major bittencourt");
		end.setBairro("Vila Formosa");
		end.setComplemento("Perto do colégio COC");
		end.setCidade("São José do Rio Pardo");
		end.setUf("SP");
		end.setFk_Cliente("2020123");
		return end;
	}
	
	public static Produto getFromBDProd() {
		Produto prod = new Produto();
		
		prod.setId_produto(136);
		prod.setNome_produto("Teclado");
		prod.setDescricao("Teclado para computador de mesa");
		prod.setPreco(123.21);
		
		return prod;
	}
	
	public static Pedido getFromBDPed() {
		Pedido ped = new Pedido();
		
		ped.setNfe("0125584632");
		ped.setData_emissao("18/09/2020");
		ped.setValor_total(236.52);
		ped.setStatus("Entregue/recebido");
		ped.setFk_cliente("2020123");
		
		return ped;
	}
	
	public static Produtos_Pedido getFromBDProdPed() {
		Produtos_Pedido prodPedido = new Produtos_Pedido();
		
		prodPedido.setFk_produto(632);
		prodPedido.setFk_pedido("xxxxx-xxxx");
		prodPedido.setQuantidade(10.0);
		
		return prodPedido;
	}

}
