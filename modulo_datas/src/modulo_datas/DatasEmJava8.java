package modulo_datas;

import java.time.Duration;
import java.time.Instant;

public class DatasEmJava8 {

	public static void main(String[] args) throws InterruptedException {

		Instant inicio = Instant.now(); // Pode ser um processo com tempo qualquer que nã ocnhecemos

		Thread.sleep(2000);

		Instant ifinal = Instant.now();

		Duration duracao = Duration.between(inicio, ifinal);

		System.out.println("Duracao em nanosegundos: " + duracao.toNanos());

		System.out.println("Duracao em milisegundos: " + duracao.toMillis());

		System.out.println("Duracao em segundos: " + duracao.toSeconds());

		System.out.println("Duracao em minutos: " + duracao.toMinutes());

		System.out.println("Duracao em horas: " + duracao.toHours());

		System.out.println("Duracao em dia(s): " + duracao.toDays());
	}

}
