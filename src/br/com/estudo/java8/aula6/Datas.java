package br.com.estudo.java8.aula6;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * Created by marcelo.firmino on 27/07/16.
 */
public class Datas {

    public static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println("hoje = " + hoje);
        System.out.println(hoje.format(FORMATTER));

        LocalDate olimpiadasRio2016 = LocalDate.of(2016, Month.AUGUST, 05);

        Period periodo = Period.between(hoje, olimpiadasRio2016);
        System.out.println("periodo = " + periodo);

        LocalDate proximasOlimpiadas = olimpiadasRio2016.plusYears(4);
        System.out.println("proximasOlimpiadas = " + proximasOlimpiadas);

	System.out.println(FORMATTER.format(proximasOlimpiadas));

    }

}
