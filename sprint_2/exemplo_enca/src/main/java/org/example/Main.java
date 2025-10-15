package org.example;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("Jhoel Dieog ", "65666656655");
        //conta1.titular = "Jhoel Diego";
        //conta1.telefone = "11946787175";
        //conta1.email = "jhoeldiego@gmail.com";

        conta1.exibirInformacoes();
        conta1.sacar(5.00);
        conta1.depositar(500.00);
        conta1.sacar(20.0);
        conta1.exibirInformacoes();

        ContaCorrente conta2 = new ContaCorrente("Jhoelfsdadsafdsgtht ", "65666656655", "jfkjlkjf@gmail.com");
        //conta2.titular = "Sir Sharp";
        //conta2.telefone = "1000201212152525222222";
        //conta2.email = "dksjafkljsdakl@gmail.coom";

        conta2.depositar(100.0);
        conta2.exibirInformacoes();
        conta1.verSaldo();



    }
}
