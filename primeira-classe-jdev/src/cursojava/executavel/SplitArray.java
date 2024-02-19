package cursojava.executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray { // Quebra um texto e transforma em array
	public static void main(String[] args) {

		String texto = "Kennedy, Java, 70, 80, 90, 60";

		String[] valoresArray = texto.split(",");

		System.out.println("Nome: " + valoresArray[0]);
		System.out.println("Curso: " + valoresArray[1]);
		System.out.println("Nota 1: " + valoresArray[2]);
		System.out.println("Nota 2: " + valoresArray[3]);
		System.out.println("Nota 3: " + valoresArray[4]);
		System.out.println("Nota 4: " + valoresArray[5]);

		// convertendo Array em lista

		List<String> list = Arrays.asList(valoresArray);

		for (String valorString : list) {
			System.out.println(valorString);

		}
		// convertendo lista em Array

		String[] conversaoArray = list.toArray(new String[6]);

		for (int pos = 0; pos < conversaoArray.length; pos++) {
			System.out.println(conversaoArray[pos]);

		}

	}
}
