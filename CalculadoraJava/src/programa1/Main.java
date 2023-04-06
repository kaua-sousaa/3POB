package programa1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calc = new Calculadora();
		Scanner sc = new Scanner(System.in);
		
		int op, operador;
		double resultado=0;
		float num;
		float num2;
		
		
		System.out.println("1.Se deseja operações de Soma, Subtração, Divisão e Multiplicação"
				+ "\n2. Se deseja operações de Seno, Cosseno e tangente");
		op = sc.nextInt();
		
		if (op == 1)
		{
			System.out.println("Entre com o numero: ");
			num = sc.nextFloat();
			System.out.println("Entre com o numero 2: ");
			num2 = sc.nextFloat();
			System.out.println("Entre com a operação desejada:\n1.SOMA\n2.SUBTRAÇÃO\n"
					+ "3.MULTIPLICAÇÃO\n4.DIVISÃO\nOpção: ");
			operador = sc.nextInt();
			
			resultado = calc.OpeBasicas(num,num2,operador);
		}
		else if (op == 2)
		{
			System.out.println("Entre com o numero: ");
			num = sc.nextFloat();
			System.out.println("Entre com a operação desejada:\n1.SENO\n2.COSSENO\n"
					+ "3.TANGENTE\nOpção: ");
			operador = sc.nextInt();
			resultado = calc.trigonometria(num, operador);
		}
		
		
		System.out.println(resultado);
		
		sc.close();
	}

}
