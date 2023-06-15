package cinema;

public class Assento {
	private int idSessao;
	private int codAssento;
	private int idCliente;
	
	public Assento(int idSessao, int codAssento, int idCliente) {
		
		this.idSessao = idSessao;
		this.codAssento = codAssento;
		this.idCliente = idCliente;
	}
	public int getIdSessao() {
		return idSessao;
	}
	public void setIdSessao(int idSessao) {
		this.idSessao = idSessao;
	}
	public int getCodAssento() {
		return codAssento;
	}
	public void setCodAssento(int codAssento) {
		this.codAssento = codAssento;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	
}
