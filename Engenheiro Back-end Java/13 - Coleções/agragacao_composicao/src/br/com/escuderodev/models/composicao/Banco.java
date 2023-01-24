package br.com.escuderodev.models.composicao;

import java.util.HashSet;
import java.util.Set;

public class Banco {
    private Long codigo;
    private String nome;
    private Set<ContaCorrente> contasCorrente;
    private Set<ContaPoupança> contasPoupança;

    public Banco() {
        this.contasCorrente = new HashSet<>();
        this.contasPoupança = new HashSet<>();
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void add(ContaCorrente cc) {
        this.contasCorrente.add(cc);
    }

    public void add(ContaPoupança cp) {
        this.contasPoupança.add(cp);
    }
}
