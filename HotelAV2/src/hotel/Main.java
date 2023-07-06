package hotel;

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
		
		c.incluir(clientes, 2, 100, "Chacrinha");
		criarArquivo(clientes);
		
		sc.close();
	}

		 public static void criarArquivo(ArrayList<Cliente> clientes) {
		    try {
		    	FileWriter writer = new FileWriter("Hotel.txt", true);
			    	for (Cliente element : clientes) {
			    	    writer.write(element.getId() +" , "+  element.getIdQuarto() + " , "+ element.getEndereco() + "\n");
			    	}
		        writer.close();
		        System.out.println("Escrito com sucesso!");
		      }
		      catch (IOException e) {
		      System.out.println("Um erro ocorreu");
		      e.printStackTrace();
		    }
		  }
}
