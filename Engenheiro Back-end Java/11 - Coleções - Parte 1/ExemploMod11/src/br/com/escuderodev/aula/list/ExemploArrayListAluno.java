package br.com.escuderodev.aula.list;

import br.com.escuderodev.aula.domain.Aluno;
import br.com.escuderodev.aula.domain.ComparaNotaAluno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayListAluno {
    public static void main(String[] args) {
        exemploListaSimplesOrdenadaComparatorAluno();
        exemploListaSimplesOrdenadaClasseExterna();
    }

    private static void exemploListaSimplesOrdenadaClasseExterna() {
        System.out.println("***** exemploListaSimplesOrdenadaClasseExterna *****");
        List<Aluno> aluno = new ArrayList<>();
        Aluno a = new Aluno("Eduardo Escudero", "Java", 10);
        Aluno b = new Aluno("Carol Tobias", "Confeitaria Fit", 10);
        Aluno c = new Aluno("Juan Escudero", "Futebol", 8);
        Aluno d = new Aluno("Alicia Valentina", "Ballet", 8);

        aluno.add(a);
        aluno.add(b);
        aluno.add(c);
        aluno.add(d);

        System.out.println(aluno);
        Collections.sort(aluno);
        System.out.println(aluno);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdenadaComparatorAluno() {
        System.out.println("***** exemploListaSimplesOrdenadaComparatorAluno *****");
        List<Aluno> aluno = new ArrayList<>();
        Aluno a = new Aluno("Eduardo Escudero", "Java", 5);
        Aluno b = new Aluno("Carol Tobias", "Confeitaria Fit", 10);
        Aluno c = new Aluno("Juan Escudero", "Futebol", 2);
        Aluno d = new Aluno("Alicia Valentina", "Ballet", 8);

        aluno.add(a);
        aluno.add(b);
        aluno.add(c);
        aluno.add(d);

        System.out.println("Lista sem ordenação: " + aluno);
        Collections.sort(aluno);
        System.out.println("Lista com ordenação: " + aluno);

        ComparaNotaAluno comparaNotaAluno = new ComparaNotaAluno();
        Collections.sort(aluno, comparaNotaAluno);
        System.out.println("Lista ordenada por nota: " + aluno);

        System.out.println("");
    }
}
