import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class TestFaACe {

	public static void main(String[] args)  throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader entrada = new BufferedReader(isr);
		int ops=0;
		do
		{
			System.out.println("ingrese opción: ");
			System.out.println("1.- Calcular temperatura de Fahrenheit a Celsius: ");
			System.out.println("2.- Calcular temperatura de Celsius a Fahrenheit: ");
			System.out.println("3.- Salir.");
			ops=Integer.parseInt(entrada.readLine());
		switch(ops)
		 {		 		
		 		case 1:
		 			System.out.print("\nIngrese temperatura en Fahrenheit--> ");
		 			float celsius=Float.parseFloat(entrada.readLine());
		 			FaACe temperaturaCel = new FaACe(celsius);
		 			System.out.println(" la temperatura en celsius es: "+temperaturaCel.fahrenheitACelsius());
		 			break;
		 		case 2:
		 			System.out.print("\nIngrese temperatura en Celsius--> ");
		 			float Fahrenheit=Float.parseFloat(entrada.readLine());
		 			FaACe temperaturaFah = new FaACe(Fahrenheit);
		 			System.out.println(" la temperatura en celsius es: "+temperaturaFah.celsiusAFahrenheit());
		 			break;
		 		case 3: 
		 			System.out.println("Adios!");
		 		break;
		 }
			
		}while(ops<4);
		
	
		
		
	}

}
