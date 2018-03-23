package javabasico4;
/**
 * @author Manuel García
 */
public class OperadoresI {

	public static void main(String[] args) {
		System.out.println("1 ****************");
		//1. Operadores Aritméticos
		//1.1 Operador de asignación
		int primerNumero = 8;
		int segundoNumero = 2;
		//1.2 Operadores aritméticos.
		int suma= primerNumero+segundoNumero; 
		int resta = primerNumero-segundoNumero;
		int multiplicacion= primerNumero*segundoNumero;
		int division = primerNumero/segundoNumero;
		int resto = primerNumero % segundoNumero;
		
		System.out.println("Primer Número: "+primerNumero+ " ; Segundo Número: "+segundoNumero);
		System.out.println("Suma: "+suma);
		System.out.println("Resta: "+resta);
		System.out.println("Multiplicación: "+multiplicacion);
		System.out.println("División: "+division);
		System.out.println("Resto: "+resto);
		
		System.out.println("2 Op. Unarios*********");
		//1.3 Op. Unarios
		int tercerNumero = 3;
		int cuartoNumero = 4;
		System.out.println("Tercer Número: "+tercerNumero+ " ; Cuarto Número: "+cuartoNumero);
		
		tercerNumero++;
		System.out.println("Tercer Número: "+tercerNumero);
		
		cuartoNumero--;
		System.out.println("Cuarto Número: "+cuartoNumero);

		int quintoNumero =3;
		System.out.println("Quinto Número: "+quintoNumero);
		
		int sextoNumero = 3 + quintoNumero++;
		System.out.println("Sexto Número: "+sextoNumero);
		
		System.out.println(" y el quinto Número ???");
		System.out.println("Quinto Número: "+quintoNumero);
		
		int septimoNumero = 3;
		System.out.println("Séptimo Número: "+ septimoNumero);
		
		int octavoNumero = 3 + ++septimoNumero;
		System.out.println("Octav Número: "+ octavoNumero);
		
		//1.4 operadores combinados
		
		int novenoNumero = 5;
		System.out.println("Noveno Número: "+ novenoNumero);
		novenoNumero -=2;
		System.out.println("Noveno Número decrementado es : "+novenoNumero);
		novenoNumero +=3;
		System.out.println("Noveno Número incrementado es : "+novenoNumero);
		novenoNumero *=2;
		System.out.println("Noveno Número multiplicado *2 es : "+novenoNumero);
		novenoNumero/=3;
		System.out.println("Noveno Número Dividido /3 es : "+novenoNumero);
		
		
	}

}
