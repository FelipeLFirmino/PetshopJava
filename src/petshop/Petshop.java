package petshop;

import java.util.Scanner;
import java.util.ArrayList;

import petshopBO.AnimaisBO;
import petshopBO.CachorroBO;
import petshopBO.GatoBO;
import petshopBO.PeixeBO;

public class Petshop {

	public static void main(String[] args) {
		ArrayList<AnimaisBO> listaAnimais = new ArrayList<AnimaisBO>();
		CachorroBO cachorroMaltes = new CachorroBO("Cachorro", 4, 4, null, "preto", "Maltes", false, 100);
		GatoBO gatoPersa = new GatoBO("Gato", 4, 4, null, "preto", "persa", false, 300);
		GatoBO gatoSiames = new GatoBO("Gato", 4, 4, null, "preto", "siames", false, 300);
		PeixeBO peixeBeta = new PeixeBO("Peixe", 0, 1, null, "preto", "beta", false, 5);
		CachorroBO cachorroSalchicha = new CachorroBO("Cachorro", 4, 4, null, "Marrom", "Salsicha", false, 100);

		listaAnimais.add(cachorroMaltes);
		listaAnimais.add(cachorroSalchicha);
		listaAnimais.add(gatoPersa);
		listaAnimais.add(gatoSiames);
		listaAnimais.add(peixeBeta);

		Petshop.compraranimal(listaAnimais);
		Petshop.compraranimal(listaAnimais);
		Petshop.compraranimal(listaAnimais);
	}

