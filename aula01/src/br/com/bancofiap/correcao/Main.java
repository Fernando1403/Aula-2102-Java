package br.com.bancofiap.correcao;

public class Main {
	
	public static void main(String[] args) {
		
		Banco bancoFiap = new Banco();
		bancoFiap.setNome("Banco FIAP");
		
		Cliente cliente = new Cliente();
		cliente.setNome("Anderson");
		
		Cliente clienteEspecial = new Cliente();
		clienteEspecial.setNome("Fernando");
		
		Conta conta = bancoFiap.criar("1234", cliente, 100.00);
		
		ContaEspecial contaEspecial = bancoFiap.criar("1657", clienteEspecial, 1000, 100.00);
				
		ContaRemunerada contaRemunerada = bancoFiap.criar("9832", 1.20 ,clienteEspecial, 100.00);
		contaRemunerada.remunerarConta();
		
		System.out.println("O saldo da conta numero " + conta.getNumero() + " do cliente " +
		conta.getCliente().getNome() + " eh " + conta.obterSaldo());
		
		System.out.println("O saldo da conta numero " + contaEspecial.getNumero() + " do cliente " +
				contaEspecial.getCliente().getNome() + " eh " + contaEspecial.obterSaldo());
		
		System.out.println("O saldo da conta numero " + contaRemunerada.getNumero() + " do cliente " +
				contaRemunerada.getCliente().getNome() + " eh " + contaRemunerada.obterSaldo());
	}
}
