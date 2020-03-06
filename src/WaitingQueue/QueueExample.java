package WaitingQueue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// Inicialização da fila
		Queue<String> filaEspera = new LinkedList<>();

		// Adicionando elementos a fila
		filaEspera.add("Matheus");
		filaEspera.add("Marcos");
		filaEspera.add("Lucas");
		filaEspera.add("Joao");
		filaEspera.add("Paulo");

		System.out.println("Fila: " + filaEspera);

		// remove() desinfileira
		// remove retorna throws NoSuchElementException se ela tiver vazia

		Iterator<String> filaEsperaI = filaEspera.iterator();
		while(filaEsperaI.hasNext()) {
			//o .next retorna o proximo elemento
			String nome = filaEsperaI.next();
			System.out.println(nome);
		}
		
		//forEach faz um for(String name : filaEspera) dentro de {} falando o que quer
		filaEspera.forEach(name -> {
			System.out.println(name);
		});
		
		//é um for de um só tipo, mais rapido
		for(String name : filaEspera) {
			System.out.println(name);
		}
		
		String nome = filaEspera.remove();
		System.out.println("Removido da fila: " + nome + " | Nova fila: " + filaEspera);
		System.out.println("Tamanho da fila: "+filaEspera.size());
		System.out.println("A fila esvaziou? "+filaEspera.isEmpty());
		// poll() também remove
		// poll só retorna null se a fila tiver vazia

		nome = filaEspera.poll();
		System.out.println("Removido da fila: " + nome + " | Nova fila: " + filaEspera);
		
		//element joga um erro NoSuchElementException se a fila tiver vazia
		//peek retorna null se a fila tiver vazia
		System.out.println("Primeira pessoa da fila (elemento): "+filaEspera.element());
		System.out.println("Primeira pessoa da fila (peek): "+filaEspera.peek());
		if(filaEspera.contains("Paulo")) {
			System.out.println("A fila contem o nome");
		}else {
			System.out.println("Não contem");
		}
	}

}
