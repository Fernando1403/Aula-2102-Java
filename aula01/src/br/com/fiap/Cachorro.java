package br.com.fiap;

public class Cachorro extends Animal{

	public void fazerSom() {
		System.out.println("O cachorro " + super.getNome() + " late!");
	}
}
