package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import javax.swing.text.SimpleAttributeSet;

public class DatasEmJava3 {
	
	public static void main(String[] args) throws ParseException {
		
		
		long dias = ChronoUnit.YEARS.between(LocalDate.parse("2023-01-21"), LocalDate.now()); //total de dias até hoje
		System.out.println("Possui " + dias + " ano(s) entre a faixa de data");
	}

}
