package cortofinal;

import cortofinal.Cuadrado;
import cortofinal.Cuadrilatero;
import cortofinal.Hexagono;
import cortofinal.Octagono;
import cortofinal.Pentagono;
import cortofinal.Rectangulo;
import cortofinal.Triangulo;
import cortofinal.TrianguloEquilatero;
import cortofinal.TrianguloEquilatero;
import cortofinal.TrianguloIsoceles;

public class FabricaFiguras {
	
	Pentagono pentagono = new Pentagono(2, 8);
	Hexagono hexagono = new Hexagono(3, 4);
	Octagono octagono = new Octagono(4, 10);
	Cuadrilatero cuadrilatero = new Cuadrilatero(5);
	
	Cuadrado cuadrado = new Cuadrado(4);
	Rectangulo rectangulo = new Rectangulo(6);
	
	Triangulo triangulo = new Triangulo(4,4,1,2,3);
	TrianguloEquilatero tEquilatero = new TrianguloEquilatero(5,5,3,3,3);
	TrianguloIsoceles tIsoceles = new TrianguloIsoceles(6,6,2,3,1);

}
