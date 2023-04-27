
public class Proyecto_Ing { 
	
	//1. Función del valor del Ancho de Banda (valor entre 20 y 1000 Mbps) 
/*	public static double AnchoBanda() {
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
		return ValorAnchoBanda;
	}*/
	
	public static double AnchoBanda() {
		double ValorAnchoBanda = (double)(Math.random()*(1000-20+1));
		return ValorAnchoBanda;
	}
	
	
	//2. Función del valor del Throughput (valor entre 20 y 1000 Mbps)
	public static double Throughput() {
		double ValorThroughput = (double)(Math.random()*(1000-20+1));
		return ValorThroughput;
	}
	
	//3. Función del valor de la Latencia (valor entre 0 y 500 milisegundos)
	public static double Latencia() {
		double ValorLatencia = (double)(Math.random()*(500-0+1));
		return ValorLatencia;
	}
	
	//4. Función del valor de la Tasa de Errores de Bits, BER (valor entre: 10-9, 10-6, 10-3). Medido en porcentajes.
	
	/* Esto es una movida. 
	 * Son números elevados a negativo. 
	 * Ejemplo: 10^-6 => 1.000.000 bits transmitidos, 1 bit tenía error. => 1/10^6 = 10^-6
	 * Claudia, yo entiendo que a eso se refiere el enunciado, que se refiere a que esos menos son que están elevados.
	 * 
	 */
	
	
	//5. Función del valor del Tráfico de Datos o Flujo de Datos (valor entre 0 y 1 erlang/horas)
	public static double TraficoDatos() {
		double ValorTraficoDatos = (double)(Math.random()*(1-0+1));
		return ValorTraficoDatos;
	}
	
	
	
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
