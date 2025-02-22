package br.com.bancofiap.modelo;

public class Cadastro {
	
	private int numConta;
	private String Nome;
	private int CPF;
	private int Saldo;
	
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
	public int getSaldo() {
		return Saldo;
	}
	public void setSaldo(int saldo) {
		Saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "Cadastro [numConta=" + numConta + ", " + (Nome != null ? "Nome=" + Nome + ", " : "") + "CPF=" + CPF
				+ ", Saldo=" + Saldo + "]";
	}
	
	public void BonusFIAP() {
		
		int bonus = 100;
		
		this.Saldo += bonus;
		
	}
	
	public void ObterSaldo(){
		System.out.println(this.Saldo);
	}
	
	
}
