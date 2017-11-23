package cortofinal;

public class TrianguloEquilatero extends Triangulo{
	
	double b;
	double a;
	double l;
	
	public TrianguloEquilatero(double base, double altura, double lado1, double lado2, double lado3) {
		super(base, altura, lado1, lado2, lado3);
		l= lado1;
	}

	@Override
	public double perimetro() {
		double perimetro = 0;
		perimetro = (l*3);
		return perimetro;
	}

	@Override
	public double area() {
		double area = 0;
		area = (b*a);
		area  = area / 2;
		return area;
	}

}
