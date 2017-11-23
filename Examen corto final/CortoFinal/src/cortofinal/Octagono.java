package cortofinal;

public class Octagono implements Poligono{
	double l;
	double ap;
	

	public Octagono(double apotema, double lado) {
		l = lado;
		ap = apotema;
	}
	@Override
	public double perimetro() {
		double perimetro = 0;
		perimetro = (l* 8);
		return perimetro;
	}

	@Override
	public double area() {
		double area = 0;
		area = (perimetro()*ap);
		area  = area / 2;
		return area;
	}

}
