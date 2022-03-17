package br.fatec.strategy;

public class Main {

	public static void main(String[] args) {
		
		Animal rex = new Animal();
		rex.setNome("Rex");
		rex.setPreco(35.0f);
		rex.setAgendamento(new BanhoSimples());
		rex.agendar(rex.getNome(), rex.getPreco());
		
		System.out.println("------------------");
		
		rex.setPreco(50.0f);
		rex.setAgendamento(new BanhoTosa());
		rex.agendar(rex.getNome(), rex.getPreco());
		
	}
	
}
