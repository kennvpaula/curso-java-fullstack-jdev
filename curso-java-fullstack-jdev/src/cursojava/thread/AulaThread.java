package cursojava.thread;

import java.awt.JobAttributes;

import javax.swing.JOptionPane;

public class AulaThread {
	public static void main(String[] args) throws InterruptedException {
		
		//Thread processando em paralelo
		new Thread() {

			public void run() {
				// código da rotina que executa em paralelo
				for (int pos = 0; pos < 10; pos++) {
					// Quero executar esse envio com tempo de parada ou com tempo determinado
					System.out.println("Executando rotina de envio de e-mail");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
				// Fim do código em paralelo

			};

		}.start(); // liga a Thread que fica processando paralelamente por trás

		// Código do sistema do usuário continua fluxo de trabalho
		System.out.println("Chegou o fim do código de teste da Thread");
		// Fluxo do sistema, cadastro de venda, emissão de NF
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
	}
}
