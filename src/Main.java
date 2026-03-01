import br.com.alura.estudante.model.Estudante;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Estudante estudanteUm = new Estudante("João", 3, 5, 6);
        Estudante estudanteDois = new Estudante("Maria", 7, 8, 9);
        Estudante estudanteTres = new Estudante("Pedro", 9, 9, 8);

        ArrayList<Estudante> estudantes = new ArrayList<>();

        estudantes.add(estudanteUm);
        estudantes.add(estudanteDois);
        estudantes.add(estudanteTres);

        //System.out.println("Tamanho da lista: " + estudantes.size());
        //System.out.println("Terceiro aluno " + estudantes.get(2));


        System.out.println("\nImpressão da lista abaixo: ");

        for (Estudante estudante : estudantes) {
            System.out.println(estudante + "\n");

            double calculate = (estudante.getNote1() + estudante.getNote2() + estudante.getNote3()) / 3;
            System.out.printf("The media is: %.2f\n", calculate);

            //It shows whether the student passed the year.
            if (calculate >= 7) {
                System.out.println("CONGRATULATIONS. YOU PASSED THE YEAR!!! \n");
            } else {
                System.out.println("Sorry, you´re failed. \n");
            }
        }
    }
}
