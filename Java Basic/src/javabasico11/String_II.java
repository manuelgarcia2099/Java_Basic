package javabasico11;

/**
 * @author Manuel García
 */
public class String_II {

	public static void main(String[] args) {
		
		//1. Length
		String cadenaUno = "Una cadena";
		System.out.println("1) Length: "+cadenaUno.length());
		
		//2. 
		String cadenaDos="Esto es una cadena y no es un entero";
		int resultado = cadenaDos.length();
		System.out.println("2) Length: "+resultado);
		
		//startswith
		boolean resultadoPrefijo = cadenaDos.startsWith("Hoy");
		System.out.println("3) La cadena empieza con la palabra HOY?: "+resultadoPrefijo);

		boolean resultadoPrefijoDos = cadenaDos.startsWith("Esto");
		System.out.println("4) La cadena empieza con la palabra Esto?: "+resultadoPrefijoDos);
		
		//endsWith
		boolean resultadoSufijo = cadenaDos.endsWith("Esto");
		System.out.println("5) La cadena termina con la palabra Esto?: "+resultadoSufijo);
		
		boolean resultadoSufijoDos = cadenaDos.endsWith("entero");
		System.out.println("6) La cadena termina con la palabra entero?: "+resultadoSufijoDos);
		
		//indexOf
		int posicionLetraS= cadenaDos.indexOf("s");
		System.out.println("7) Primera ocurrencia de letra 'S' está en la posición: "+posicionLetraS);
		
		int posicionPalabraInexistente = cadenaDos.indexOf("prefijo");
		System.out.println("8) Primera ocurrencia de palabra 'prefijo' está en la posición: "+posicionPalabraInexistente);
		
		int primeraPosicionDePalabraEs = cadenaDos.indexOf("es");
		System.out.println("9) Primera ocurrencia de palabra 'es' está en la posición: "+primeraPosicionDePalabraEs);
		
		int segundaPosicionDePalabraEs = cadenaDos.indexOf("es", primeraPosicionDePalabraEs +1);
		System.out.println("10) Segunda ocurrencia de palabra 'es' está en la posición: "+segundaPosicionDePalabraEs);
		
		//Esto es una cadena y no es un entero
		//0123456789012345678901234
	}

}
