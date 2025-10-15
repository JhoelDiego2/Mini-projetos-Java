package org.example;

public class AlunoPos extends  Aluno {


    private  Double notaTcc ;

    public AlunoPos(String nome, String ra) {
        super(nome, ra);
    }

    public Double getNotaTcc() {
        return notaTcc;
    }

    public void setNotaTcc(Double notaTcc) {
        this.notaTcc = notaTcc;
    }

    @Override
    public Double calcularMedia(){
        return (getNotaac1() + getNotaac2() + getNotaac3() + notaTcc ) /4;
    }


    @Override
    public String toString() {
        return "AlunoPos{" +
                "notaTcc=" + notaTcc +
                "} " + super.toString();
    }
}
