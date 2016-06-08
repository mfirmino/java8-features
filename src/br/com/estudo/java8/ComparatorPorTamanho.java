package br.com.estudo.java8;

import java.util.Comparator;

/**
 * Created by mfirmino on 07/06/2016.
 */
public class ComparatorPorTamanho  implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        }

        return 0;
    }
}
