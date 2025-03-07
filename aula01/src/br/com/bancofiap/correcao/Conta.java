package br.com.bancofiap.correcao;

public class Conta {
	
	private Agencia agencia;
	private Banco banco;
	private Cliente cliente;
	private String numero;
	private double saldo = 0.0;
	
	public Conta(Agencia agencia, Banco banco, Cliente cliente, String numero) {
		super();
		this.agencia = agencia;
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

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		//sb.append(this.agencia.getBanco().getNome() + "\n");
		//sb.append(this.agencia.getNumero() + this.agencia.getNome() + "\n");
		sb.append(this.numero + "\n");
		sb.append(this.cliente.getNome());
		sb.append("------------------------------");
		
		return sb.toString();
	}

	
}
