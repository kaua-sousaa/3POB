package hotel;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Cliente c = new Cliente();
		Quarto q = new Quarto();
		Reserva r = new Reserva();
		Cama ca = new Cama();
		//aaaaa
		ArrayList<Cliente> clientes = new ArrayList<>();
		ArrayList<Quarto> quartos = new ArrayList<>();
		ArrayList<Cama> camas = new ArrayList<>();
		ArrayList<Reserva> reservas = new ArrayList<>();
		ArrayList<ArrayList<?>> hotel = new ArrayList<>();
		
		r.incluir(reservas, 1, 10, 100, 1000, "25/11/2003", "12/07/2023");
		r.incluir(reservas, 2, 20, 200, 2000, "11/07/1939", "15/07/1945");
		r.listar(reservas);
	//	r.alterar(reservas, 5, 1, "11/11/2011");
	//	r.listar(reservas);
	//	r.exluir(reservas, 2);
		
		
		
		ca.incluir(camas, 1, 100, true, 1000, "Cama bem grande");
		ca.incluir(camas, 2, 200, false, 2000, "Cama bem pequena");
		ca.listar(camas);
	//	ca.exluir(camas, 2);
	//	ca.alterar(camas, 5, 1, "Cama gigantesca");
	//	ca.listar(camas);
		
		
		q.incluir(quartos, 1, "A10", 3, true, "Quarto em belo horizonte com vista para o mar");
		q.incluir(quartos, 2, "A20", 2, false, "Quarto maneiro");
	//	q.alterarCliente(quartos, 4, 1, "false");
		q.listarQuartos(quartos);
	//	q.excluirQuarto(quartos, 2);
		
		
		c.incluir(clientes, 2, 100, "Chacrinha", 1120, "Brasil", "132.232.321", 11223344, "matheus@gmail.com",
				"25/11/2004");
		c.incluir(clientes, 3, 100, "Barra", 2020, "Brasil", "132.232.111", 11000344, "lucas@gmail.com",
				"25/11/2006");
		c.incluir(clientes, 4, 100, "Quintino", 3020, "Brasil", "132.222.321", 11113344, "sousa@gmail.com",
				"25/11/2010");
		
	//	c.excluirCliente(clientes, 3);
	//	c.alterarCliente(clientes, 4, 2, "Chacrinha potencia mundial");
		c.listarCliente(clientes);
				
		hotel.add(clientes);
		hotel.add(camas);
		hotel.add(quartos);
		hotel.add(reservas);
		
		criarArquivo(hotel);
		
		sc.close();//hihi11
	}

	 public static void criarArquivo(ArrayList<?> lista) {
	        try {
	            FileWriter writer = new FileWriter("Hotel.txt");
	            for (Object element : lista) {
	                writer.write(element.toString() + "\n\n");
	            }
	            writer.close();
	            System.out.println("Escrito com sucesso!");
	            File file = new File("Hotel.txt");
	            if (file.exists()) {
	                System.out.println("Arquivo criado corretamente!");
	                System.out.println("Diretório do arquivo: " + file.getAbsolutePath());
	            } else {
	                System.out.println("Falha ao criar o arquivo!");
	            }
	        } catch (IOException e) {
	            System.out.println("Um erro ocorreu");
	            e.printStackTrace();
	        }
	    }
	}
