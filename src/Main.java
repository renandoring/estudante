import br.com.alura.estudante.model.Estudante;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //CHAMADA JSON E TTO DE UPPERCASE
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        //ARRAY
        ArrayList<Estudante> estudantes = new ArrayList<>();

        Estudante estudanteUm = new Estudante("João", 3, 5, 6);
        Estudante estudanteDois = new Estudante("Maria", 7, 8, 9);
        Estudante estudanteTres = new Estudante("Pedro", 9, 9, 8);

        estudantes.add(estudanteUm);
        estudantes.add(estudanteDois);
        estudantes.add(estudanteTres);

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
        try (FileWriter escreva = new FileWriter("estudantes.json")) {
            escreva.write(gson.toJson(estudantes));
            escreva.close();
            System.out.println("Arquivo criado com SUCESSO!");
        } catch (IOException ex) {
            System.out.println("Erro ao criar o arquivo!" + ex.getMessage());
        }
    }
}
