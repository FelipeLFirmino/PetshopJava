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
    
	
	
//chamar diretamente apos o nome
	@Override
	public void barulho() {
		System.out.println("miauw");
		
	}


}