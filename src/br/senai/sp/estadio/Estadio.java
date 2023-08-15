package br.senai.sp.estadio;

import java.util.Scanner;

public class Estadio {
    public static void main(String[] args) {

        String nome;
        int idade, corCamisa;



        Scanner teclado = new Scanner(System.in);


        /** Dados Pessoais */

        System.out.println("Diga seu nome: ");
        nome = teclado.nextLine();
        System.out.println("Diga sua idade: ");
        idade = teclado.nextInt();
        System.out.println("Qual a cor de sua camisa? [1- Azul 2- Branca 3- Vermelha 4- Preta 5- Amarela 6- Verde]");
        corCamisa = teclado.nextInt();


        switch (corCamisa){
            case  1:
                System.out.println("Arquibancada A");
                break;

            case 2:
                System.out.println("Arquibancada B");
                break;

            case 3:
                System.out.println("Arquibancada C");
                break;

            case 4:
                System.out.println("Arquibancada D");
                break;

            case 5:
                System.out.println("Arquibancada E");
                break;

            case 6:
                System.out.println("Arquibancada F");
                break;

            default:
                System.out.println("Entrada negada! ");
        }



    }
}
