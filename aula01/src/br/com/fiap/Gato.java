package br.com.fiap;

public class Gato extends Animal{

	public void fazerSom() {
		System.out.println("O gato " + super.getNome() + " mia!");
	}
}
