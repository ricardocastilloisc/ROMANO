import java.util.Scanner;

public class Romano {
	
	//la matriz donde estaran todos los numeros romanos
	static String NumerosRomanos[][] = 
		{
				{ "I", "1" },
				{ "V", "5" },
				{ "X", "10" },
				{ "L", "50" },
				{ "C", "100" },
				{ "D", "500" },
				{ "M", "1000" }
		};
	
	//metodo donde se realizaran todas las operaciones
	static public  String romano(String texto) 
	{
		//cadena que estaremos manipulando
		//convertimos a mayusculas
		String cadenaAmanipular = texto.toUpperCase();
		//conteos donde estos valores
		//hasta 3 veces se pueden repetir
		int ConteoNumeroCompuestoI = 0;
		int ConteoNumeroCompuestoX = 0;
		int ConteoNumeroCompuestoC = 0;
		int ConteoNumeroCompuestoM = 0;
		//No se puden repetir nunca
		int ConteoNumeroCompuestoV = 0;
		int ConteoNumeroCompuestoL = 0;
		int ConteoNumeroCompuestoD = 0;
		
		//recorrer el texto
		for(int recorrido = 0; recorrido<texto.length();recorrido++)
		{
			//condiciones de conteo con las sumas correpondientes
			//de acuerdo a la equivalencia
			if(Character.toString(cadenaAmanipular.charAt(recorrido)).equals("I"))
				ConteoNumeroCompuestoI++;
			if(Character.toString(cadenaAmanipular.charAt(recorrido)).equals("X"))
				ConteoNumeroCompuestoX++;
			if(Character.toString(cadenaAmanipular.charAt(recorrido)).equals("C"))
				ConteoNumeroCompuestoC++;
			if(Character.toString(cadenaAmanipular.charAt(recorrido)).equals("M"))
				ConteoNumeroCompuestoM++;
			if(Character.toString(cadenaAmanipular.charAt(recorrido)).equals("V"))
				ConteoNumeroCompuestoV++;
			if(Character.toString(cadenaAmanipular.charAt(recorrido)).equals("L"))
				ConteoNumeroCompuestoL++;
			if(Character.toString(cadenaAmanipular.charAt(recorrido)).equals("D"))
				ConteoNumeroCompuestoD++;
		};
		//impresiones de prueba
		/*
		System.out.println(ConteoNumeroCompuestoI);
		System.out.println(ConteoNumeroCompuestoX);
		System.out.println(ConteoNumeroCompuestoC);
		System.out.println(ConteoNumeroCompuestoM);
		System.out.println(ConteoNumeroCompuestoV);
		System.out.println(ConteoNumeroCompuestoL);
		System.out.println(ConteoNumeroCompuestoD);
		*/
		
		//condicion de seguir el proceso 
		//el cual se indica en al incio del metodo
		
		if
		(
				ConteoNumeroCompuestoI<4 &&
				ConteoNumeroCompuestoX<4 &&
				ConteoNumeroCompuestoC<4 &&
				ConteoNumeroCompuestoM<4 &&
				ConteoNumeroCompuestoV<2 &&
				ConteoNumeroCompuestoL<2 &&
				ConteoNumeroCompuestoD<2
				
		) 
		{
			//array donde tendremos ya los valores convertidos a decimal segun su 
			//su valor equivalente
			int convertirValores [] = new int[cadenaAmanipular.length()];
			//recorrido
			for(int recorrido = 0; recorrido<cadenaAmanipular.length();recorrido++)
			{
				//valor que se nos otrogara al buscarlo en la
				//matriz donde esta los equivalentes
				String ValorStringNumerico = "0";
				//recorremos la matriz donde estan los equivalentes
				for(int recorridointerno = 0; recorridointerno<NumerosRomanos.length; recorridointerno++) 
				{
					//condicion para encontrar los valores de la matriz de equivalencia
					if(Character.toString(cadenaAmanipular.charAt(recorrido))
							.equals(NumerosRomanos[recorridointerno][0])) 
					{
						//extraemos el valor
						ValorStringNumerico = NumerosRomanos[recorridointerno][1];
						//rompemos el ciclo
						break;
					};
				}
				//condicion de si hay una letra que no debe haber en 
				//los numeros romanos
				if(Integer.parseInt(ValorStringNumerico)==0) 
				{
					//mostrar mensaje de error
					cadenaAmanipular = "Hay un error en tu numero romano";
				}else 
				{
					//si no hay error
					//poner a la mmatriz que quermos
					convertirValores [recorrido] = Integer.parseInt(ValorStringNumerico);
				}
				;
				
			}
			
			//valor decimal que sera el final de la transformacion 
			
			int valorFinal = 0;
			//recorremos la matrix com de los numeros ya terminados como es
			//terner en cuenta que el ultimo valor solo se suma
			for(int recorridoValores = 0; recorridoValores<convertirValores.length-1; recorridoValores++) 
			{
				//si el valor actual es mayor o igual siguiente suma
				if(convertirValores[recorridoValores]>=convertirValores[recorridoValores+1]) 
				{
					valorFinal = valorFinal + convertirValores[recorridoValores];
					//pero si es el penuntimo valor entonces suma el ultimo valor
					if(recorridoValores+1==convertirValores.length-1) 
					{
						//has la suma
						valorFinal = valorFinal + convertirValores[recorridoValores+1];
					}
				}else 
				{
					//si es menor entonces haces una resta
					valorFinal = valorFinal - convertirValores[recorridoValores];
					//si es el ultimo pues suma el ultimo valor
					if(recorridoValores+1==convertirValores.length-1) 
					{
						//pones al valor final
						valorFinal = valorFinal + convertirValores[recorridoValores+1];
					}
				}
				
			};
			
			//lo tranformamos a cadena para mostrar en el retorno
			cadenaAmanipular = Integer.toString(valorFinal);
		}else
		{
			//si no cumple la funcion es que esta repetido
			cadenaAmanipular = "Hay repetidos que no deben de haber";
		}
		return cadenaAmanipular;
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//empezando la aplicacion 
		
		//cadena que se utilizara para todas la conversiones
		
		String Cadena;
		// escanea lo que teclemos en consola
		Scanner entrada = new Scanner(System.in);
		// pedimos al usuario que nos diga el romano que quiera convertir
		System.out.print("Ingrese el romano que quiera convertir: ");
		// lo convierte a la variable principal
		Cadena = entrada.nextLine();
		//convocando al metodo
		System.out.println(romano(Cadena));
	}

}
