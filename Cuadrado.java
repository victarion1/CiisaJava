
public class Cuadrado {

	private float lado;
	
	public Cuadrado(float lado) {
		// TODO Auto-generated constructor stub
		this.lado=lado;
	}
	public void ampiar(float factor)
	{
		 this.lado=lado*factor;
	}
	public float area()
	{
		return lado*lado;
	}
	public float perimetro()
	{
		return lado*2;
	}

}
