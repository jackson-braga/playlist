package impl;

import interfaces.IPlayList;
import midias.Musica;

import java.util.ArrayList;
import java.util.List;

public class PlayListMusic implements IPlayList<Musica> {
    private String genero;
    private List<Musica> musicas = new ArrayList<>();

    @Override
    public void add(Musica musica) {
        musicas.add(musica);
    }

    @Override
    public Musica get() {
        return musicas.get(0);
    }

    @Override
    public void delete(Musica musica) {

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
