package br.com.bancofiap.correcao;

public class ContaRemunerada extends Conta{

	private double taxaRemuneracao = 0.0;
	
	public double saldoRemunerado;
	
	public ContaRemunerada (Banco banco, Cliente cliente, String numero, double saldo, double taxaRemuneracao) {
		super(banco, cliente, numero, saldo);
		this.taxaRemuneracao = taxaRemuneracao;
	}
	
	public double getTaxaRemuneracao() {
		return taxaRemuneracao;
	}

	public void remunerarConta() {
		saldoRemunerado = super.obterSaldo() * this.taxaRemuneracao;
	}
	
	public double obterSaldo() {
		return this.saldoRemunerado;
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Conta remunerada \n" );
		sb.append("------------------------------");
		sb.append(super.toString());
		
		return sb.toString();
	}
}
