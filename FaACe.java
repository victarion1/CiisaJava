/*
 * Lea una temperatura en grados Fahrenheit y la transforme a grados
 * Celsius usando la fórmula: C = ( 5/9 ) * ( F - 32 )
 */
public class FaACe {

	private float Celsius;
	private float Fahrenheit;
	
	public FaACe(float Fahrenheit) {
		this.Fahrenheit=Fahrenheit;
	
	}

	public float getFahrenheit() {
		return Fahrenheit;
	}
	
	
	public float getCelsius() {
		return Celsius;
	}

	public float fahrenheitACelsius()
	{
		return ( 5/9F ) * ( Fahrenheit - 32 );
	}
	
	public float celsiusAFahrenheit()
	{
		return ((9/5F * Celsius) + 32);
	}

}
