package br.com.bancofiap.correcao;

public class Agencia {
	
	private Banco banco;
	private Cliente cliente;
	private String numero;
	private String nome;
	
	public Agencia(Banco banco, String numero, String nome) {
	    this.banco = banco;
	    this.numero = numero;
	    this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
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
	
	

}
