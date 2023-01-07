package br.com.escuderodev.models;

import java.util.ArrayList;
import java.util.List;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private String sexo;

    public Aluno (String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

//    getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public int compareTo(Aluno aluno) {
        return this.sexo.compareTo(aluno.getSexo());
    }

    @Override
    public String toString() {
        return this.nome;
    }

}
