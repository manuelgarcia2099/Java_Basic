package javabasico6;
/**
 * @author Manuel García
 */
public class OperadoresIIIBooleanos {

	public static void main(String[] args) {

//		boolean verdadero = true;
//		boolean falso= false;
		
		boolean verdadUno = (1<3);
		boolean falsoUno = (1>3);
		boolean verdadDos = (5>2);
		boolean falsoDos = (10<8);
		
		System.out.println("VerdadUno es : "+verdadUno);
		System.out.println("VerdadDos es : "+verdadDos);
		System.out.println("FalsoUno es : "+falsoUno);
		System.out.println("FalsoDos es : "+falsoDos);
		
		System.out.println();
		System.out.println("NOT ! *****");
		System.out.println("(!V) es: "+!verdadUno);
		
		System.out.println();
		System.out.println("AND && *****");
		//V + V = V
		System.out.println("V && V = "+ (verdadUno && verdadDos)); //V
		System.out.println("V && F = "+ (verdadUno && falsoUno)); //F
		System.out.println("F && V = "+ (falsoUno && verdadDos));//F
		System.out.println("F && F = "+ (falsoUno && falsoDos)); //F
		
		System.out.println();
		System.out.println("OR || *****");
		//V CUANDO AL MENOS UNA SEA VERDADERA : V
		System.out.println("V || V = "+ (verdadUno || verdadDos)); //V
		System.out.println("V || F = "+ (verdadUno || falsoUno)); //V
		System.out.println("F || V = "+ (falsoUno || verdadDos));//V
		System.out.println("F || F = "+ (falsoUno || falsoDos)); //F
		
		System.out.println();
		System.out.println("XOR ^ *****");
		//No pueden haber dos sentencias iguales... 
		System.out.println("V ^ V = "+ (verdadUno ^ verdadDos)); //F
		System.out.println("V ^ F = "+ (verdadUno ^ falsoUno)); //V
		System.out.println("F ^ V = "+ (falsoUno ^ verdadDos));//V
		System.out.println("F ^ F = "+ (falsoUno ^ falsoDos)); //F
		
		System.out.println();
		
		//3 notas, definir la mejor nota, la nota media y la peor nota.
		
		int notaJuan = 15;
		int notaPedro = 12;
		int notaJose = 10;
		
		//Operador Ternario = (Sentencia)?V:F;
		
		String resultado;
		resultado = ((notaJuan>notaPedro)&&(notaJuan>notaJose))?"Juan tiene la mejor nota":"Juan tiene la peor nota";
		System.out.println("1: "+resultado);
		
		resultado = ((notaPedro<notaJose)||(notaPedro<notaJuan))?"Pedro no tiene la mejor ni la peor nota":"Pedro tiene la mejor nota";
		System.out.println("2: "+resultado);
		
		resultado = ((notaJose<notaJuan)^(notaJose<notaPedro))?"José tiene la mejor nota":"José tiene la peor nota";
		System.out.println("3: "+resultado);
		
	}

}
