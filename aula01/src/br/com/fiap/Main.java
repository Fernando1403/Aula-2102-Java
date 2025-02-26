package br.com.fiap;

public class Main {
	public static void main (String[] args) {
		
		Animal animal = new Animal();
		animal.setNome("Generico");
		animal.fazerSom();
		
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Rex");
		cachorro.fazerSom();
		
		Gato gato = new Gato();
		gato.setNome("Bolota");
		gato.fazerSom();
		
	}
}
