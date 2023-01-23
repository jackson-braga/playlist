package player;

import playlist.impl.PlayListHibrido;
import playlist.interfaces.IMidia;
import playlist.interfaces.IPlayList;
import playlist.midias.Video;

public class Player {

    IPlayList<IMidia> playList;

    public Player(IPlayList playList) {
        this.playList = playList;
    }

    public void play() {
        IMidia midia = playList.atual();
    }

    public void pause(){

    }

    public void stop(){

    }

    public void next() {
        playList.proximo();
    }

    public void previous() {

    }
}
