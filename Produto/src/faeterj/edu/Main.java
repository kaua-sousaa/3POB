package faeterj.edu;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Produto prod = new Produto();
		ArrayList<Produto> lproduto = new ArrayList<Produto>();
		int i=0;
		
		System.out.println("Quantos produtos serão adicionados? ");
		int quantidade = sc.nextInt();
		
		while(i<quantidade)
		{
			System.out.println("Entre com o nome: ");
			prod.nome = sc.next();		
			System.out.println("Entre com o valor: ");
			prod.valor = sc.nextFloat();	
			System.out.println("Entre com a quantidade: ");
			prod.qtd = sc.nextInt();	
			System.out.println("Entre com a descrição: ");
			prod.descricao = sc.next();
			System.out.println("Entre com o codigo de barra: ");
			prod.codigoBarra = sc.nextInt();

		
			i++;
		}
		
		 System.out.println("Valores da lista:");
	      
		 for(i=0;i<quantidade;i++)
		 {
			 System.out.println(prod.nome);
			 System.out.println(prod.valor);
			 System.out.println(prod.qtd);
			 System.out.println(prod.descricao);
			 System.out.println(prod.codigoBarra);
		 }
		sc.close();
	}

}
