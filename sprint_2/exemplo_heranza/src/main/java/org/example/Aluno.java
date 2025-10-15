package org.example;

public class Aluno {

    private final String nome;
    private final String ra;
    private Double notaac1;
    private Double notaac2;
    private Double notaac3;

    public Aluno(String nome, String ra) {
        this.nome = nome;
        this.ra = ra;
    }

    public  Double calcularMedia(){
        return (notaac1 + notaac2 + notaac3) /3;
    }

    public String getNome() {
        return nome;
    }

    public String getRa() {
        return ra;
    }

    public Double getNotaac1() {
        return notaac1;
    }

    public void setNotaac1(Double notaac1) {
        this.notaac1 = notaac1;
    }

    public Double getNotaac2() {
        return notaac2;
    }

    public void setNotaac2(Double notaac2) {
        this.notaac2 = notaac2;
    }

    public Double getNotaac3() {
        return notaac3;
    }

    public void setNotaac3(Double notaac3) {
        this.notaac3 = notaac3;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", ra='" + ra + '\'' +
                ", notaac1=" + notaac1 +
                ", notaac2=" + notaac2 +
                ", notaac3=" + notaac3 +
                '}';
    }
}
