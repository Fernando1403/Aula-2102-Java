package br.com.bancofiap.correcao;

public class Conta {
	
	private Banco banco;
	private Cliente cliente;
	private String numero;
	private double saldo = 0.0;
	
	
	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public double obterSaldo() {
		return this.saldo;
	}
	
}
