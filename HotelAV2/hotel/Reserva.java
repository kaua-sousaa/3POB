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


	public void incluir(ArrayList<Reserva> reservas, int id, int idQuarto, int idCama, int idCliente, 
			String dataEntrada, String dataSaida) {
		Reserva reserva = new Reserva(id, idQuarto,idCama,idCliente, dataEntrada, dataSaida);
		reservas.add(reserva);
	}
	
	public void alterar(ArrayList<Reserva> reservas, int op, int id, String novoValor) {
		for (int i=0;i<reservas.size();i++) {
			if(reservas.get(i).getId() == id) {
				Reserva c = reservas.get(i); 
	            switch(op) {
	                case 1: c.setId(Integer.parseInt(novoValor)); break;
	                case 2: c.setIdQuarto(Integer.parseInt(novoValor)); break;
	                case 3: c.setIdCama(Integer.parseInt(novoValor)); break;
	                case 4: c.setIdCliente(Integer.parseInt(novoValor)); break;
	                case 5: c.setDataEntrada(novoValor); break;
	                case 6: c.setDataSaida(novoValor);break;
	            }
	            break;
			}
		}
	}
	public void listar(ArrayList<Reserva> reservas) {
		for (Reserva valores: reservas) {
			System.out.println(valores);
		}
	}
	public void exluir(ArrayList<Reserva> reservas, int id) {
		for (int i=0;i<reservas.size();i++) {
			if(reservas.get(i).getId() == id) {
				reservas.remove(i);
				break;
			}
		}
	}

	
	
	@Override
	public String toString() {
		return "Reserva [id=" + id + ", idQuarto=" + idQuarto + ", idCama=" + idCama + ", idCliente=" + idCliente
				+ ", dataEntrada=" + dataEntrada + ", dataSaida=" + dataSaida + "]" + "\n\n";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getIdQuarto() {
		return idQuarto;
	}


	public void setIdQuarto(int idQuarto) {
		this.idQuarto = idQuarto;
	}


	public int getIdCama() {
		return idCama;
	}


	public void setIdCama(int idCama) {
		this.idCama = idCama;
	}


	public int getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}


	public String getDataEntrada() {
		return dataEntrada;
	}


	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}


	public String getDataSaida() {
		return dataSaida;
	}


	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}
	
	
}