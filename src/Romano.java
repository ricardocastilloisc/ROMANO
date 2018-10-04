
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
		//el cual se indica en al incio del metdo
		
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
			System.out.println("continua");
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
		String Cadena =  "ix";
		//convocando al metodo
		System.out.println(romano(Cadena));
	}

}
