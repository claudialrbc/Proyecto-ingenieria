
public class Proyecto_Ing { 
	
	//1. Función del valor del Ancho de Banda (valor entre 20 y 1000 Mbps) 
	public static String AnchoBanda() {
		double ValorAnchoBanda = (double)(Math.random()*(1000-20+1));
		String bandera = "  ";
		//El 90% de este rango serían valores superiores a 890,91
		//Por lo tanto, evaluamos el aleatorio del Ancho de Banda:
		if (ValorAnchoBanda>=890.91) {
			bandera="¡ALERTA!: El Ancho de Banda ha superado el 90%.";
		}
		else {
			bandera="Ancho de Banda estable";
		}
		return bandera;
	}
	//2. Función del valor del Throughput (valor entre 20 y 1000 Mbps)
	//3. Función del valor de la Latencia (valor entre 0 y 500 milisegundos)
	//4. Función del valor de la Tasa de Errores de Bits, BER (valor entre: 10-9%, 10-6%, 10-3%)
	//5. Función del valor del Tráfico de Datos o Flujo de Datos (valor entre 0 y 1 erlang/horas)
	
	
	
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
