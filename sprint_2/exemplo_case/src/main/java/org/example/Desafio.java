package org.example;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Integer duracaoMes = 0;
        Integer diasRestantes = 0 ;
        Integer totalDiasAno = 31*8 + 30*3 + 28;


        System.out.println("Digite um mês do ano de 2025: ");
        String mesInserido = leitor.nextLine();
        mesInserido = mesInserido.toLowerCase();

        duracaoMes = switch (mesInserido){
            case "janeiro"-> duracaoMes = 31;
            case "fevereiro"-> duracaoMes = 28;
            case "março"-> duracaoMes = 31;
            case "Abril"-> duracaoMes = 30;
            case "maio"-> duracaoMes = 31;
            case "julho"-> duracaoMes = 31;
            case "junho"-> duracaoMes = 31;
            case "agosto"-> duracaoMes = 31;
            case "setembro"-> duracaoMes = 30;
            case "outubro"-> duracaoMes = 31;
            case "novembro"-> duracaoMes = 30;
            case "dezembro"-> duracaoMes = 31;
            default -> null;
        };
        Integer acumulado = totalDiasAno;
        switch (mesInserido){
            case "janeiro":
                acumulado -= 31;
            case "fevereiro" :
                acumulado -= 28;
            case "março" :
                acumulado -= 31;
             case "Abril" :
                acumulado -= 30;
            case "maio" :
                acumulado -= 31;
            case "julho" :
                acumulado -= 31;
             case "junho":
                 acumulado -= 31;
            case "agosto" :
                acumulado -= 31;
            case "setembro":
                acumulado -= 30;
            case "outubro":
                acumulado -= 31;
             case "novembro":
                acumulado -= 30;
             case "dezembro":
                acumulado -= 31;
                break;
        }
        diasRestantes = totalDiasAno - acumulado;

        System.out.printf("O mês %s tem %d dias \n", mesInserido, duracaoMes);
        System.out.printf("Faltam %d dias para o ano acabar ", diasRestantes);

    }

}