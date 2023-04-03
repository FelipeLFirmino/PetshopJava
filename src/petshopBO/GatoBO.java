package petshopBO;

import java.util.Scanner;
import petshop.Animal;


public class GatoBO  extends AnimaisBO implements Animal{
  
	
	
	Scanner scanner = new Scanner(System.in);
	
	
	
	public GatoBO(String tipoAnimal,int numerodepatas, int idade, String nome, String cor, String raça, boolean adestrado,
			float valor) {
		super(tipoAnimal,numerodepatas, idade, nome, cor, raça, adestrado, valor);
		// TODO Auto-generated constructor stub
	}
	
	
	public GatoBO(AnimaisBO animais){
		super(animais.getTipoAnimal(),animais.getNumerodepatas(), animais.getIdade(), animais.getNome(), animais.getCor(),animais.getRaça(),animais.isAdestrado() ,animais.getValor());
	}
    
	
	

	@Override
	public void barulho() {
		System.out.println("miauw");
		
	}

	@Override
	public void comando() {
		System.out.println("Escolha um comando 1- sentar 2-fazer barulho 3-brincar");
		 int input = scanner.nextInt();
		 
		 if(input == 1) {
			 System.out.println("o gato sentou");
		 }else if (input == 2) {
			barulho();
		}else if(input == 3) {
			System.out.println("o gato ta brincando");
			
		}
			 
	}

	public void chamarComandos(GatoBO gato) {
	    
		
		if(gato.isAdestrado()) {
			gato.comando();
		}else {
			System.out.println("O gato não é adestrado.");
		}
	   
	 }
}