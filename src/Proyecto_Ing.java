
public class Proyecto_Ing { 
	
	//1. Funci�n del valor del Ancho de Banda (valor entre 20 y 1000 Mbps) 
	public static String AnchoBanda() {
		double ValorAnchoBanda = (double)(Math.random()*(1000-20+1));
		String bandera = "  ";
		//El 90% de este rango ser�an valores superiores a 890,91
		//Por lo tanto, evaluamos el aleatorio del Ancho de Banda:
		if (ValorAnchoBanda>=890.91) {
			bandera="�ALERTA!: El Ancho de Banda ha superado el 90%.";
		}
		else {
			bandera="Ancho de Banda estable";
		}
		return bandera;
	}
	//2. Funci�n del valor del Throughput (valor entre 20 y 1000 Mbps)
	//3. Funci�n del valor de la Latencia (valor entre 0 y 500 milisegundos)
	//4. Funci�n del valor de la Tasa de Errores de Bits, BER (valor entre: 10-9%, 10-6%, 10-3%)
	//5. Funci�n del valor del Tr�fico de Datos o Flujo de Datos (valor entre 0 y 1 erlang/horas)
	
	
	
	public static void main(String[] args) {

		//Evaluaci�n del Ancho de Banda
		double AnchoBanda = (double)(Math.random()*(1000-20+1));
		String ValorAnchoBanda = " ";
		//El 90% de este rango ser�an valores superiores a 890,91
		//Por lo tanto, evaluamos el aleatorio del Ancho de Banda:
		if (AnchoBanda>=890.91) {
			ValorAnchoBanda = "Error en el Ancho de Banda. ";
			System.out.println (ValorAnchoBanda + "Es: " + AnchoBanda);
			
		}
		else {
			ValorAnchoBanda = "El Ancho de Banda est� en valores correctos. ";
			System.out.println (ValorAnchoBanda + "Es: " + AnchoBanda);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//Main

}//CLASS
