package cortofinal;

public class Cuadrilatero implements Poligono {
	
	double lado;
	

	public Cuadrilatero(double l) {
		lado = l;	
	}
	
	@Override
	public double perimetro() {
		double perimetro = 0;
		perimetro = (lado* 4);
		return perimetro;
	}

	@Override
	public double area() {
		double area = 0;
		area = (lado*lado);
		return area;
	}
	

}
