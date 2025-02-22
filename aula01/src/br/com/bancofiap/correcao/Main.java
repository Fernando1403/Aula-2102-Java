package br.com.bancofiap.correcao;

public class Main {
	
	public static void main(String[] args) {
		
		Banco bancoFiap = new Banco();
		bancoFiap.setNome("Banco FIAP");
		
		Conta conta = bancoFiap.criar("1234","Fernando");
		conta.depositar(100.00);
		
		System.out.println("O saldo da conta numero " + conta.getNumero()
		+ " eh " + conta.obterSaldo());
	}
}
