package javabasico3;
/**
 * @author Manuel García
 */
public class Variables {

	public static void main(String[] args) {
		int legionarios = 30;
		System.out.println(legionarios);
		
//		Esto es un comentario de una sola línea
		
		/*Esto 
		es 
		un comentario
		multilínea*/
		
//		Comentarios Válidos		
		int firstAge;
		int lastAge;
		int first_age;
		int firstage;
		int $age;
		int val1;
		int valAge;
		
//		Comentarios No Válidos
		/*int 1age;
		int first age;
		int test#;
		int final;
		int double;*/

//		Diferencia entre un dato primitivo y un dato de clase
		
		int numeroEntero= 5;
		Integer numeroInteger = 3;
		Integer numeroIntegerDos = new Integer(4);
		
		System.out.println(numeroEntero);
		System.out.println(numeroInteger);
		System.out.println(numeroIntegerDos);
		
		String resultado = numeroInteger.toString();
		System.out.println(resultado);
		
		int edad = 18;
		double pago = 65.30;
		char letra ='e';
		boolean esEstudiante = true;
		
		String palabraConSentido= "Hola Mundo";
		String palabraSinSentido= "falfaklfljalfkja";
		
		System.out.println(palabraConSentido);
		System.out.println(palabraSinSentido);
		
		
		int primerNumero = 2;
		double segundoNumero = 9.0;
		float tercerNumero = (float) (2000*primerNumero/segundoNumero +7);
		
		System.out.println("Float: "+tercerNumero);
		System.out.println("Double: "+(double)tercerNumero);
		System.out.println("int: "+(int)tercerNumero);
		
		
		//Separadores
//		() {} [] ;
		
		System.out.println(2+1*3);
		System.out.println((2+1)*3);
		
		String [] javaLegion = {"Juan", "José", "Pedro", "Jimena"};
		
		
		
	}

}
