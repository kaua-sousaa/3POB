package hotel;

import java.util.ArrayList;

public class Reserva {
	public int id;
	public int idQuarto;
	public int idCama;
	public int idCliente;
	public String dataEntrada;
	public String dataSaida;
	public Reserva(int id, int idQuarto, int idCama, int idCliente, String dataEntrada, String dataSaida) {
		this.id = id;
		this.idQuarto = idQuarto;
		this.idCama = idCama;
		this.idCliente = idCliente;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
	}
	
	
	public Reserva() {
		
	}


	public void incluir(ArrayList<Reserva> reservas, int idQuarto, int idCama, int idCliente,
			String dataEntrada, String dataSaida) {
		Reserva reserva = new Reserva(this.id, this.idQuarto, this.idCama, this.idCliente, this.dataEntrada, this.dataSaida);;
		reservas.add(reserva);
	}
}
