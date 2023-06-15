package cinema;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Sala> salas = new ArrayList<>();
		Sala sala = new Sala (1,4,5, 2);
		salas.add(sala);
		
		sala = new Sala(2, 4, 5, 3 );
		salas.add(sala);
		sala = new Sala(3, 4, 5, 4);
		salas.add(sala);
		
		ArrayList<Filme> filmes = new ArrayList<>();
		Filme filme = new Filme(100, "Elon musk", "Canada", 2);
		filmes.add(filme);
		
		filme = new Filme (200, "Jeff bezos", "EUA", 3);
		filmes.add(filme);
		
		ArrayList<Sessao> sessoes = new ArrayList<>();
		Sessao sessao = new Sessao(filmes.get(0).getId(), salas.get(0).getId(), "16:45", 2);
		sessoes.add(sessao);
		
		sessao = new Sessao(filmes.get(1).getId(), salas.get(1).getId(), "13:00", 3);
		sessoes.add(sessao);
		
		/*for (Filme valor : filmes) {
			System.out.println(valor);
		}*/
		ArrayList<Cliente> Clientes = new ArrayList<>();
		Cliente clientes = new Cliente(15245);
		Clientes.add(clientes);
		clientes = new Cliente(12543);
		Clientes.add(clientes);
				
		ArrayList<Assento> Assentos = new ArrayList<>();
		Assento assento = new Assento (sessoes.get(0).getIdSessao(), 1, 100); // idSessao, idAssento, idCliente
		Assentos.add(assento);
		
		assento = new Assento (sessoes.get(1).getIdSessao(), 2, 200);
		
		
		sc.close();
	}

}
