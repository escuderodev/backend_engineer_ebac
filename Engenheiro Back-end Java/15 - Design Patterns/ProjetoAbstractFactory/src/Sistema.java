import br.com.escuderodev.domain.*;
public class Sistema {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("A", true);
        LocadoraDeCarro locadoraDeCarro = getTipoCarro(cliente);
        Carro carro = locadoraDeCarro.criaCarro(cliente.getOpcaoCarro());
        carro.partiuViagem();
    }

    public static LocadoraDeCarro getTipoCarro(Cliente cliente) {
        if (cliente.ehCarroExecutivo()) {
            return new AlugaCarroExecutivo();
        } else {
            return new AlugaCarroPopular();
        }
    }
}