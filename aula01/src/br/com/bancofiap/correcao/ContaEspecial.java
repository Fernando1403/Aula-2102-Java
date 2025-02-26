package br.com.bancofiap.correcao;

public class ContaEspecial extends Conta{

	private double limite;

	public ContaEspecial(Banco banco, Cliente cliente, String numero, double saldo, double limite) {
		super(banco, cliente, numero, saldo);
		this.limite = limite;
	}
	
	public double getLimite() {
		return limite;
	}

	public double obterSaldo() {
		return super.obterSaldo() + this.limite;
	}
}
