package cursojava.thread;

public class AulaThread {
	public static void main(String[] args) throws InterruptedException {
		for (int pos = 0; pos < 10; pos++) {

			Thread.sleep(1000);
			// Quero executar esse envio com tempo de parada ou com tempo determinado
			System.out.println("Executando rotina de envio de e-mail");

		}

		System.out.println("Chegou o fim do código de teste da Thread");
	}
}
