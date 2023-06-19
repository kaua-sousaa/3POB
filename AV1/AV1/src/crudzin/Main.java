package crudzin;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
//Id, código de barras, sku, nome, descrição, categoria, preço, peso e fabricante.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Produto> produtos = new ArrayList<>();
		
	
		int opcao;
		do {
			opcao = Menu(); 
					
			switch(opcao) {
				case 1: System.out.println("Id: ");
						int id = sc.nextInt();
						System.out.println("Codigo de barra: ");
						int codBarra = sc.nextInt();
						System.out.println("Sky: ");
						int sku = sc.nextInt();
						System.out.println("Nome do produto: ");
						sc.nextLine();
						String nomProduto = sc.nextLine();
						
						System.out.println("Descricao do produto: ");
						String descricao = sc.nextLine();
						System.out.println("Categoria do produto: ");
						String categoria = sc.nextLine();
						System.out.println("Preco: ");
						double preco = sc.nextDouble();
						System.out.println("peso: ");
						double peso = sc.nextDouble();
						sc.nextLine();
						System.out.println("Fabricante: ");
						String fabricante = sc.nextLine();
					incluir(produtos, id,codBarra,sku,nomProduto,descricao,categoria, preco,peso,fabricante);
					break;
					
				case 2: System.out.println("O que deseja alterar ?\n1.Id\n2.código de barras\n3.sku\n4.nome\n5.descrição\n6.categoria\n7.preço\n8.peso\n9.fabricante.\nOpcao: ");
				int op = sc.nextInt();
				
				System.out.println("Digite o id do produto que voce deseja alterar: ");
				int idAlterar = sc.nextInt();
				System.out.println("Entre com o novo valor: ");
				sc.nextLine();
				String valor = sc.nextLine();
				
				alterar(op, idAlterar, valor, produtos); 
				break;
				
				case 3: System.out.println("Digite o id do produto que voce deseja excluir: ");
				int excluir = sc.nextInt();
				
				Excluir(produtos, excluir);
				break;
				
				case 4: Exibir(produtos);
				break;
				
				case 5:System.out.println("Digite o id do produto que deseja procurar: ");
				int idBusca = sc.nextInt();
				
				buscaItem(produtos,idBusca);
				
				break;
			}
		}while(opcao!=10);
		
		
		sc.close();
	}

	
public static void incluir(ArrayList<Produto> produtos, int id, int codBarra, int sku, String nome, 
		String descricao, String categoria, double preco, double peso, String fabricante) {
	Produto produto = new Produto(id,codBarra,sku,nome,descricao, categoria, preco, peso, fabricante);
	produtos.add(produto);
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

public static void buscaItem (ArrayList<Produto> produtos, int idBusca) {
	for (Produto valores: produtos) {
		if (valores.getId() == idBusca) {
			System.out.println(valores);
		}
	}
}

public static void Excluir (ArrayList<Produto> produtos, int idExcluir) {
	for (int i=0;i<produtos.size();i++) {
		Produto produto = produtos.get(i);
		if (produto.getId() == idExcluir) {
			produtos.remove(i);
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
	System.out.println("\n\n1-Incluir produto\n2-Alterar produto\n3-Excluir produto\n4-Listar todos produtos\n5-Listar um produto\n10.Sair");
	opcoes = sc.nextInt();
	return opcoes;
	
}
}