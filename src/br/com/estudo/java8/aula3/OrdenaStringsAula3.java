package br.com.estudo.java8.aula3;

import br.com.estudo.java8.aula1.ComparatorPorTamanho;
import br.com.estudo.java8.aula1.ImprimeNaLinha;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStringsAula3 {

    public static void main(String[] args) {

        ComparatorPorTamanho comparador = new ComparatorPorTamanho();

        List<String> palavras = new ArrayList<String>();
        palavras.add("Alura Online");
        palavras.add("editora");
        palavras.add("bartolomeu");
        palavras.add("Intellij");

//        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

//        palavras.sort(Comparator.comparing(s -> s.length()));
//        palavras.sort(String.CASE_INSENSITIVE_ORDER);
        palavras.sort(Comparator.comparing(String::length));

        System.out.println(palavras);

        Consumer<String> consumer = new ImprimeNaLinha();
        palavras.forEach(System.out::println);

    }
}
