package playlist.midias;

import playlist.interfaces.IVideo;

import java.util.List;

public class Video extends Midia implements IVideo {
    private String classificacao;
    private List<String> atores;

    @Override
    public String getClassificacao() {
        return classificacao;
    }

    @Override
    public List<String> getAtores() {
        return atores;
    }
}
