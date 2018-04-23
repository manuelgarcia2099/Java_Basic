package javabasico7;

/**
 * @author Manuel García
 *
 */
public class OperadoresIV_NivelBit {

	public static void main(String[] args) {

		System.out.println("Operadores a Nivel Bit");
		
		int x = 10; //1010
		int y = 9; // 1001
		int z = 8; // 1000
		
		int zAndY = z&y;
		int xOrY = x|y;
		int xXorZ = x^z;
		
		System.out.println("1) Operador AND  ***");
		// And sólo te devolvía 1, si los dos variables tenían 1.  1+1=1; Caso contrario era 0;
		System.out.println(z+"("+Integer.toBinaryString(z)+") & ");
		System.out.println(y+"("+Integer.toBinaryString(y)+")  ");
		System.out.println("--------");
		System.out.println(zAndY+"("+Integer.toBinaryString(zAndY)+")  ");
		
		System.out.println();
		System.out.println("2) Operador OR  ***");
		// Or si al menos tiene un 1 en sus cifras , te retorna 1.
		System.out.println(x+"("+Integer.toBinaryString(x)+") | ");
		System.out.println(y+"("+Integer.toBinaryString(y)+")  ");
		System.out.println("--------");
		System.out.println(xOrY+"("+Integer.toBinaryString(xOrY)+")  ");
		
		System.out.println();
		System.out.println("3) Operador XOR  ***");
		// XOr diferentes dan como retorno 1, iguales retornan 0
		System.out.println(x+"("+Integer.toBinaryString(x)+") | ");
		System.out.println(z+"("+Integer.toBinaryString(z)+")  ");
		System.out.println("--------");
		System.out.println(xXorZ+"("+Integer.toBinaryString(xXorZ)+")  ");
		
		System.out.println();
		System.out.println("4) Operadores Binarios Complemento a nivel 2 ");
		int numeroUno = 1; //00000001
/*		0000 0001
 * 		1111 1110
 * 
 * 		1111 1110
 * 				1
 * 		=========
 * 		1111 1111
 * 
 * ** el resultado de sumar sus asignaciones para obtener el número en decimal.
 * 		-128 + 126
 * 		-2
 * 
 * ~x == (-x)-1
 * 	  == (-1)-1 = -2 */
		
		int nonUno = ~numeroUno;
		System.out.println("~"+numeroUno+" = "+nonUno);
		
		int numeroNegativo = -44;
		int nonNroNegativo = ~numeroNegativo;
		
		System.out.println("~"+numeroNegativo+" = "+nonNroNegativo);
		/* ~x == (-x)-1
		      == (--44)-1 = +43 */
		
		System.out.println();
		System.out.println("5) Operadores nivel Bit-- Desplazamientos");
		
		int numeroDos =  2;
		int numeroA = numeroDos << numeroDos;
		
		System.out.println(numeroDos+"("+Integer.toBinaryString(numeroDos)+")"+"<<"+numeroDos+"=="+numeroA+"("+Integer.toBinaryString(numeroA)+")");
		
		int numeroDiez = 10;
		int numeroB= numeroDiez >> numeroDos;
		
		System.out.println(numeroDiez+"("+Integer.toBinaryString(numeroDiez)+")"+">>"+numeroDos+"=="+numeroB+"("+Integer.toBinaryString(numeroB)+")");
		
		int nroNegativoDos = -2;
		System.out.println("Numero original negativo "+nroNegativoDos+" ("+Integer.toBinaryString(nroNegativoDos)+")");
		
		int numeroC = nroNegativoDos >> numeroDos;
		System.out.println(nroNegativoDos+"("+Integer.toBinaryString(nroNegativoDos)+")"+">>"+numeroDos+"=="+numeroC+"("+Integer.toBinaryString(numeroC)+")");
		
		int numeroD = nroNegativoDos >>> numeroDos;
		System.out.println(nroNegativoDos+"("+Integer.toBinaryString(nroNegativoDos)+")"+">>>"+numeroDos+"=="+numeroD+"("+Integer.toBinaryString(numeroD)+")");
		
		System.out.println("Resultado de desplazamiento");
		System.out.println(Integer.toBinaryString(numeroC));
		System.out.println(Integer.toBinaryString(numeroD));
		
		System.out.println("Contar longitud del resultado: ");
		System.out.println(Integer.toBinaryString(numeroC).length());
		System.out.println(Integer.toBinaryString(numeroD).length());
		
	}

}
