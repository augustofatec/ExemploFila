package WaitingQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueFuncionario {

	public static void main(String[] args) {
		Queue<Funcionario> filaEspera = new LinkedList<>();
		
		filaEspera.add(new Funcionario("Augusto", 130));
		filaEspera.add(new Funcionario("Pedro",420));
		filaEspera.add(new Funcionario("Lucas", 69));
		
		for(Funcionario f : filaEspera) {
			System.out.println(f.getNome()+" codigo "+f.getCod());
		}
		
		Funcionario f = filaEspera.poll();
		System.out.println("Primeiro funcionario que foi removido "+f.getNome()+" cod "+f.getCod());
		System.out.println("Esvaziou? "+filaEspera.isEmpty());
		System.out.println("Tamanho: "+filaEspera.size());
	}

}
