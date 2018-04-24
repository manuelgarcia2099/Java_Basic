package javabasico10;

/**
 * @author Manuel García
 *
 */
public class String_I {

	public static void main(String[] args) {
		
		//1.
		String cadenaUno = "Primera cadena";
		String cadenaDos = new String("Segunda cadena");
		
		System.out.println("1) "+cadenaUno);
		System.out.println("2) "+cadenaDos);
		
		//1.1 Comillas simples
		String cadenaConComillasSimples = "Cadena 'CON' comillas simples";
		System.out.println("3) "+cadenaConComillasSimples);
		
		//1.2 Comillas dobles
		String cadenaConComillasDobles = "Cadena \"CON\" comillas dobles";
		System.out.println("4) "+cadenaConComillasDobles);
		
		//1.3 Cadena vacía
		String cadenaVacia = "";
		String cadenaVaciaDos = new String();
		System.out.println("5) "+cadenaVacia);
		System.out.println("6) "+cadenaVaciaDos);
		
		//1.4 Concatenación
		String cadenaUnion = "Esto es"+" una cadena";
		System.out.println("7) "+cadenaUnion);
		
		//1.5 Concatenar diferentes tipos de variables
		double deuda = 50.00;
		String cadenaReporte = "Su deuda actual es de: $ ";
		String cadenaResultado = cadenaReporte+deuda;
		
		System.out.println("8) "+cadenaResultado);
		
		//1.6 char vs String
		char miPrimerChar = 'H';
		System.out.println("9) "+miPrimerChar);
		
		//1.7 número base decimal (Código ASCII)
		char arroba = 64;
		System.out.println("10) "+arroba);
		
		//1.8 unicode
		char char1 = '\u0028';
		System.out.println("11) "+char1);
		
		char char2 = '\u005E';
		char char3 = '\u005E';
		char char4 = '\u002C';
		char char5 = '\u0029';

		String resultadoChar = ""+char1+char2+char3+char4+char5;
		System.out.println("12) "+resultadoChar);
		
		//1.8 Equivalencia char - String.
		String cadenaABC = "abc";
		//es equivalente a:
		char dataABC[] = {'a','b','c'};
		
		//1.9 charAt(índice)
		String nombreDelCanal = "GoodMediaPeru";
		char charResultadoNombreCharAt = nombreDelCanal.charAt(5);
		System.out.println("13) "+charResultadoNombreCharAt);
		
		//GoodMediaPeru
		//0123456789
	}

}
