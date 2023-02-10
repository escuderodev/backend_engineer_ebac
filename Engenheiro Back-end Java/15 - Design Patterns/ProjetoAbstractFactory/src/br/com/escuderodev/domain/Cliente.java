package br.com.escuderodev.domain;

public class Cliente {
    private String opcao;
    private boolean alugaCarroExecutivo;

    public Cliente(String opcao, boolean alugaCarroExecutivo) {
        this.opcao = opcao;
        this.alugaCarroExecutivo = alugaCarroExecutivo;
    }

    public boolean ehCarroExecutivo() {
        return alugaCarroExecutivo;
    }

    public String getOpcaoCarro() {
        return opcao;
    }
}
