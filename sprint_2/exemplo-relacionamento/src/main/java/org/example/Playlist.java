package org.example;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

    private String nome;
    private Usuario usuario;
    private List<Musica> musicas;

    public Playlist(String nome, Usuario usuario) {
        this.nome = nome;
        this.usuario = usuario;
        this.musicas = new ArrayList<>();
    }
    public String toString(){
        return ("""
                ----------------------------------------------------
                Playlist - %s
                ----------------------------------------------------
                Usuário: %S
                Músicas: %S
                ----------------------------------------------------
                """.formatted(nome, usuario, musicas));

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void adicionarMusica(Musica musica){
        musicas.add(musica);

    }

    public Integer getDuracao(){
        Integer total = 0;
        for (int i = 0; i < musicas.size(); i++) {
            total = total + (musicas.get(i)).getDuracao();
        }
        return  total;
    }
}
