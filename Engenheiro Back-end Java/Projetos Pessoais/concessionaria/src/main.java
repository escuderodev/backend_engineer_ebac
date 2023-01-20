import br.com.escuderodev.models.Caminhao;
import br.com.escuderodev.models.Carro;
import br.com.escuderodev.models.Van;
import br.com.escuderodev.models.Veiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int continuaCadastro = 0;
        List<Veiculo> veiculo = new ArrayList<Veiculo>();

        do {
            int tipoVeiculo = 0;
            String marca;
            String modelo;
            int ano;

            System.out.println("\nIniciando Cadastro de Veículo:");
            System.out.print("Digite [1 - Carro],[2 - Caminhão] ou [3 - Van]: ");
            tipoVeiculo = scan.nextInt();
            System.out.print("Digite a marca: ");
            marca = scan.next();
            System.out.print("Digite o modelo: ");
            modelo = scan.next();
            System.out.print("Digite o ano do modelo: ");
            ano = scan.nextInt();
            System.out.print("Deseja cadastrar outro veículo? 1 = SIM e 2 = NÃO: ");
            continuaCadastro = scan.nextInt();

            if (tipoVeiculo == 1) {
                Veiculo carro = new Carro(marca, modelo, ano);
                veiculo.add(carro);
            } else if (tipoVeiculo == 2) {
                Veiculo caminhao = new Caminhao(marca, modelo, ano);
                veiculo.add(caminhao);
            } else {
                Veiculo van = new Van(marca, modelo, ano);
                veiculo.add(van);
            }

        } while (continuaCadastro == 1);
        for (int i = 0; i < veiculo.size(); i++) {
            System.out.println(veiculo.get(i).getMarca() + " " + veiculo.get(i).getModelo() + " " + veiculo.get(i).getAno());
        }
    }

}
