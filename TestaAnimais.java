package br.com.generation.heranca;

public class TestaAnimais {

	public static void main(String[] args) {

		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguica preguica = new Preguica();

		dog.setNome("Mac");
		dog.setIdade(2);

		System.out.println("Cachorro");
		System.out.println("Nome: " + dog.getNome());
		System.out.println("Idade: " + dog.getIdade() + " anos");

		dog.emitirSom();
		dog.deveCorrer();
		System.out.println();

		horse.setNome("Spartan");
		horse.setIdade(6);

		System.out.println("Cavalo");
		System.out.println("Nome:  " + horse.getNome());
		System.out.println("Idade: " + horse.getIdade() + " anos");

		horse.emitirSom();
		horse.deveCorrer();
		System.out.println();

		preguica.setNome("Soninho");
		preguica.setIdade(3);

		System.out.println("Bicho Preguiça");
		System.out.println("Nome: " + preguica.getNome());
		System.out.println("Idade: " + preguica.getIdade() + " anos");

		preguica.emitirSom();
		preguica.deveSubiremArvore();
		System.out.println();

	}

}
