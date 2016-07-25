package br.com.estudo.java8.aula2;

import br.com.estudo.java8.aula1.ComparatorPorTamanho;
import br.com.estudo.java8.aula1.ImprimeNaLinha;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStringsAula2 {

    public static void main(String[] args) {

        ComparatorPorTamanho comparador = new ComparatorPorTamanho();

        List<String> palavras = new ArrayList<String>();
        palavras.add("Alura Online");
        palavras.add("editora");
        palavras.add("bartolomeu");
        palavras.add("Intellij");

        /*palavras.sort((s1, s2) -> {
            if (s1.length() > s2.length()) {
                return 1;
            } else if (s1.length() < s2.length()) {
                return -1;
            }

            return 0;
        });*/

        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        System.out.println(palavras);

        Consumer<String> consumer = new ImprimeNaLinha();
        palavras.forEach(s -> System.out.println(s));

    }
}
