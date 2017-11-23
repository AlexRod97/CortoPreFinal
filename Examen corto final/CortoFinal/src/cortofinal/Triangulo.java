package cortofinal;

public class Triangulo implements Poligono {
	double b;
	double a;
	double pLado, sLado, tLado;
	
	public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
	pLado = lado1;
	sLado = lado2;
	tLado = lado3;
	b = base;
	a = altura;
	}

	@Override
	public double perimetro() {
		double perimetro = 0;
		perimetro = pLado + sLado + tLado;
		return perimetro;
	}

	@Override
	public double area() {
		double area = 0;
		area = b * a;
		area = area / 2;
		return area;
	}	


}




