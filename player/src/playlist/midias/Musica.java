package playlist.midias;

import playlist.interfaces.IMidia;
import playlist.interfaces.IMusica;

public class Musica implements IMidia, IMusica {
    private String nome;
    private String local;
    private Integer ordem;
    private String cantor;
    private String compositor;
    private String genero;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getCantor() {
        return null;
    }

    @Override
    public String getGenero() {
        return null;
    }

    @Override
    public String getLocal() {
        return null;
    }
}
