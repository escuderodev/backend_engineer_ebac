import br.com.escuderodev.generics.models.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Gol gol = new Gol();
        gol.setMarca("VolksWagem");
        gol.setModelo("Gol");
        gol.setAnoModelo(1999);

        Palio palio = new Palio();
        palio.setMarca("Fiat");
        palio.setModelo("Palio");
        palio.setAnoModelo(1998);

        Monza monza = new Monza();
        monza.setMarca("Chevrolet");
        monza.setModelo("Monza");
        monza.setAnoModelo(1995);

        Concessionaria concessionaria = new Concessionaria();

        List<ICarro> lista = new ArrayList<>();
        lista.add(gol);
        lista.add(palio);
        lista.add(monza);

        for(int i = 0; i < lista.size(); i++) {
            concessionaria.venderCarro(lista.get(i));
        }
    }
}