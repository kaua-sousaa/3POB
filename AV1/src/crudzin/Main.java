package crudzin;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
//Id, código de barras, sku, nome, descrição, categoria, preço, peso e fabricante.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Produto> produtos = new ArrayList<>();
		
		Produto produto = new Produto(10010, 1515, 9998, "Whey protein", "Produto destinado ao ganho de massa muscular",
				"Suplemento", 99.99, 1.0, "Growth"); 
		produtos.add(produto);
		
		produto = new Produto(11010, 1616, 9999, "Hipercalorico", "Produtos destinados a frangos igual ao Diogo", "Suplemento", 50.99, 3.0,
				"Max titanium");
		produtos.add(produto);
		
		for (Produto valores: produtos) {
			System.out.println(valores);
		}
		//hihihi
		int opcao;
		do {
			opcao = Menu(); 
					
			switch(opcao) {
				case 1: break;
				case 2: System.out.println("O que deseja alterar ?\n1.Id\n2.código de barras\n3.sku\n4.nome\n5.descrição\n6.categoria\n7.preço\n8.peso\n9.fabricante.\nOpcao: ");
				int op = sc.nextInt();
				
				System.out.println("Digite o id do produto que voce deseja alterar: ");
				int idAlterar = sc.nextInt();
				System.out.println("Entre com o novo valor: ");
				sc.nextLine();
				String valor = sc.nextLine();
				
				alterar(op, idAlterar, valor, produtos); 
				break;
				case 3:break;
				case 4: Exibir(produtos);
				case 5:break;
			}
		}while(opcao!=10);
		
		
		sc.close();
	}

public static void alterar(int opcao, int idAlterar, String novoValor, ArrayList<Produto> produtos) {
	
	for(Produto produto : produtos){
		if (produto.getId() == idAlterar) {
			switch(opcao) {
				case 1: produto.setId(Integer.parseInt(novoValor));break;
				case 2: produto.setCodBarra(Integer.parseInt(novoValor));break;
				case 3: produto.setSku(Integer.parseInt(novoValor)); break;
				case 4: produto.setNome(novoValor);break;
				case 5: produto.setDescricao(novoValor);break;
				case 6: produto.setCategoria(novoValor);break;
				case 7: produto.setPreco(Double.parseDouble(novoValor));break;
				case 8: produto.setPeso(Double.parseDouble(novoValor));break;
				case 9: produto.setFabricante(novoValor);
			}
			
		}
	}
}

public static void Exibir (ArrayList<Produto> produtos){
	for(Produto valores : produtos) {
		System.out.println(valores);
	}
}

public static int Menu() {
	Scanner sc = new Scanner(System.in);
	int opcoes;
	System.out.println("=-=-=-=-=- MENU DE OPCOES =-=-=-=-=- ");
	System.out.println("\n\n1-Incluir produto\n2-Alterar produto\n3-Excluir produto\n4-Listar todos produtos\n5-Listar um produto");
	opcoes = sc.nextInt();
	sc.close();
	return opcoes;
	
}
}
