package controller;
import model.ClientePrioritario;
import model.Fila;

public class ListaPrioridade {
	int serviço = 1;
	
	public void AdicionarCli(Fila<ClientePrioritario> lista, int numero, String nome) {
	ClientePrioritario cp = new ClientePrioritario();
	lista.insert(cp);
	System.out.printf("\t >>> Adicionando %s\n", cp.toString());
	}
	
	public void chamarCliente(Fila<ClientePrioritario> lista, Fila<ClientePrioritario> listaprioridade) {
		if (lista.isEmpty() && listaprioridade.isEmpty()) {
			System.out.println("Listas vazias");
			return ;
		}
	
	ClientePrioritario cp;
	try {
		if (!listaprioridade.isEmpty()) {
			if (serviço % 4 !=0 || lista.isEmpty()) {
				cp = listaprioridade.remove();
				System.out.printf("\t>>> Chamando %s\n", cp.toString());
			}
		} else {
			cp = lista.remove();
			System.out.printf("\t >>> Chamando %s\n", cp.toString());
		}
		if (!lista.isEmpty()){
			cp = lista.remove();
			System.out.printf("\t >>> Chamando %s\n", cp.toString());
		}
		serviço++;
		
	} catch (Exception errChamado) {
		System.err.println(errChamado);
	}
}
}