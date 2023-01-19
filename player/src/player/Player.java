package player;

import playlist.impl.PlayListHibrido;
import playlist.interfaces.IMidia;
import playlist.interfaces.IPlayList;
import playlist.midias.Video;

import java.io.Serializable;

public class Player {

//    PlayListMusic playListMusca = new PlayListMusic("Meus Rocks", "Rock");
    IPlayList playList = new PlayListHibrido();

    public Player(IPlayList playList) {
        this.playList = playList;

    }

    public void play() {
        IMidia midia = playList.atual();
        if(midia instanceof Video)
            midia.getClassificacao();

//        MediaPlayer(midia).execute();
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
