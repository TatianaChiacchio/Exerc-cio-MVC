package mvc;

public class ProdutoController {
		private Produto model;
		private ProdutoView view;
		
		public ProdutoController(Produto model, ProdutoView view) {
			this.model = model;
			this.view = view;
		}
		
		public void setProdutoId_produto(Integer id_produto) {
			model.setId_produto(id_produto);
		}
		
		public Integer getProdutoId_Cliente() {
			return model.getId_produto();
		}
		
		
		public void setProdutoNome_produto(String nome_produto) {
			model.setNome_produto(nome_produto);
		}
		
		public String getSProdutoNome_produto() {
			return model.getNome_produto();
		}
		
		
		public void setProdutoDescricao(String descricao) {
			model.setDescricao(descricao);
		}
		
		public String getProdutoDescricao() {
			return model.getDescricao();
		}
		
		
		public void setProdutoPreco(double preco) {
			model.setPreco(preco);
		}
		
		public double getProdutoPreco() {
			return model.getPreco();
		}
		
				
		
		public void updateView() {
			view.imprimeDadosProduto(model.getId_produto(), model.getNome_produto(), model.getDescricao(), model.getPreco());
		}
	

	
	
}
