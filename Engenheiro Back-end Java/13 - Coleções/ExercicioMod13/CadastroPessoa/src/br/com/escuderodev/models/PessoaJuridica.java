package br.com.escuderodev.models;

import java.util.Date;

public class PessoaJuridica extends Pessoa {
    private String cnpj;
    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

//    getters and setters

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void contratarFuncionario() {
        System.out.println(this.getNome() + " contratou um funcionário!");
    }

    public void criarNovoCurso() {
        System.out.println(this.getNome() + " criou um novo curso!");
    }

    public void admitirAluno(PessoaFísica aluno) {
        System.out.println(this.getNome() + " aceitou " + aluno.getNome() + " em seu novo curso!");
    }
}
