package playlist.interfaces;

import java.util.List;

public interface IPlayList<T extends IMidia> {
// Fazer o contrele de uma lista de musicas, videos, playlist.midias .....
    void add(T t);

    void delete(T t);

    T anterior();

    T atual();

    T proximo();

    List<String> getFila();
}
