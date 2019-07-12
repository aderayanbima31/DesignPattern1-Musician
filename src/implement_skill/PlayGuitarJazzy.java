package implement_skill;

import interface_skill.JazzSong;

public class PlayGuitarJazzy implements JazzSong {
    @Override
    public void playingJazz() {
        System.out.println("I'm playing jazz song with a guitar");
    }
}
