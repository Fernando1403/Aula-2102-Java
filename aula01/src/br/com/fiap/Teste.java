package br.com.fiap;

public class Teste {
	
	//private final int numero = 2;
	
	private static int contador = 0;
	private int contador02 = 0;
	
	public void incremento() {
		contador++;
		contador02++;
	}
	
	public void exibirContadores() {
		System.out.println("Valor estático (classe): " + contador);
		System.out.println("Valor não estático (objeto): " + contador02);
	}
	
	public static void main(String[] args) {
		
		Teste t = new Teste();
		
		t.incremento();
		t.exibirContadores();
		
		System.out.println("--------------------------------");
		
		Teste t2 = new Teste();
		
		t2.incremento();
		t2.exibirContadores();
		
		System.out.println("---------------------------------");
		
		Teste t3 = new Teste();
		
		t3.incremento();
		t3.exibirContadores();
		
		
	}

}
