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
		Cama cama = new Cama(this.id, this.codigoCama, this.ehBeliche, this.posicao, this.descricao);
		camas.add(cama);
	}
	
}
