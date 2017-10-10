import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestFaACe {

	public static void main(String[] args)  throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader entrada = new BufferedReader(isr);
		
		System.out.print("\nIngrese temperatura en Fahrenheit--> ");
		float celsius=Float.parseFloat(entrada.readLine());
		
		FaACe temperatura = new FaACe(celsius);
		
		System.out.println(" la temperatura en celsius es: "+temperatura.fahrenheitACelsius());
	}

}
