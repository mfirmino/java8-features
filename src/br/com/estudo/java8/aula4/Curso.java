package br.com.estudo.java8.aula4;

/**
 * Created by marcelo.firmino on 21/07/16.
 */
public class Curso {

    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {

	this.nome = nome;
	this.alunos = alunos;
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public int getAlunos() {
	return alunos;
    }

    public void setAlunos(int alunos) {
	this.alunos = alunos;
    }
}
