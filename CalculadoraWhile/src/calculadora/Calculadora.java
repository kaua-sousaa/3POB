package calculadora;


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
	
	
}