package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedQueue<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);

	}

	@Override
	public void run() {

		System.out.println("Fila rodando");


		while (true) {
			Iterator iteracao = pilha_fila.iterator();
			synchronized (iteracao) { // Bloquear acesso a esta lista por outros processos

				while (iteracao.hasNext()) { // Enquanto conter dados na lista irá processar

					ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next(); // Pega o objeto atual processa e
																						// abaixo remove

					// Processar 10 mil notas fiscais
					// Gerar envio em massa de e-mail
					System.out.println("------------------------------");
					System.out.println(processar.getEmail());
					System.out.println(processar.getNome());

					iteracao.remove();

					try {
						Thread.sleep(100); // Dar tempo para descarga de memória
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}

			}
			try {
				Thread.sleep(1000); // Processou toda a lista dá um tempo para a limpeza da memória
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
