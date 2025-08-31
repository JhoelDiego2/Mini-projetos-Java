package org.example;

import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);

        System.out.println("Digite o seu ........................................... nome");
        String nome = leitor.nextLine();
        System.out.println("Digite o seu nome");
        String b = leitor.nextLine();
        System.out.println("Digite o seu nome");
        String c = leitor.nextLine();

        System.out.printf("""
                ====================================
                FICHAH DO ALUNO 
                
                NOME : %S
                
                
                """, nome);

        System.out.println("Dê um feddback");
        String feedback = leitor.nextLine();

        System.out.println("Obrigado");
    }
}
