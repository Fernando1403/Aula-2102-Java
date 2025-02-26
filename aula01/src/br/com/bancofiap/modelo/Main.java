package br.com.bancofiap.modelo;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Seja Bem vindo ao Banco FIAP");
		
		Conta conta = new Conta();
		
		conta.setNumConta(12345);
		conta.setSaldo(0);
		
		Cadastro cadastro = new Cadastro();
		
		cadastro.setNumConta(conta.getNumConta());
		cadastro.setNome("Fernando");
		cadastro.setCPF(564629855);
		cadastro.setSaldo(conta.getSaldo());
		
		System.out.println(cadastro);
		
		cadastro.BonusFIAP();
		
		System.out.println(cadastro);
		
		cadastro.ObterSaldo();
		
		System.exit(0);
	}
}
