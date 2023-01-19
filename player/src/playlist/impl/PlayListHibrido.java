package playlist.impl;

import playlist.interfaces.IMidia;
import playlist.interfaces.IPlayList;

import java.util.List;

public class PlayListHibrido implements IPlayList<IMidia> {

    @Override
    public void add(IMidia iMidia) {

    }

    @Override
    public void delete(IMidia iMidia) {

    }

    @Override
    public IMidia anterior() {
        return null;
    }

    @Override
    public IMidia atual() {
        return null;
    }

    @Override
    public IMidia proximo() {
        return null;
    }

    @Override
    public List<String> getFila() {
        return null;
    }
}
