package view;
import controller.ListaPrioridade;
import model.ClientePrioritario;
import model.Fila;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ListaPrioridade lp = new ListaPrioridade();
		
		Fila<ListaPrioridade> lista = new Fila<>();
		Fila<ClientePrioritario> lcp = new Fila<>();
		
		int num = 1;
		int prioridade = 1;
		
		String prompt = "1-Insira numero de atendimento\n 2-Insira numero prioritario\n3-Proximo \n9-Encerra\nInforme opção: ";
		int opç;
		
		String promptNome = "Insira nome";
		String nome;
		
		do {
			System.out.print(prompt);
			opç = scan.nextInt();
			scan.nextLine();
			
			switch (opç) {
			case 1:
				System.out.print(promptNome);
				nome: scan.nextLine();
				lp.AdicionarCli(lista, num, nome);
				num++;
				break;
				
			case 2:
				System.out.print(promptNome);
				nome: scan.nextLine();
				lp.AdicionarCli(lcp , prioridade, nome);
				prioridade++;
				break;
			
			case 3: 
				lp.AdicionarCli(lista, lcp);
				break;
			
			case 9: 
				System.out.println("FIM");
				break;
			
			default:
				System.out.println("Opção inválida");
				break;
			}
		} while (opç !=9);
		scan.close();
	}

}
