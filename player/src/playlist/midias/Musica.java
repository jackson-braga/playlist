package playlist.midias;

import playlist.interfaces.IMusica;

public class Musica extends Midia implements IMusica {
    private String cantor;
    private String compositor;

    @Override
    public String getCantor() {
        return cantor;
    }

    @Override
    public String getComposito() {
        return compositor;
    }
}
