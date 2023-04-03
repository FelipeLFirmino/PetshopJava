package petshopBO;

import java.util.Scanner;
import petshop.Animal;

public class PeixeBO extends AnimaisBO implements Animal {

	Scanner scanner = new Scanner(System.in);
	
	public PeixeBO(String tipoAnimal,int numerodepatas, int idade, String nome, String cor, String raça, boolean adestrado, float valor) {
		super(tipoAnimal,numerodepatas, idade, nome, cor, raça, adestrado, valor);
		// TODO Auto-generated constructor stub
	}

	public PeixeBO(AnimaisBO animais){
		super(animais.getTipoAnimal(),animais.getNumerodepatas(), animais.getIdade(), animais.getNome(), animais.getCor(),animais.getRaça(),animais.isAdestrado() ,animais.getValor());
	}
	
	@Override
	public void barulho() {
		System.out.println("blub blub");
		
	}

	@Override
	public void comando() {
		System.out.println("Escolha um comando 1- Seguir o dedo 2-fazer barulho ");
		 int input = scanner.nextInt();
		 
		 if(input == 1) {
			 System.out.println("o peixe esta seguindo o dedo");
		 }else if (input == 2) {
			barulho();
		
		
	}

 }
}
