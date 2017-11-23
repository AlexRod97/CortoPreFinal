package cortofinal;

public class Pentagono implements Poligono {
	
	double l;
	double ap;	

	public Pentagono(double apotema, double lado) {
		l = lado;
		ap = apotema;
	}
	
	@Override
	public double perimetro() {
		double perimetro = 0;
		perimetro = (l* 5);
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
