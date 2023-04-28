
public class Proyecto_Ing { 
	
	
	//Funci�n gen�rica para generar n�meros aleatorios FLOAT (Usada en: Ancho de Banda; Throughput; Latencia):
		public static float generaNumAleatorioFLOAT (float minimo, float maximo) {
			return (float)(Math.random()*(minimo-(maximo+1))+(maximo+1));
		}//llave (aleatorios con decimales)
		
	//Funci�n gen�rica para generar n�meros aleatorios INT (Usada en: Tasa de error de bits/BER ; Tr�fico de Datos/Flujo de Datos):
		public static int generaNumAleatorioINT (int minimo, int maximo) {
			return (int)(Math.random()*(minimo-(maximo+1))+(maximo+1));
		}//llave (aleatorios int)
	
	
	public static void main(String[] args) {

		
		////BLOQUE DE CONSTRUCCI�N DE VALORES////
		
		/*/Comprobaci�n de valores. En este bucle se comprueba que el n�mero ni supera 1000,ni es menor que 20. A base de imprimir aleatorios.
		for (int i=0; i<1000;i++) {
			double min=20;
			double max=1000;
			System.out.println (generaNumAleatorioDOUBLE(min,max));
		}(llave for)*/
	
		//ANCHO DE BANDA
		float minAnchoBanda=20;
		float maxAnchoBanda=1000;
		float valorAnchoBanda=generaNumAleatorioFLOAT(minAnchoBanda,maxAnchoBanda);
		System.out.println ("El Ancho de Banda es " + valorAnchoBanda + " Mbps.");	
		
		//THROUGHPUT
		float minThroughput=20;
		float maxThroughput=1000;
		float valorThroughput=generaNumAleatorioFLOAT(minThroughput,maxThroughput);
		System.out.println ("El Throughput es " + valorThroughput + " Mbps.");	
		
		//LATENCIA
		float minLatencia=0;
		float maxLatencia=500;
		float valorLatencia=generaNumAleatorioFLOAT(minLatencia,maxLatencia);
		System.out.println ("La Latencia es de " + valorLatencia + " miliSegundos(ms).");	

		//TASA DE ERROR DE BITS (BER) **************************NO ACABADO, SERIAS DUDAS********************************************
		int minBER=0;
		int maxBER=0;
		int valorBER = generaNumAleatorioINT(minBER,maxBER);
		System.out.println ("La Tasa de Error de Bits es de " + valorBER + "%.");
		
		//TR�FICO DE DATOS O FLUJO DE DATOS
		int minFlujoDatos=0;
		int maxFlujoDatos=1;
		int valorFlujoDatos = generaNumAleatorioINT(minFlujoDatos,maxFlujoDatos);
		System.out.println ("El Tr�fico de Datos es de " + valorFlujoDatos + " erlong/horas.");
		
		
		////BLOQUE DE EVALUACI�N DE VALORES////
		////BLOQUE DE CREACCI�N DE FICHERO////
		////BLOQUE DE FILTRADO/AN�LISIS DE FICHERO////
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//Llave del Main (NO BORRAR)

}//Llave de la Class (NO BORRAR)
