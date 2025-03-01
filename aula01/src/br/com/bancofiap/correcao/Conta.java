package br.com.bancofiap.correcao;

public class Conta {
	
	private Banco banco;
	private Cliente cliente;
	private String numero;
	private double saldo = 0.0;
	
	public Conta(Banco banco, Cliente cliente, String numero) {
		super();
		this.banco = banco;
		this.cliente = cliente;
		this.numero = numero;
	}
	
	public Conta(Banco banco, Cliente cliente, String numero, double saldo) {
		super();
		this.banco = banco;
		this.cliente = cliente;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public Banco getBanco() {
		return banco;
	}

	public Cliente getCliente() {
		return cliente;
	}


	public String getNumero() {
		return numero;
	}


	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public double obterSaldo() {
		return this.saldo;
	}
	
}
