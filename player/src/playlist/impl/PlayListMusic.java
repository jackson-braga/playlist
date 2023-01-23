package playlist.impl;

import playlist.interfaces.IMusica;
import playlist.interfaces.IPlayList;

import java.util.ArrayList;
import java.util.List;

public class PlayListMusic implements IPlayList<IMusica> {
    private String nome;
    private String genero;
    private int idxAtual;

    private List<IMusica> musicas = new ArrayList<>();

    public PlayListMusic(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    @Override
    public void add(IMusica musica) {
        musicas.add(musica);
    }

    @Override
    public void delete(IMusica musica) {
        musicas.remove(musica);
    }

    @Override
    public IMusica anterior() {
        idxAtual--;
        return atual();
    }

    @Override
    public IMusica atual() {
        return musicas.get(idxAtual);
    }

    @Override
    public IMusica proximo() {
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
}
