package playlist.impl;

import playlist.interfaces.IPlayList;
import playlist.midias.Musica;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PlayListMusic implements IPlayList<Musica>, Comparator {
    private String nome;
    private String genero;
    private int idxAtual;

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
    public void delete(Musica musica) {
        musicas.remove(musica);
    }

    @Override
    public Musica anterior() {
        idxAtual--;
        return atual();
    }

    @Override
    public Musica atual() {
        return musicas.get(idxAtual);
    }

    @Override
    public Musica proximo() {
        idxAtual++;
        return atual();
    }

    @Override
    public List<String> getFila() {
        return null;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
