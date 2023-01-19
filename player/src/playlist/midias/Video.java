package playlist.midias;

import playlist.interfaces.IMidia;

import java.util.List;

public class Video implements IMidia {
    @Override
    public String getNome() {
        return null;
    }

    @Override
    public String getCantor() {
        throw new RuntimeException();
    }

    @Override
    public String getGenero() {
        return null;
    }

    @Override
    public String getClassificacao() {
        return null;
    }

    public List<String> getAtores() {
        return null;
    }

    @Override
    public String getLocal() {
        return null;
    }
}
