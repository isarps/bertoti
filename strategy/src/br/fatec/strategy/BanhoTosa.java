package br.fatec.strategy;

public class BanhoTosa implements Agendamento{

	public void agendar(String nome, Float preco) {
		System.out.println("Banho e Tosa: " + nome + "\nPreço: " + preco);	
	}
	
}
