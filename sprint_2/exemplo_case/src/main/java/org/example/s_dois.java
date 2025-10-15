package org.example;

import java.util.Scanner;

public class s_dois {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número de 1 a 7:");
        Integer numero  = leitor.nextInt();

        String diaDaSemana = switch (numero){
            case 1, 8 -> ("Domingo");
            case 2-> ("Segunda-feira");
            case 3-> ("terça-feira");
            case 4-> ("quarta-feira");
            case 5-> ("quinta-feira");
            case 6-> ("sexta-feira");
            case 7-> ("Sabado");
            default-> ("Dia da semana invalido");
        };
        System.out.println(diaDaSemana);
    }
}

