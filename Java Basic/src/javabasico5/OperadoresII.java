package javabasico5;
/**
 * 
 * @author Manuel García
 *
 */
public class OperadoresII {

	public static void main(String[] args) {
		
		
		//1. Operador Ternario
		int primerNumero = 10;
		int segundoNumero = 5;
		
		int resultado = (primerNumero>segundoNumero)?primerNumero:segundoNumero;
		System.out.println("El resultado es: "+resultado);
		resultado = (primerNumero>segundoNumero)?segundoNumero:primerNumero;
		System.out.println("El resultado es: "+resultado);
		
		//Operadores relacionales
		
		int tercerNumero = 2;
		int cuartoNumero = 7;
		int quintoNumero = 2;
		
		String resultadoCadena = (tercerNumero == quintoNumero)?"Verdadero":"Falso";
		System.out.println("1. El resultado cadena es: "+resultadoCadena);
		
		resultadoCadena = (tercerNumero == quintoNumero)?"Falso":"Verdadero";
		System.out.println("2. El resultado cadena es: "+resultadoCadena);
		
		resultadoCadena = (tercerNumero == cuartoNumero)?"Verdader":"Falso";
		System.out.println("3. El resultado cadena es: "+resultadoCadena);
		
		//tercerNumero = 2 // cuartoNumero=7 //quintoNumero = 2
		resultadoCadena = (tercerNumero != cuartoNumero)?"Verdadero":"Falso";
		System.out.println("4. El resultado cadena es: "+resultadoCadena);
		resultadoCadena = (tercerNumero != quintoNumero)?"Verdadero":"Falso";
		System.out.println("5. El resultado cadena es: "+resultadoCadena);
		
		//>tercerNumero = 2 // cuartoNumero=7 //quintoNumero = 2
		resultadoCadena = (tercerNumero > quintoNumero)?"Verdadero":"Falso";
		System.out.println("6. El resultado cadena es: "+resultadoCadena);
		
		resultadoCadena = (cuartoNumero > quintoNumero)?"Verdadero":"Falso";
		System.out.println("7. El resultado cadena es: "+resultadoCadena);
		
		//<tercerNumero = 2 // cuartoNumero=7 //quintoNumero = 2
		resultadoCadena = (tercerNumero < quintoNumero)?"Verdadero":"Falso";
		System.out.println("8. El resultado cadena es: "+resultadoCadena);
		
		resultadoCadena = (quintoNumero < cuartoNumero)?"Verdadero":"Falso";
		System.out.println("9. El resultado cadena es: "+resultadoCadena);
		
		//>=tercerNumero = 2 // cuartoNumero=7 //quintoNumero = 2
		resultadoCadena = (tercerNumero >= cuartoNumero)?"Verdadero":"Falso";
		System.out.println("10. El resultado cadena es: "+resultadoCadena);
		
		resultadoCadena = (cuartoNumero >= quintoNumero)?"Verdadero":"Falso";
		System.out.println("11. El resultado cadena es: "+resultadoCadena);
		
		//<=tercerNumero = 2 // cuartoNumero=7 //quintoNumero = 2
		resultadoCadena = (cuartoNumero <= tercerNumero)?"Verdadero":"Falso";
		System.out.println("12. El resultado cadena es: "+resultadoCadena);
		
		resultadoCadena = (tercerNumero <= quintoNumero)?"Verdadero":"Falso";
		System.out.println("13. El resultado cadena es: "+resultadoCadena);
		
	
		System.out.println("*********************");
		int sextoNumero = 3;
		int septimoNumero = 9;
		
		System.out.println("14. El resultado de ("+sextoNumero+" == "+septimoNumero+") es "+(sextoNumero==septimoNumero));
		
		System.out.println("15. El resultado de ("+sextoNumero+" != "+septimoNumero+") es "+(sextoNumero!=septimoNumero));
		
		System.out.println("16. El resultado de ("+sextoNumero+" > "+septimoNumero+") es "+(sextoNumero > septimoNumero));
		
		System.out.println("17. El resultado de ("+sextoNumero+" < "+septimoNumero+") es "+(sextoNumero < septimoNumero));
		
		System.out.println("18. El resultado de ("+sextoNumero+" >= "+septimoNumero+") es "+(sextoNumero >= septimoNumero));
		
		System.out.println("19. El resultado de ("+sextoNumero+" <= "+septimoNumero+") es "+(sextoNumero <= septimoNumero));
		
		
		
	}

}
