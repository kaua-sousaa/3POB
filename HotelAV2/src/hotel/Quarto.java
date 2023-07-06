package hotel;

import java.util.ArrayList;

public class Quarto {
	public int id;
	public String nomeQuarto;
	public int qtdeCamas;
	public boolean temBanheiro;
	public String descricao;
	public Quarto(int id, String nomeQuarto, int qtdeCamas, boolean temBanheiro, String descricao) {
		this.id = id;
		this.nomeQuarto = nomeQuarto;
		this.qtdeCamas = qtdeCamas;
		this.temBanheiro = temBanheiro;
		this.descricao = descricao;
	}
public Quarto() {
		
	}
	public void incluir(ArrayList<Quarto> quartos, int id, String nomeQuarto, int qtdeCamas, 
			boolean temBanheiro, String descricao) {
		Quarto quarto = new Quarto(this.id, this.nomeQuarto, this.qtdeCamas, this.temBanheiro, this.descricao);
		quartos.add(quarto);
	}
}
