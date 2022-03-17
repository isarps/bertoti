package br.fatec.strategy;

public class BanhoSimples implements Agendamento{
	
	public void agendar(String nome, Float preco) {
		System.out.println("Banho Simples: " + nome + "\nPreço: " + preco);	
	}
	
}
