package classe_exemplos;

public class AreaCirc {

	double raio;
	final static double PI = 3.14;
	
	public AreaCirc(double raio) {
		this.raio = raio;
	}
	
	double area() {
		return Math.pow(raio, 2) * PI;
	}
	
}
