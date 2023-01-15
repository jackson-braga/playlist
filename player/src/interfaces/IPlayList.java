package interfaces;

public interface IPlayList<T extends IMidia> {

    void add(T t);
    T get();
    void delete(T t);
    void play();
    void pause();
    void stop();
}
