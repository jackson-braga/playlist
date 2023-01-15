package impl;

import interfaces.IPlayList;
import midias.Musica;

import java.util.ArrayList;
import java.util.List;

public class PlayListMusic implements IPlayList<Musica> {
    private String nome;
    private String genero;

    private List<Musica> musicas = new ArrayList<>();

    public PlayListMusic(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    @Override
    public void add(Musica musica) {
        musicas.add(musica);
    }

    @Override
    public Musica get() {
        return musicas.get(0);
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public void delete(Musica musica) {
        musicas.remove(musica);
    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }
}
