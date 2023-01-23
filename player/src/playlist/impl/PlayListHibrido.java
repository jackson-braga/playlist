package playlist.impl;

import playlist.interfaces.IMidia;
import playlist.interfaces.IPlayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PlayListHibrido implements IPlayList<IMidia> {
    private int idxAtual;
    private String nome;
    private List<IMidia> midias = new ArrayList<>();

    public PlayListHibrido(String nome) {
        this.nome = nome;
    }

    @Override
    public void add(IMidia iMidia) {
        midias.add(iMidia);
    }

    @Override
    public void delete(IMidia iMidia) {
        midias.remove(iMidia);
    }

    @Override
    public IMidia anterior() {
        idxAtual--;
        return atual();
    }

    @Override
    public IMidia atual() {
        return midias.get(idxAtual);
    }

    @Override
    public IMidia proximo() {
        idxAtual++;
        return atual();
    }

    @Override
    public List<String> getFila() {
        return midias.stream().map(midia -> midia.getNome()).collect(Collectors.toList());
    }

    @Override
    public String getNome() {
        return nome;
    }
}
