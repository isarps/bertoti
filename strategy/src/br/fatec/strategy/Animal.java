package br.fatec.strategy;

public class Animal {

	private String nome;
	private Agendamento agendamento;
	private Float preco;
	
	public void setAgendamento(Agendamento agendamento){
		this.agendamento = agendamento;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

	public void agendar(String nome, Float preco) {
		this.agendamento.agendar(nome, preco);
	}
	
}
