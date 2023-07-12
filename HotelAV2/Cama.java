package hotel;

import java.util.ArrayList;

public class Cama {
	public int id;
	public int codigoCama;
	public boolean ehBeliche;
	public int posicao;
	public String descricao;
	public Cama(int id, int codigoCama, boolean ehBeliche, int posicao, String descricao) {
		
		this.id = id;
		this.codigoCama = codigoCama;
		this.ehBeliche = ehBeliche;
		this.posicao = posicao;
		this.descricao = descricao;
	}
	public Cama() {
		
	}
	
	public void incluir(ArrayList<Cama> camas, int id, int codigoCama, boolean ehBeliche, 
			int posicao, String descricao) {
		Cama cama = new Cama(id, codigoCama,ehBeliche,posicao,descricao);
		camas.add(cama);
	}
	
	public void alterar(ArrayList<Cama> camas, int op, int id, String novoValor) {
		for (int i=0;i<camas.size();i++) {
			if(camas.get(i).getId() == id) {
				Cama c = camas.get(i); 
	            switch(op) {
	                case 1: c.setId(Integer.parseInt(novoValor)); break;
	                case 2: c.setCodigoCama(Integer.parseInt(novoValor)); break;
	                case 3: c.setEhBeliche(Boolean.parseBoolean(novoValor)); break;
	                case 4: c.setPosicao(Integer.parseInt(novoValor)); break;
	                case 5: c.setDescricao(novoValor); break;
	            }
	            break;
			}
		}
	}
	public void listar(ArrayList<Cama> camas) {
		for (Cama valores: camas) {
			System.out.println(valores);
		}
	}
	public void exluir(ArrayList<Cama> camas, int id) {
		for (int i=0;i<camas.size();i++) {
			if(camas.get(i).getId() == id) {
				camas.remove(i);
				break;
			}
		}
	}
	
	
	
	@Override
	public String toString() {
		return "Cama [id=" + id + ", codigoCama=" + codigoCama + ", ehBeliche=" + ehBeliche + ", posicao=" + posicao
				+ ", descricao=" + descricao + "]"+ "\n\n";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCodigoCama() {
		return codigoCama;
	}
	public void setCodigoCama(int codigoCama) {
		this.codigoCama = codigoCama;
	}
	public boolean isEhBeliche() {
		return ehBeliche;
	}
	public void setEhBeliche(boolean ehBeliche) {
		this.ehBeliche = ehBeliche;
	}
	public int getPosicao() {
		return posicao;
	}
	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}