package org.example;

public class Main {
    public static void main(String[] args) {

        Usuario u1 = new Usuario("jhoel@gmail.com", "jhoel");

        Musica m1 = new Musica("Resenha do Arrocha", "J Eskine", 60 * 7);

        Musica m2 = new Musica("Chapa do chatão", "Chatão" , 60 * 5 + 54);

        Musica m3 = new Musica("Imprevistos", "Pablo" , 3*60 + 30);

        Musica m4 = new Musica("São Paulo", "Kyan" , 60 * 3);

        Playlist p1 = new Playlist("Páscoa", u1);

        p1.adicionarMusica(m1);
        p1.adicionarMusica(m2);
        p1.adicionarMusica(m3);
        p1.adicionarMusica(m4);

        p1.toString();
        System.out.println(p1.toString());;

        System.out.println(p1.getDuracao());

    }
}