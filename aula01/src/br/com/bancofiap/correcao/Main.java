package br.com.bancofiap.correcao;

public class Main {
	
	public static void main(String[] args) {
		
		Banco bancoFiap = new Banco();
		bancoFiap.setNome("Banco FIAP");
		
		System.out.println(bancoFiap);
		
		Agencia agencia1 = new Agencia(bancoFiap, "000-01", "Aclimacao");
		Agencia agencia2 = new Agencia(bancoFiap, "000-02", "Paulista");
		
		Cliente cliente = new Cliente();
		cliente.setNome("Anderson");
		
		Cliente clienteEspecial = new Cliente();
		clienteEspecial.setNome("Fernando");
		
		Conta contaComum = new Conta(bancoFiap, clienteEspecial, "0001", 100.00);
		
		Conta conta = bancoFiap.criar(agencia1, "1234", cliente, 100.00);
		ContaEspecial contaEspecial = bancoFiap.criar(agencia2, "1657", clienteEspecial, 1000, 100.00);
		ContaRemunerada contaRemunerada = bancoFiap.criar(agencia1, "9832", 1.20, clienteEspecial, 100.00);
		
		contaRemunerada.remunerarConta();
		
		System.out.println(contaComum);
		System.out.println(contaEspecial);
		System.out.println(contaRemunerada);
		
		
//		System.out.println("O saldo da conta numero " + conta.getNumero() + " do cliente " +
//		conta.getCliente().getNome() + " eh " + conta.obterSaldo());
//		
//		System.out.println("O saldo da conta numero " + contaEspecial.getNumero() + " do cliente " +
//				contaEspecial.getCliente().getNome() + " eh " + contaEspecial.obterSaldo());
//		
//		System.out.println("O saldo da conta numero " + contaRemunerada.getNumero() + " do cliente " +
//				contaRemunerada.getCliente().getNome() + " eh " + contaRemunerada.obterSaldo());
	}
}
