package br.com.bancofiap.correcao;

public class Banco {

	private String nome;
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Conta criar(String numero, String nome) {
		
		Conta conta = new Conta();
		conta.setNumero(numero);
		conta.setBanco(this);
		
		Cliente cliente = new Cliente();
		
		cliente.setNome(nome);
		conta.setCliente(cliente);
		
		return conta;
	}
	
}
