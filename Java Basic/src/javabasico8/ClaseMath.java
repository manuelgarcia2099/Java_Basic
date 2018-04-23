package javabasico8;

/**
 * @author Manuel García
 */
public class ClaseMath {
	public static void main(String[] args) {
		
		//1.- Raiz Cuadrada
		int numeroNueve = 9;
		double raizCuadrada = Math.sqrt(numeroNueve);
		System.out.println("1) Raíz de "+numeroNueve+" es "+raizCuadrada);
		
		//2. Potencia
		int numeroDos = 2;
		int numeroTres= 3;
		double potencia = Math.pow(numeroDos, numeroTres);
		System.out.println("2) "+numeroDos+" elevado a "+numeroTres+" es "+potencia);
		
		//Redondeo
		double numeroDoubleUno = 3.9846;
		double redondeoUno = Math.round(numeroDoubleUno);
		System.out.println("3) "+numeroDoubleUno+" redondeado es "+redondeoUno);
		
		double numeroDoubleDos = 3.1846;
		double redondeoDos = Math.round(numeroDoubleDos);
		System.out.println("4) "+numeroDoubleDos+" redondeado es "+redondeoDos);
		
		//floor
		double redondeoAMenor = Math.floor(numeroDoubleUno);
		System.out.println("5) "+numeroDoubleUno+" redondeado a nro Entero inmediato inferior es "+redondeoAMenor);
		
		//ceil
		double redondeoAMayor = Math.ceil(numeroDoubleDos);
		System.out.println("6) "+numeroDoubleDos+" redondeado a nro Entero inmediato superior es "+redondeoAMayor);
		
		//mín y max
		int numeroComparadaoUno = 5;
		int numeroComparadoDos = 10;
		
		int numeroMinimo = Math.min(numeroComparadaoUno, numeroComparadoDos);
		System.out.println("7) Numero MIN entre "+numeroComparadaoUno+" y "+numeroComparadoDos+" es "+ numeroMinimo);
		
		int numeroMaximo = Math.max(numeroComparadaoUno, numeroComparadoDos);
		System.out.println("8) Numero MAX entre "+numeroComparadaoUno+" y "+numeroComparadoDos+" es "+ numeroMaximo);

		//Abs
		int numeroNegativo = -17;
		int valorAbsoluto = Math.abs(numeroNegativo);
		System.out.println("9) el valor abs de "+numeroNegativo+" es "+valorAbsoluto);
		
		//Constantes 
		System.out.println("10) Valor K de PI: "+Math.PI);
		System.out.println("11) Valor K de E: "+Math.E);
		
		//Angulos
		double angulo = 53;
		System.out.println("12) Seno de "+angulo+" es : "+Math.sin(Math.toRadians(53)));
		System.out.println("13) Seno de "+angulo+" es : "+Math.cos(Math.toRadians(53)));
		System.out.println("14) Tangente de "+angulo+" es : "+Math.tan(Math.toRadians(53)));
		
		
		
		
	}

}
