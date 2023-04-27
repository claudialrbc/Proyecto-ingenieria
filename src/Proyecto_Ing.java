
public class Proyecto_Ing { 
	
	
	
	public static void main(String[] args) {

		//Evaluación del Ancho de Banda
		double AnchoBanda = (double)(Math.random()*(1000-20+1));
		String ValorAnchoBanda = " ";
		//El 90% de este rango serían valores superiores a 890,91
		//Por lo tanto, evaluamos el aleatorio del Ancho de Banda:
		if (AnchoBanda>=890.91) {
			ValorAnchoBanda = "Error en el Ancho de Banda. ";
			System.out.println (ValorAnchoBanda + "Es: " + AnchoBanda);
			
		}
		else {
			ValorAnchoBanda = "El Ancho de Banda está en valores correctos. ";
			System.out.println (ValorAnchoBanda + "Es: " + AnchoBanda);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//Main

}//CLASS
