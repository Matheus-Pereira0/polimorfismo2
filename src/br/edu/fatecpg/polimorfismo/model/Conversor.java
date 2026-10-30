package br.edu.fatecpg.polimorfismo.model;

public class Conversor {
	public int temperatura;
	public double quilometros;
	public String string;
	public void converter(int temperatura) {
		System.out.println(temperatura + "°C = " + (temperatura*1.8 + 32) + "°F");
	}
	
	public void converter(double quilometros) {
		System.out.println(quilometros + " KM: " + (quilometros*0.6214) + " milhas");
	}
	
	public void converter(String string) {
		System.out.println(string.toUpperCase());
	}
}
