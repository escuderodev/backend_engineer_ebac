package br.com.escuderodev.facade;

public class ApartamentoService implements IApartamentoService{
    @Override
    public void cadastrarApartamento(Apartamento apartamento) {

        validarTamanho(apartamento.getTamanho());
        validarValor(apartamento.getValor());

    }

    private void validarValor(double valor) {
        double valorBase = 150000;
        if (valor <= valorBase) {
            System.out.println("Apartamento está em promoção!");
        } else {
            System.out.println("Apartamento não está em promoção");
        }
    }

    public void validarTamanho(double tamanho) {
        if (tamanho == 50) {
            System.out.println("Apartamento possui 50M");
        } else if (tamanho < 50) {
            System.out.println("Apartamento tem menos de 50M");
        } else {
            System.out.println("Apartamento tem mais de 50M");
        }
    }
}
