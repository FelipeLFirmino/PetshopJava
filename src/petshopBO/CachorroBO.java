package petshopBO;
import java.util.Scanner;
import petshop.Animal;

public class CachorroBO extends AnimaisBO implements Animal {

	Scanner scanner = new Scanner(System.in);
	
	public CachorroBO(String tipoAnimal,int numerodepatas, int idade, String nome, String cor, String raça, boolean adestrado,
			float valor) {
		super(tipoAnimal,numerodepatas, idade, nome, cor, raça, adestrado, valor);
		// TODO Auto-generated constructor stub
	}
	
	public CachorroBO(AnimaisBO animais){
		super(animais.getTipoAnimal(),animais.getNumerodepatas(), animais.getIdade(), animais.getNome(), animais.getCor(),animais.getRaça(),animais.isAdestrado() ,animais.getValor());
	}

	
	//gatoBo
	
	@Override
	public void barulho() {
		System.out.println("auau");
	}

	
  

	

}

