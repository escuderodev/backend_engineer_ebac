package br.com.escuderodev.aula;

/**
 * @author escuderodev
 */
public class Cliente {
//    private int codigo = 1;
//    private Integer codigo = 1;
    private Long codigo = 1L;

//    private long códigoMaior = 1204050;
    private Long códigoMaior = 1204050l;

//    private double valorDecimal = 4.7;
    private Double valorDecimal = 4.7;

//    private boolean status = true;
    private Boolean status = true;

//    getters e setters
    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Long getCódigoMaior() {
        return códigoMaior;
    }

    public void setCódigoMaior(Long códigoMaior) {
        this.códigoMaior = códigoMaior;
    }

    public Double getValorDecimal() {
        return valorDecimal;
    }

    public void setValorDecimal(Double valorDecimal) {
        this.valorDecimal = valorDecimal;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
