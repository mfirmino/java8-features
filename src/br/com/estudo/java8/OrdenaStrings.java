package br.com.estudo.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

    public static void main(String[] args) {

        ComparatorPorTamanho comparador = new ComparatorPorTamanho();

        List<String> palavras = new ArrayList<String>();
        palavras.add("Alura Online");
        palavras.add("editora");
        palavras.add("bartolomeu");
        palavras.add("Intellij");

        palavras.sort(comparador);

        System.out.println(palavras);

        Consumer<String> consumer = new ImprimeNaLinha();
        palavras.forEach(consumer);

    }
}
