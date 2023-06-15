package cinema;

public class Sessao {
	private int idFilme;
	private int idSala;
	private String horario;
	private int idSessao;
	
	public Sessao(int idFilme, int idSala, String horario, int idSessao) {
		this.idFilme = idFilme;
		this.idSala = idSala;
		this.horario = horario;
		this.idSessao = idSessao;
	}

	
	public String toString() {
		return "Sessao [idFilme=" + idFilme + ", idSala=" + idSala + ", horario=" + horario + ", idSessao=" + idSessao
				+ "]";
	}


	public int getIdSessao() {
		return idSessao;
	}


	public void setIdSessao(int idSessao) {
		this.idSessao = idSessao;
	}
	
	
	
}
