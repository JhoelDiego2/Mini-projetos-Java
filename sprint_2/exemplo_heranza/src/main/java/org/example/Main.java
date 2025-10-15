package org.example;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Manoel", "011923");

        aluno1.setNotaac1(8.0);
        aluno1.setNotaac2(9.0);
        aluno1.setNotaac3(10.0);
        System.out.println("Média" + aluno1.calcularMedia());

        Faculdade faculdade1 = new Faculdade("Sptech");
        faculdade1.matricularAlunos(aluno1);
        faculdade1.exibirAlunos();


        AlunoPos aluno2 = new AlunoPos("Isabela", "0103101842");

        aluno2.setNotaac1(8.0);
        aluno2.setNotaac2(10.0);
        aluno2.setNotaac3(9.0);
        aluno2.setNotaTcc(8.5);


        faculdade1.matricularAlunos(aluno2);
        faculdade1.exibirAlunos();

        System.out.println("Media    " + aluno2.calcularMedia());

        faculdade1.exibirAlunos();

        faculdade1.exibirMedias();

        faculdade1.exibirNotasTcc();



    }
}