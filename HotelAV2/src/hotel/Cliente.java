package hotel;

import java.util.ArrayList;

public class Cliente {
	public int id;
	public int idQuarto;
	public String endereco;
/*	public int postalCode;
	public String pais;
	public String cpf;
	public int passaporte;
	public String email;
	public String dataNascimento;*/
	public Cliente(int id, int idQuarto, String endereco/*, int postalCode, String pais, String cpf, int passaporte,
			String email, String dataNascimento*/) {
		
		this.id = id;
		this.idQuarto = idQuarto;
		this.endereco = endereco;
	/*	this.postalCode = postalCode;
		this.pais = pais;
		this.cpf = cpf;
		this.passaporte = passaporte;
		this.email = email;
		this.dataNascimento = dataNascimento;*/
	}
	public Cliente() {
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
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void incluir(ArrayList<Cliente> clientes, int id, int idQuarto, String endereco) {
		Cliente cliente = new Cliente(this.id, this.idQuarto, this.endereco);
		clientes.add(cliente);
	}
	
	void alterarCliente(ArrayList<Cliente> clientes, int id) {
	      for (int i=0; i<clientes.size(); i++) {
	          if (clientes.get(i).getId() == id) {
	              clientes.setId();
	              break;
	          }
	      }
	  }

	  void excluirCliente(ArrayList<Cliente> clientes, int id) {
	      for (int i=0; i<clientes.size(); i++) {
	          if (clientes.get(i).getId() == id) {
	              clientes.remove(i);
	              break;
	          }
	      }
	  }
	
	
	
}
