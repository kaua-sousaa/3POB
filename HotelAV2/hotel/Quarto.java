package hotel;

import java.util.ArrayList;

public class Quarto {
    private int id;
    private String nomeQuarto;
    private int qtdeCamas;
    private boolean temBanheiro;
    private String descricao;

    public Quarto(int id, String nomeQuarto, int qtdeCamas, boolean temBanheiro, String descricao) {
        this.id = id;
        this.nomeQuarto = nomeQuarto;
        this.qtdeCamas = qtdeCamas;
        this.temBanheiro = temBanheiro;
        this.descricao = descricao;
    }

    public Quarto() {
    }

    public void incluir(ArrayList<Quarto> quartos, int id, String nomeQuarto, int qtdeCamas, boolean temBanheiro, String descricao) {
        Quarto quarto = new Quarto(id, nomeQuarto, qtdeCamas, temBanheiro, descricao);
        quartos.add(quarto);
    }

    void alterarCliente(ArrayList<Quarto> quartos, int op, int id, String novoValor) {
	    for(int i = 0; i < quartos.size(); i++) {
	        if(quartos.get(i).getId() == id) {
	            Quarto c = quartos.get(i); 
	            switch(op) {
	                case 1: c.setId(Integer.parseInt(novoValor)); break;
	                case 2: c.setNomeQuarto(novoValor); break;
	                case 3: c.setQtdeCamas(Integer.parseInt(novoValor)); break;
	                case 4: c.setTemBanheiro(Boolean.parseBoolean(novoValor)); break;
	                case 5: c.setDescricao(novoValor); break;
	            }
	            break;
	        }
	    }
	}

    public void excluirQuarto(ArrayList<Quarto> quartos, int id) {
        for (int i = 0; i < quartos.size(); i++) {
            if (quartos.get(i).getId() == id) {
                quartos.remove(i);
                break;
            }
        }
    }

    public void listarQuartos(ArrayList<Quarto> quartos) {
        for (Quarto quarto : quartos) {
            System.out.println(quarto);
        }
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeQuarto() {
		return nomeQuarto;
	}

	public void setNomeQuarto(String nomeQuarto) {
		this.nomeQuarto = nomeQuarto;
	}

	public int getQtdeCamas() {
		return qtdeCamas;
	}

	public void setQtdeCamas(int qtdeCamas) {
		this.qtdeCamas = qtdeCamas;
	}

	public boolean isTemBanheiro() {
		return temBanheiro;
	}

	public void setTemBanheiro(boolean temBanheiro) {
		this.temBanheiro = temBanheiro;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Quarto [id=" + id + ", nomeQuarto=" + nomeQuarto + ", qtdeCamas=" + qtdeCamas + ", temBanheiro="
				+ temBanheiro + ", descricao=" + descricao + "]"+ "\n\n";
	}

    
}
