package cinema;

public class Filme {
	private int id;
	private String nome;
	private String origem;
	private float duracao;
	public Filme(int id, String nome, String origem, float duracao) {
		
		this.id = id;
		this.nome = nome;
		this.origem = origem;
		this.duracao = duracao;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public float getDuracao() {
		return duracao;
	}
	public void setDuracao(float duracao) {
		this.duracao = duracao;
	}
	
	
	public String toString() {
		return "Filme [id=" + id + ", nome=" + nome + ", origem=" + origem + ", duracao=" + duracao + "]";
	}
	
	
	
}
