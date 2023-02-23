package br.com.escuderodev.facade;

public class App {

    public static void main(String[] args) {
        IApartamentoService service = new ApartamentoService();
        service.cadastrarApartamento(new Apartamento(50,169000,"Rua Cristiano Lobe, 169 Apto 22B Cidade Tiradentes - SP"));
    }
}
