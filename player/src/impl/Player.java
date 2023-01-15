package impl;

import midias.Musica;
import midias.PodCast;
import midias.Video;

public class Player {


    PlayListMusic playListMusca = new PlayListMusic("Meus Rocks", "Rock");

    Musica musica = new Musica();
    Video video = new Video();
    PodCast podCast = new PodCast();

    public Player() {
        playListMusca.add(musica);
        playListMusca.add(video);

        playListMusca.add(podCast);
    }
}
