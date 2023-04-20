package calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calc = new Calculadora();
		Scanner sc = new Scanner(System.in);
		
		int operador;
		double resultado=0;
		float num;
		float num2;
		
		do {
			
			System.out.println("Entre com o primeiro numero: ");
			num = sc.nextFloat();
			System.out.println("Entre com o segundo numero: ");
			num2 = sc.nextFloat();
			System.out.println("Entre com a operacao desejada:\n1.Soma\n2.Subtracao\n"
					+ "3.Multiplicacao\n4.Divisao\n5.SAIR\n\nOpcao: ");
			operador = sc.nextInt();
			
			resultado = calc.OpeBasicas(num, num2, operador);
			if (operador!=5)
			{
				System.out.println(resultado);
			}else
			{
				System.out.println("Saindo...");
			}
			
		}while(operador!=5);
		
		
		sc.close();
	}

}