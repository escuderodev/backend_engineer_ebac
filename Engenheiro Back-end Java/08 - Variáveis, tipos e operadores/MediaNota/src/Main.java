import br.com.escuderdev.models.Aluno;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setPrimeiroBimestre(10);
        aluno.setSegundoBimestre(5);
        aluno.setTerceiroBimestre(7);
        aluno.setQuartoBimestre(6);

//        chamando método para calcular média
        double media = aluno.calculaMediaNota(aluno.getPrimeiroBimestre(), aluno.getSegundoBimestre(), aluno.getTerceiroBimestre(), aluno.getQuartoBimestre());
        System.out.println("Média das Notas: " + media);

//        chamando método para validar nota
        aluno.validaNotas(media);

    }

}
