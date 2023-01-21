public class Main {
    public static void main(String[] args) {

        String nome = "Eduardo;Escudero";
        String[] array = new String[2];
        array = nome.split(";");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}