package javabasico9;

import java.util.Random;

/**
 * @author Manuel García
 *
 */
public class NumerosRandom {

	public static void main(String[] args) {
		
		System.out.println("1) Class Math.random");
		double mathAleatorio = Math.random();
		System.out.println("1.1) Math.random()  num aleatorio double: "+mathAleatorio);
		
		double mathAleatorioDos = Math.random()*10;
		System.out.println("1.2) num Aleatorio *10 : "+mathAleatorioDos);
		
		//Desde un # hasta otro.
		
		int numeroMinimo = 5;
		int numeroMaximo = 10;
		//5,6,7,8,9,10 = 6 números.
		//rango= (10-5)+1
		//0,1,2,3,4,5  +
		//5,5,5,5,5,5
		//===========
		//5,6,7,8,9,10
		
		int rango = (numeroMaximo -numeroMinimo)+1; //6
		int mathAleatorioTres = (int) (Math.random()*rango)+numeroMinimo;
		
		System.out.println("1.3) numero Aleatorio entre "+numeroMinimo+" y "+numeroMaximo+" es "+mathAleatorioTres);
		
		//0-100
		int mathAleatorioCuatro = (int) Math.floor(Math.random()*101);
		int mathAleatorioCinco = (int) Math.ceil(Math.random()*100);
		System.out.println("1.4) Num. Aleatorio con Floor: "+mathAleatorioCuatro);
		System.out.println("1.5) Num. Aleatorio con Ceil: "+mathAleatorioCinco);
		
		System.out.println("2) Class Random ***");
		Random generadorAleatorio = new Random();
		
		double randomAleatorio = generadorAleatorio.nextDouble();
		System.out.println("2.1 Parecido a Math.random() número Aleatorio double: "+randomAleatorio);
		
		double randomAleatorioDos  = generadorAleatorio.nextDouble()*10;
		System.out.println("2.2) número Aleatorio *10: "+randomAleatorioDos);
		
		int randomAleatorioTres = generadorAleatorio.nextInt();
		System.out.println("2.3) número Aleatorio int (extenso): "+randomAleatorioTres);
		
		int randomAleatorioCuatro = generadorAleatorio.nextInt(2);
		System.out.println("2.4) número Aleatorio int sin incluir el param 2: "+randomAleatorioCuatro);
		
		int randomAleatorioCinco = generadorAleatorio.nextInt(2) + 1;
		System.out.println("2.5) número Aleatorio int incluir el param 2: "+randomAleatorioCinco);
		

	}

}
