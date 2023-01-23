import br.com.escuderodev.models.Caneta;
import br.com.escuderodev.models.CanetaEsferografica;
import br.com.escuderodev.models.Giz;
import br.com.escuderodev.models.Lapis;

public class Main {

    public static void main(String[] args) {
        CanetaEsferografica canetaEsferografica = new CanetaEsferografica();
        Giz giz = new Giz();
        Lapis lapis = new Lapis();

        canetaEsferografica.setCor("Vermelha");
        giz.setCor("Azul");
        lapis.setCor("Preto");

        canetaEsferografica.escrever(canetaEsferografica.getCor());
        giz.escrever(giz.getCor());
        lapis.escrever(lapis.getCor());

        lapis.escreverDefault("Teste Default");
    }
}
