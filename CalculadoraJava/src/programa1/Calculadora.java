package programa1;


public class Calculadora {
	public float Soma (float x, float y)
	{
		return x+y;
	}
	public float Subtracao(float x, float y)
	{
		return x-y;
	}
	public float Divisao(float x, float y)
	{
		return x/y;
	}
	public float Multiplicacao(float x, float y)
	{
		return x*y;
	}
	
	
	
	public double seno(float x)
	{	
		double radiano;	
		//Convertendo o numero para radiano;
		
		radiano = Math.toRadians(x);
		//retornando o seno
		return Math.sin(radiano);
	}
	public double cos(float x)
	{
		double radiano;
		
		radiano = Math.toRadians(x);
		
		return Math.cos(radiano);
	}
	public double tan(float x)
	{
		double radiano;
		
		radiano = Math.toRadians(x);
		
		return Math.tan(radiano);
	}
	
	
	public float OpeBasicas (float x, float y, int op)
	{
		float resultado = 0;
		
		if (op == 1)
		{
			resultado =  Soma(x,y);
		}
		else if (op == 2)
		{
			resultado = Subtracao(x,y);
		}
		else if (op == 3)
		{
			resultado = Multiplicacao(x,y);
		}
		else if (op == 4)
		{
			resultado = Divisao(x,y);
		}
		
		return resultado;
	}
	
	public double trigonometria (float x, int op)
	{
		double resultado=0;
		
		if (op == 1)
		{
			resultado = seno(x);
		}
		else if (op == 2)
		{
			resultado = cos(x);
		}
		else if (op == 3)
		{
			resultado = tan(x);
		}
		
		return resultado;
	}
	
}
