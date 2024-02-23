package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.text.SimpleAttributeSet;

public class DatasEmJava4 {

	public static void main(String[] args) throws ParseException {

		Date dateInicial = new SimpleDateFormat("dd/MM/yyyy").parse("08/04/2021"); // Data inicial para gerar o boleto

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dateInicial);

		for (int parcela = 1; parcela <= 12; parcela++) {
			calendar.add(calendar.MONTH, 1);

			System.out.println("Parcela número: " + parcela + " vencimento é em: "
					+ new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
		}

	}

}
