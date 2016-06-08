package br.com.estudo.java8;

import java.util.function.Consumer;

/**
 * Created by mfirm on 07/06/2016.
 */
public class ImprimeNaLinha implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
