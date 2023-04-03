package petshopBO;

public abstract class AnimaisBO {
	 private String tipoAnimal; 
	  private int numerodepatas;
	  private int idade;
	  private String nome;	
	  private  String cor, raça;
	  private boolean adestrado;
	  private float valor;
	  

	  
	public AnimaisBO(String tipoAnimal,int numerodepatas, int idade, String nome, String cor, String raça, boolean adestrado, float valor) {
		super();
		this.tipoAnimal = tipoAnimal;
		this.numerodepatas = numerodepatas;
		this.idade = idade;
		this.nome = nome;
		this.cor = cor;
		this.raça =raça;
		this.adestrado = adestrado;
		this.valor = valor;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumerodepatas() {
		return numerodepatas;
	}

	public void setNumerodepatas(int numerodepatas) {
		this.numerodepatas = numerodepatas;
	}

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isAdestrado() {
		return adestrado;
	}

	public void setAdestrado(boolean adestrado) {
		this.adestrado = adestrado;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public String getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}
	
	public void caracteristicas() {
		System.out.println("As caracteristicas do animal sao:");
		System.out.println("O animal e um: " + getTipoAnimal());
		System.out.println("o animal tem " + getIdade() + " anos" );
		System.out.println("O valor do animal é: R$" + getValor());
		System.out.println("A cor do animal é " + getCor());
		System.out.println("Ele tem " + getNumerodepatas() + " patas");
		System.out.println("A raca do animal é " + getRaça());
		if (isAdestrado()) {
			System.out.println("O animal é adestrado");
		}else {
			System.out.println("O animal não é adestradoto");
		}
		System.out.println("------------------------------");
	}

	
}