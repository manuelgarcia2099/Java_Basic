package javabasico3;

public class Variables {

	public static void main(String[] args) {

		int legionario = 30;
		System.out.println("Cantidad de legionarios en nuestro curso es: "+ legionario);
		
		//Valido
		int firstAge;
		int lastAge;
		int first_age;
		int firstage;
		int $age;
		int val1;
		int valAge;
		
		//No Válido
		/*int 1Age;
		int first age;
		int test#;
		int final;*/
		
		//Diferencia entre un dato primitivo y un dato de Clase
		
		int numeroEntero = 5;
		Integer numeroInteger = 3;
		Integer numeroIntegerDos = new Integer(4);
		
		System.out.println(numeroEntero);
		System.out.println(numeroInteger);
		System.out.println(numeroIntegerDos);
		
		String resultado = numeroInteger.toString();
		System.out.println(resultado);
		
		
		int edad = 18;
		double pago = 60.0;
		char letra = 'e';
		boolean estudiante = true;
		
		String holaMundo = " Hola!!! ";
		
		String vacio1 = " ";
		String vacio2 = new String();
		
		System.out.println(edad);
		System.out.println(pago);
		System.out.println(letra);
		System.out.println(estudiante);
		System.out.println(holaMundo);
		System.out.println(vacio1);
		System.out.println(vacio2);
		
		int primerNumero = 2;
		double segundoNumero = 9.0;
		float tercerNumero = (float) (2000*primerNumero/segundoNumero + 7);
		
		System.out.println("float: "+tercerNumero);
		System.out.println("Double: "+(double)tercerNumero);
		System.out.println("int: "+(int)tercerNumero);
		
	}

}
