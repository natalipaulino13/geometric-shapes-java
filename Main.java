package paq10;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Esfera e1 = new Esfera("pequeña", 5, "hierro");
		e1.asignarColor();
		System.out.println("La esfera " + e1.getTamanyo() + " pesa " + e1.calculoPeso() + " gr"
				+ " y cuesta pintarla de " + e1.transformar() + " " + e1.obtenerCoste() + " euros");

		Esfera e2 = new Esfera("mediana", 10, "madera");
		e2.asignarColor();
		System.out.println("La esfera " + e2.getTamanyo() + " pesa " + e2.calculoPeso() + " gr"
				+ " y cuesta pintarla de " + e2.transformar() + " " + e2.obtenerCoste() + " euros");

		Esfera e3 = new Esfera("grande", 15, "corcho");
		e3.asignarColor();
		System.out.println("La esfera " + e3.getTamanyo() + " pesa " + e3.calculoPeso() + " gr"
				+ " y cuesta pintarla de " + e3.transformar() + " " + e3.obtenerCoste() + " euros");

		
		System.out.println("\n");
		Cilindro c1 = new Cilindro("pequeño", 5, 10, "hierro");
		c1.asignarColor();
		System.out.println("El cilindro " + c1.getTamanyo() + " pesa " + c1.calculoPeso() + " gr"
				+ " y cuesta pintarlo de " + c1.transformar() + " " + c1.obtenerCoste() + " euros");

		Cilindro c2 = new Cilindro("mediano", 10, 15, "madera");
		c2.asignarColor();
		System.out.println("El cilindro " + c2.getTamanyo() + " pesa " + c2.calculoPeso() + " gr"
				+ " y cuesta pintarlo de " + c2.transformar() + " " + c2.obtenerCoste() + " euros");

		Cilindro c3 = new Cilindro("grande", 15, 20, "corcho");
		c3.asignarColor();
		System.out.println("El cilindro " + c3.getTamanyo() + " pesa " + c3.calculoPeso() + " gr"
				+ " y cuesta pintarlo de " + c3.transformar() + " " + c3.obtenerCoste() + " euros");

		
		System.out.println("\n");
		Ortoedro d1 = new Ortoedro("pequeño", 5, 6, 7, "hierro");
		d1.asignarColor();
		System.out.println("El ortoedro " + d1.getTamanyo() + " pesa " + d1.calculoPeso() + " gr"
				+ " y cuesta pintarlo de " + d1.transformar() + " " + d1.obtenerCoste() + " euros");

		Ortoedro d2 = new Ortoedro("mediano", 7, 8, 9, "madera");
		d2.asignarColor();
		System.out.println("El ortoedro " + d2.getTamanyo() + " pesa " + d2.calculoPeso() + " gr"
				+ " y cuesta pintarlo de " + d2.transformar() + " " + d2.obtenerCoste() + " euros");

		Ortoedro d3 = new Ortoedro("grande", 10, 11, 12, "corcho");
		d3.asignarColor();
		System.out.println("El ortoedro " + d3.getTamanyo() + " pesa " + d3.calculoPeso() + " gr"
				+ " y cuesta pintarlo de " + d3.transformar() + " " + d3.obtenerCoste() + " euros");

	}

}
