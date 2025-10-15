package org.example;
//
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.DoubleUnaryOperator;

public class ContaCorrente {

    private  String numero ;
    private String titular;
    private String telefone;
    private String email;
    private Double saldo;
    // metodo especial para iniciar uma classe com minimamente o necesario para iniciar a sua clase
    ContaCorrente(){

    }
    public ContaCorrente(String titular, String telefone){
        this.titular = titular;
        this.telefone = telefone;
        this.numero = ThreadLocalRandom.current().nextInt(1000, 2000) + "";
        this.saldo = 0.00;
    }

    public ContaCorrente(String titular, String telefone, String email){
        this(titular, telefone);
        this.email = email;
    }

    public void depositar(Double valorDeposito){
        if (valorDeposito == null || valorDeposito.isNaN() ||  valorDeposito <= 0.00){
            System.out.println( "Valor de depósito inválido");
            return;
        }

        saldo +=valorDeposito;
        System.out.println("Depósito efetuado com sucesso!");
    }


    public Double sacar(Double valorSaque){
        if (valorSaque == null || valorSaque <=0 ){
            System.out.println("Valor do saque inválido");
            return 0.00;
        }
        if (valorSaque > saldo){
            System.out.println("Saldo insuficiente");
            System.out.printf("Saldo atual: R$%.2f%n", saldo);
            return 0.00;
        }
        saldo -= valorSaque;
        System.out.println("Saque efetuado com succesoo");
        return valorSaque;
    }
    public void exibirInformacoes(){
        System.out.println("""
                -------------------------------------
                Conta Corrente - %s
                -------------------------------------
                Bom dia || Boa tarde || Boa noite
                -------------------------------------
                Titular : %s
                Telefone : %s
                E-mail : %s
                Saldo : %s
                """.formatted(numero, titular, telefone, email, saldo));
    }
    public  void verSaldo(){
        System.out.println("Seu saldo é " + saldo);
    }

    public String getNumero() {
        return numero;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
