
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
		
		
		return texto;
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//empezando la aplicacion 
		//cadena que se utilizara para todas la conversiones
		String Cadena =  "xiv";
		//convocando al metodo
		System.out.println(romano(Cadena));
	}

}
