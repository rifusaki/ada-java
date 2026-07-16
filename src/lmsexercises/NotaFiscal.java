package lmsexercises;

class Produto {
	public String codigo;
	public double precoUnitario;
	public int quantidade;

	public Produto(String codigo, double precoUnitario, int quantidade) {

		if (quantidade < 0) { quantidade = 0;};

		this.codigo = codigo;
		this.precoUnitario = precoUnitario;
		this.quantidade = quantidade;
	}
}

class NotaFiscal {
	private java.util.List<Produto> produtos = new java.util.ArrayList<>();

	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
	}

	public void removerProdutos(String codigo) {
        produtos.removeIf(produto -> produto.codigo.equals(codigo));
    }

	public double calcularValorProduto(Produto produto) {
		return produto.precoUnitario * produto.quantidade;
	}

	public double calcularValorNotaFiscal() {
		double sum = 0.0;
		for (Produto p : this.produtos) {
			sum += this.calcularValorProduto(p);
		}
		return sum;
	}
}