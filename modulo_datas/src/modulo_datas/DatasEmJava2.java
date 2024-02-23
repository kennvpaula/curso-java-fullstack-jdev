package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.text.SimpleAttributeSet;

public class DatasEmJava2 {

	public static void main(String[] args) throws ParseException {

		Calendar calendar = Calendar.getInstance(); // Pega a data atual

		// Simular a data que vem do Banco de Dados

		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2024"));

		calendar.add(Calendar.DAY_OF_MONTH, 5);// Data de hoje + 30 dias
		System.out.println("Somando o dia do mês: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));

		calendar.add(Calendar.MONTH, 5);
		System.out.println("Somando mês: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));

		calendar.add(Calendar.YEAR, 1);
		System.out.println("Somando ano: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
	}
}
