package modulo_datas;

import java.time.LocalDate;
import java.time.Period;

public class DatasEmJava9 {

	public static void main(String[] args) {

		LocalDate dataAntiga = LocalDate.of(2017, 2, 7);
		LocalDate dataNova = LocalDate.of(2024, 8, 30);

		System.out.println("Data antiga é maior que data nova? " + dataAntiga.isAfter(dataNova));

		System.out.println("Data antiga é anterior a data nova? " + dataAntiga.isBefore(dataNova));

		System.out.println("Data antiga é igual que data nova? " + dataAntiga.isEqual(dataNova));

		Period periodo = Period.between(dataAntiga, dataNova);

		System.out.println("Quantos dias entre as datas? " + periodo.getDays());

		System.out.println("Quantos meses entre as datas? " + periodo.getMonths());

		System.out.println("Quantos anos entre as datas? " + periodo.getYears());

		System.out.println("Meses: " + periodo.toTotalMonths());

		System.out.println("O período é de " + periodo.getDays() + " dias " + periodo.getMonths() + " meses e "
				+ periodo.getYears() + " anos");

	}

}
