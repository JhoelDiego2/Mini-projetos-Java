package org.example;

public class Auxiliar {

    // function blaablabla (bacon){}
    // void  = para nao retornan nada
    // seu eu quiser retornar algo eu tenho que deixar impliicitito
    // Interger mostrarBacon(){}
    void mostrarBacon(){
        System.out.println("🥓🥓");
    }
    void mostrarComBacons( String mensagem ){
        System.out.println("🥓🥓" + mensagem + "🥓🥓");
    }

    Integer somarBacons( Integer n1, Integer n2){
        Integer soma =   n1 + n2;
        System.out.println("🥓".repeat(soma));
        return  soma;
    }

    void dividirBacons(Integer pessoas, Integer bacons){
        Integer divisao = bacons / pessoas;
        Integer resto = bacons % pessoas;
        System.out.println("\uD83E\uDD35".repeat(pessoas));
        System.out.println("🥓".repeat(bacons));
        System.out.println("Total: " + divisao);
        System.out.println("Resto: " + resto);
    }
    void mostrarBacon(Integer quantidade){
        System.out.println("🥓🥓".repeat(quantidade));

    }


}
