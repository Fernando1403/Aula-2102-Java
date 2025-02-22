package br.com.bancofiap.modelo;

public class Conta {
	private int numConta;
	private int saldo;
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "Conta [numConta=" + numConta + ", saldo=" + saldo + "]";
	}
	
	
}
