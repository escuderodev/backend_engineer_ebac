package br.com.escuderodev.aula.domain;

import java.util.Comparator;

public class ComparaNotaAluno implements Comparator<Aluno> {

    @Override
    public int compare(Aluno o1, Aluno o2) {
//        return Double.valueOf(o1.getNota()).compareTo(Double.valueOf(o2.getNota()));
//        crescente
//        return Double.compare(o1.getNota(), o2.getNota());
//        decrescente
        return Double.compare(o2.getNota(), o1.getNota());
    }
}
