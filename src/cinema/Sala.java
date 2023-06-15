package cinema;

public class Sala {
	private int id;
	private int numeroAssentos;
	private int linha;
	private int coluna;
	
	public Sala(int id, int numeroAssentos, int linha, int coluna) {

		this.id = id;
		this.numeroAssentos = numeroAssentos;
		this.linha = linha;
		this.coluna = coluna;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumeroAssentos() {
		return numeroAssentos;
	}

	public void setNumeroAssentos(int numeroAssentos) {
		this.numeroAssentos = numeroAssentos;
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	
	
}
