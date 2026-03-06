package br.com.alura.estudante.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estudante {
    private String name = "XXXXX XXXX";
    private double note1 = 0;
    private double note2 = 0;
    private double note3 = 0;
    private double media;//VAI ARMAZENAR A MEDIA

    //CONSTRUTOR
    public Estudante(String name, int note1, int note2, int note3) {
        this.name = name;
        this.note1 = note1;
        this.note2 = note2;
        this.note3 = note3;
        this.media = (note1 + note2 + note3) / 3.0;
    }

    public Double getMedia() {
        return (note1 + note2 + note3) / 3;
    }

    public double getNote1() {
        return note1;
    }

    public double getNote2() {
        return note2;
    }

    public double getNote3() {
        return note3;
    }

    public void setNote1(double note1) {
        this.note1 = note1;
    }

    public void setNote2(double note2) {
        this.note2 = note2;
    }

    public void setNote3(double note3) {
        this.note3 = note3;
    }

    public String getName() {
        return name;
    }

    //Technique specifications
    public void specificationsStudent() {
        System.out.println("The name of student is: " + name +
                "\nThe students note appears below.");
    }


    //Get media notes
    // public void calculateMedia() {
        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter the notes of students \n");
        note1 = input.nextInt();
        note2 = input.nextInt();
        note3 = input.nextInt();*/

    //double calculate = (note1 + note2 + note3) / 3;
    //System.out.printf("The media is: %.2f\n", calculate);

    //It shows whether the student passed the year.
    /*    if (calculate >= 7) {
            System.out.println("CONGRATULATIONS. YOU PASSED THE YEAR!!! \n");
        } else {
            System.out.println("Sorry, you´re failed. \n");
        }*/
    //}

    @Override
    public String toString() {
        return "nome: " + this.getName() +
                "\nNota Um: " + this.getNote1() +
                "\nNota Dois: " + this.getNote2() +
                "\nNota Dois:" + this.getNote3() +
                "\nMedia: " + this.getMedia();
    }
}
