package cortofinal;

public class Cuadrado extends Cuadrilatero{

double l;
	
	public Cuadrado(double lado) {
		super(lado);
		l = lado;
	}
	

	@Override
	public double perimetro() {
		double perimetro = 0;
		perimetro = l*4;
		return perimetro;
	}

	@Override
	public double area() {
		double area = 0;
		area = (l*l);
		return area;
	}

}
