package cortofinal;

public class Rectangulo extends Cuadrilatero {
	
	double a; 
	double l;
	
	public double getAnchura() {
		return a; 
	}

	public void setAnchura(double an) {
		a = an;
	}

	public double getLongitud() {
		return l;
	}

	public void setLongitud(double longitud) {
		l = longitud;
	}

	public Rectangulo(double lado) {
		super(lado);
		a = lado;
	}
	
	@Override
	public double perimetro() {
		double perimetro = 0;
		perimetro = (l *2);
		perimetro = perimetro + (a *2);
		return perimetro;
	}

	@Override
	public double area() {
		double area = 0;
		area = (l * a);
		return area;
	}

}
