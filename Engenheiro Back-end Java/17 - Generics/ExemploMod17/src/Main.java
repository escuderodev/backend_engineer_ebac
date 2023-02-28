import br.com.escuderodev.generics.GenericEntry;

public class Main {
    public static void main(String[] args) {

        GenericEntry<String> entry = new GenericEntry<>("Teste");
        System.out.println(entry.getData());

        GenericEntry<Long> entryLong = new GenericEntry<>(1L);
        System.out.println(entryLong.getData());
    }
}