package paq10;

import java.util.*;

public class Cilindro {

	private boolean color; // false: azul, true:verde
	private String tamanyo;
	private double radio;
	private double altura;
	private String material;

	
	public Cilindro() {
		super();
	}

	public Cilindro(String tamanyo, double radio, double altura) {
		super();
		this.tamanyo = tamanyo;
		this.radio = radio;
		this.altura = altura;
	}

	public Cilindro(String tamanyo, double radio, double altura, String material) {
		super();
		this.tamanyo = tamanyo;
		this.radio = radio;
		this.altura = altura;
		this.material = material;
	}

	
	public boolean isColor() {
		return color;
	}

	public void setColor(boolean color) {
		this.color = color;
	}

	public String getTamanyo() {
		return tamanyo;
	}

	public void setTamanyo(String tamanyo) {
		this.tamanyo = tamanyo;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	

	public void asignarColor() {
		Random r = new Random();
		this.color = r.nextBoolean();
	}

	public String transformar() {
		if (this.color == false) {
			return "azul";
		} else {
			return "verde";
		}
	}

	public double calcularSuperficie() {
		double total = 2 * Math.PI * this.radio * (this.radio + this.altura);
		total = Math.round(total * 100.0) / 100.0;
		return total;
	}

	public double calcularVolumen() {
		double total2 = Math.PI * Math.pow(this.radio, 2) * this.altura;
		total2 = Math.round(total2 * 100.0) / 100.0;
		return total2;
	}

	public double calcularDensidad() {
		switch (this.material) {
		case "corcho":
			return 0.2;

		case "madera":
			return 0.7;

		case "hierro":
			return 7.87;

		default:
			return 0;
		}
	}

	public double calculoPeso() {
		double pesoCalculado = calcularVolumen() * calcularDensidad();
		pesoCalculado = Math.round(pesoCalculado * 100.0) / 100.0;
		return pesoCalculado;
	}

	public double obtenerCoste() {

		double precio = 0;

		if (this.color == false) {

			switch (this.material) {
			case "corcho":
				precio = 0.06;
				break;

			case "madera":
				precio = 0.08;
				break;

			case "hierro":
				precio = 0.10;
				break;
			}
		} else {
			switch (this.material) {
			case "corcho":
				precio = 0.05;
				break;

			case "madera":
				precio = 0.07;
				break;

			case "hierro":
				precio = 0.09;
				break;
			}
		}

		double costeTotal = calcularSuperficie() * precio;
		costeTotal = Math.round(costeTotal * 100.0) / 100.0;
		return costeTotal;
	}

}
