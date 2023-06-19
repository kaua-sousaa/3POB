package crudzin;

public class Produto {
	/*Id, código de barras, sku, nome, descrição, categoria, preço, peso e fabricante.*/
	private int id;
	private int codBarra;
	private int sku;
	private String nome;
	private String descricao;
	private String categoria;
	private double preco;
	private double peso;
	private String fabricante;
	
	public Produto(int id, int codBarra, int sku, String nome, String descricao, String categoria, double preco,
		double peso, String fabricante) {
		
		this.id = id;
		this.codBarra = codBarra;
		this.sku = sku;
		this.nome = nome;
		this.descricao = descricao;
		this.categoria = categoria;
		this.preco = preco;
		this.peso = peso;
		this.fabricante = fabricante;
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getCodBarra() {
		return codBarra;
	}


	public void setCodBarra(int codBarra) {
		this.codBarra = codBarra;
	}


	public int getSku() {
		return sku;
	}


	public void setSku(int sku) {
		this.sku = sku;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public String getFabricante() {
		return fabricante;
	}


	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}


	@Override
	public String toString() {
		return "Produto [id=" + id + ", codBarra=" + codBarra + ", sku=" + sku + ", nome=" + nome + ", descricao="
				+ descricao + ", categoria=" + categoria + ", preco=" + preco + ", peso=" + peso + ", fabricante="
				+ fabricante + "]";
	}
	
	
	
}