	public static void mudarNome(AnimaisBO animal) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("digite o novo nome do seu animal");
		String nomeNovo = scanner.next();
		animal.setNome(nomeNovo);
		System.out.println("o nome do seu " + animal.getTipoAnimal() + " e " + animal.getNome());

	}

	public static void mostrarCachorros(ArrayList<AnimaisBO> listaAnimais) {
		Scanner scanner = new Scanner(System.in);

		boolean achou = false;
		for (AnimaisBO animal : listaAnimais) {
			if (animal.getTipoAnimal().equals("Cachorro")) {
				achou = true;
			}
		}

		// se achou 'e false
		if (!achou) {
			System.out.println("Sinto muito, não temos cachorros disponiveis.");
		}

		if (achou == true) {
			for (AnimaisBO animal : listaAnimais) {

				if (animal.getTipoAnimal() == "Cachorro") {
					animal.caracteristicas();
				}

			}
			System.out.println("voce quer comprar algum animal?");
			System.out.println("1- sim");
			System.out.println("2- nao");
			int comprar = scanner.nextInt();
			if (comprar == 1) {
				System.out.println("qual animal voce deseja comprar?");
				String raca = scanner.next();
				if (raca.equalsIgnoreCase("maltes")) {
					AnimaisBO animalEscolhido = null;

					for (AnimaisBO animalLoop : listaAnimais) {
						if (animalLoop.getRaça().equalsIgnoreCase("Maltes")) {
							animalEscolhido = animalLoop;
							Petshop.mudarNome(animalEscolhido);
							animalEscolhido.barulho();
							listaAnimais.remove(animalEscolhido);
							break;
						}
					}
				} else if (raca.equalsIgnoreCase("salsicha")) {
					AnimaisBO animalEscolhido = null;

					for (AnimaisBO animalLoop : listaAnimais) {
						if (animalLoop.getRaça().equalsIgnoreCase("Salsicha")) {
							animalEscolhido = animalLoop;
							Petshop.mudarNome(animalEscolhido);
							animalEscolhido.barulho();
							listaAnimais.remove(animalEscolhido);
							break;
						}
					}
				}

			} else {
				System.out.println("deseja comprar outro animal?");
				System.out.println("1- Sim // 2- Não");
				int outroanimal = scanner.nextInt();
				if (outroanimal == 1) {
					compraranimal(listaAnimais);
				} else {
					System.out.println("volte sempre");
				}
			}
		}

	}

	public static void mostrarGatos(ArrayList<AnimaisBO> listaAnimais) {
		Scanner scanner = new Scanner(System.in);

		boolean achou = false;
		for (AnimaisBO animal : listaAnimais) {
			if (animal.getTipoAnimal().equals("Gato")) {
				achou = true;
			}
		}

		if (!achou) {
			System.out.println("Sinto muito, não temos gatos.");
		}

		if (achou) {
			for (AnimaisBO animal : listaAnimais) {
				if (animal.getTipoAnimal() == "Gato") {
					animal.caracteristicas();
				}

			}
			System.out.println("voce quer comprar algum animal?");
			System.out.println("1- sim");
			System.out.println("2- nao");
			int comprar = scanner.nextInt();
			if (comprar == 1) {
				System.out.println("qual animal voce deseja comprar?");
				String raca = scanner.next();
				if (raca.equalsIgnoreCase("persa")) {
					AnimaisBO animalEscolhido = null;

					for (AnimaisBO animalLoop : listaAnimais) {
						if (animalLoop.getRaça().equalsIgnoreCase("Persa")) {
							animalEscolhido = animalLoop;
							Petshop.mudarNome(animalEscolhido);
							animalEscolhido.barulho();
							listaAnimais.remove(animalEscolhido);
							break;
						}
					}
				} else if (raca.equalsIgnoreCase("siames")) {
					AnimaisBO animalEscolhido = null;

					for (AnimaisBO animalLoop : listaAnimais) {
						if (animalLoop.getRaça().equalsIgnoreCase("siames")) {
							animalEscolhido = animalLoop;
							Petshop.mudarNome(animalEscolhido);
							animalEscolhido.barulho();
							listaAnimais.remove(animalEscolhido);
							break;
						}
					}
				}

			} else {
				System.out.println("deseja comprar outro animal?");
				System.out.println("1- Sim // 2- Não");
				int outroanimal = scanner.nextInt();
				if (outroanimal == 1) {
					compraranimal(listaAnimais);
				} else {
					System.out.println("volte sempre");
				}
			}

		}

	}

	public static void mostrarPeixes(ArrayList<AnimaisBO> listaAnimais) {

		Scanner scanner = new Scanner(System.in);

		boolean achou = false;
		for (AnimaisBO animal : listaAnimais) {
			if (animal.getTipoAnimal().equals("Peixe")) {
				achou = true;
			}
		}

		if (!achou) {
			System.out.println("Sinto muito, não temos peixes disponiveis.");
		}

		if (achou) {
			for (AnimaisBO animal : listaAnimais) {
				if (animal.getTipoAnimal() == "Peixe") {
					animal.caracteristicas();
				}

			}
			System.out.println("voce quer comprar algum animal?");
			System.out.println("1- sim");
			System.out.println("2- nao");
			int comprar = scanner.nextInt();
			if (comprar == 1) {
				System.out.println("qual animal voce deseja comprar?");
				String raca = scanner.next();
				if (raca.equalsIgnoreCase("beta")) {
					AnimaisBO animalEscolhido = null;

					for (AnimaisBO animalLoop : listaAnimais) {
						if (animalLoop.getRaça().equalsIgnoreCase("Beta")) {
							animalEscolhido = animalLoop;
							Petshop.mudarNome(animalEscolhido);
							animalEscolhido.barulho();
							listaAnimais.remove(animalEscolhido);
							break;
						}
					}
				}

			} else {
				System.out.println("deseja comprar outro animal?");
				System.out.println("1- Sim // 2- Não");
				int outroanimal = scanner.nextInt();
				if (outroanimal == 1) {
					compraranimal(listaAnimais);
				} else {
					System.out.println("volte sempre");
				}
			}
		}

	}

	public static void compraranimal(ArrayList<AnimaisBO> listaAnimais) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bem vindo ao nosso petshop, digite a opcao de animal que deseja comprar.");
		System.out.println("1- Cachorro");
		System.out.println("2- Gato");
		System.out.println("3 - Peixe");
		int op = scanner.nextInt();

		if (op == 1) {
			mostrarCachorros(listaAnimais);
		} else if (op == 2) {
			mostrarGatos(listaAnimais);
		} else if (op == 3) {
			mostrarPeixes(listaAnimais);
		}

	}

}
