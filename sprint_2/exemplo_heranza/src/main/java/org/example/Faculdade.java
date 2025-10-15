package org.example;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {
    
    private  String nome;
    private List<Aluno> alunos;


    public Faculdade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList<>();
    }
    
    public  void matricularAlunos (Aluno aluno){
        this.alunos.add(aluno);

    }
    public void exibirAlunos (){
        System.out.println("Alunos de " + nome + ":");

        for (Aluno aluno : alunos) {

            System.out.println(aluno);
            
        }

    }

    public void exibirMedias(){
        for (Aluno aluno : alunos) {
            System.out.println(aluno.calcularMedia());
        }

    }

    public  void exibirNotasTcc(){
        for (Aluno aluno : alunos) {

            //if (aluno instanceof  AlunoPos){
              //  AlunoPos referenciaNova = (AlunoPos) aluno;
                //System.out.println(referenciaNova.getNotaTcc());

            //}

            if (aluno instanceof  AlunoPos referenciaNova){
                System.out.println(referenciaNova.getNotaTcc());
            }

        }
    }

}
