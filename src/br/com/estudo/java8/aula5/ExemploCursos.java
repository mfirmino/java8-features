package br.com.estudo.java8.aula5;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by marcelo.firmino on 21/07/16.
 */
public class ExemploCursos {

    public static void main(String[] args){
        List<Curso> cursos = new ArrayList<>();

        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

//        cursos.sort(Comparator.comparing(c -> c.getAlunos()));
        cursos.sort(Comparator.comparing(Curso::getAlunos));

//        cursos.forEach(c -> System.out.println(c.getNome()));

        cursos.stream().filter(c -> c.getAlunos() >= 50).forEach(c -> System.out.println(c.getNome()));
//        cursos.stream().filter(c -> c.getAlunos() >= 100).map(c -> c.getAlunos()).forEach(System.out::println);
//        int qtdAlunos = cursos.stream().filter(c -> c.getAlunos() >= 100).mapToInt(Curso::getAlunos).sum();
//        System.out.println(qtdAlunos);

        OptionalDouble optionalDouble = cursos.stream().filter(c -> c.getAlunos() >= 100).mapToInt(Curso::getAlunos).average();

        Optional<Curso> cursoOptional = cursos.stream().filter(c -> c.getAlunos() >= 50).findFirst();

        cursoOptional.ifPresent(System.out::println);

        List<Curso> cursoFiltradoList = cursos.stream().filter(c -> c.getAlunos() >= 50).collect(Collectors.toList());

        Map<String, Curso> mapCursos = cursos.stream().filter(c -> c.getAlunos() >= 50).collect(Collectors.toMap(c -> c.getNome(), c -> c));

        mapCursos.forEach((nome, curso) -> System.out.println(nome + " tem " + curso.getAlunos() + " alunos."));

    }


}
