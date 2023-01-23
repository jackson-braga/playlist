package playlist.midias;

import playlist.interfaces.IMidia;

public abstract class Midia implements IMidia {
    private String nome;
    private String local;
    private String genero;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getLocal() {
        return local;
    }

    @Override
    public String getGenero() {
        return genero;
    }
}
