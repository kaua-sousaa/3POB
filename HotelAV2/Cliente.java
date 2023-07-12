package hotel;


import java.util.ArrayList;

public class Cliente {
	public int id;
	public int idQuarto;
	public String endereco;
	public int postalCode;
	public String pais;
	public String cpf;
	public int passaporte;
	public String email;
	public String dataNascimento;
	public Cliente(int id, int idQuarto, String endereco, int postalCode, String pais, String cpf, int passaporte,
			String email, String dataNascimento) {
		
		this.id = id;
		this.idQuarto = idQuarto;
		this.endereco = endereco;
		this.postalCode = postalCode;
		this.pais = pais;
		this.cpf = cpf;
		this.passaporte = passaporte;
		this.email = email;
		this.dataNascimento = dataNascimento;
	}
	public Cliente() {
	}
	
	public void incluir(ArrayList<Cliente> clientes, int id, int idQuarto, String endereco, int postalCode, 
			String pais, String cpf, int passaporte, String email, String dataNascimento) {
	    Cliente cliente = new Cliente(id, idQuarto, endereco, postalCode, pais, cpf, passaporte, email, dataNascimento);
		clientes.add(cliente);
	}
	
	void alterarCliente(ArrayList<Cliente> clientes, int op, int id, String novoValor) {
	    for(int i = 0; i < clientes.size(); i++) {
	        if(clientes.get(i).getId() == id) {
	            Cliente c = clientes.get(i); 
	            switch(op) {
	                case 1: c.setId(Integer.parseInt(novoValor)); break;
	                case 2: c.setCpf(novoValor); break;
	                case 3: c.setEmail(novoValor); break;
	                case 4: c.setEndereco(novoValor); break;
	                case 5: c.setIdQuarto(Integer.parseInt(novoValor)); break;
	                case 6: c.setPais(novoValor); break;
	                case 7: c.setPassaporte(Integer.parseInt(novoValor)); break;
	                case 8: c.setPostalCode(Integer.parseInt(novoValor)); break;
	            }
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
	  
	
	void listarCliente(ArrayList<Cliente> clientes) {
		for (Cliente valores:clientes) {
			System.out.println(valores);
		}
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
	
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getPassaporte() {
		return passaporte;
	}
	public void setPassaporte(int passaporte) {
		this.passaporte = passaporte;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", idQuarto=" + idQuarto + ", endereco=" + endereco + ", postalCode=" + postalCode
				+ ", pais=" + pais + ", cpf=" + cpf + ", passaporte=" + passaporte + ", email=" + email
				+ ", dataNascimento=" + dataNascimento + "]"+ "\n\n";
	}
	
	
}