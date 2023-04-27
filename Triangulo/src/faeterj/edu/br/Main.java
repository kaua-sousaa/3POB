package faeterj.edu.br;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		Triangulo triX = new Triangulo();
		
		System.out.println("Digite os lados do triangulo X");
		triX.a = sc.nextDouble();
		triX.b = sc.nextDouble();
		triX.c = sc.nextDouble();
		
		double areaX = triX.CalculaArea();
		System.out.println("Area do triangulo X: "+ areaX);
		
		System.out.println("Digite os lados do triangulo Y");
		Triangulo triY = new Triangulo();
		triY.a = sc.nextDouble();
		triY.b = sc.nextDouble();
		triY.c = sc.nextDouble();
		
		double areaY = triY.CalculaArea();
		System.out.println("Area do triangulo Y: " + areaY);
		
		sc.close();
	}

}
