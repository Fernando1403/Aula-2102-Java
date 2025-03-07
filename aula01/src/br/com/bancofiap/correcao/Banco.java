package br.com.bancofiap.correcao;

public class Banco {

	private String nome;
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Conta criar(Agencia agencia, String numero, Cliente cliente, double saldo) {
		Conta conta = new Conta(agencia, this, cliente, numero);  
	    return conta;
	}
	
	public ContaEspecial criar(Agencia agencia, String numero, Cliente cliente, double saldo, double limite) {
	    ContaEspecial conta = new ContaEspecial(this, cliente, numero, saldo, limite);
	    return conta;
	}

	public ContaRemunerada criar(Agencia agencia, String numero, double taxaRemuneracao, Cliente cliente, double saldo) {
	    ContaRemunerada conta = new ContaRemunerada(this, cliente, numero, saldo, taxaRemuneracao);
	    return conta;
	}
	
}
