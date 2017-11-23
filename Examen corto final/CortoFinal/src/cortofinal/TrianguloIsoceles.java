package cortofinal;

public class TrianguloIsoceles extends Triangulo {
	
	double b;
	double a;
	double pLado, sLado, tLado;
	
	public TrianguloIsoceles(double base, double altura, double lado1, double lado2, double lado3) {
		
		super(base, altura, lado1, lado2, lado3);
		pLado = lado1;
		sLado = lado2;
	    tLado = lado3;
	}

	@Override
	public double perimetro() {
		double perimetro = 0;
		perimetro = (pLado + sLado + tLado);
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
