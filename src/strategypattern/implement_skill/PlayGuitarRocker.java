package strategypattern.implement_skill;

import strategypattern.interface_skill.RockSong;

public class PlayGuitarRocker implements RockSong {
    @Override
    public void playingRock() {
        System.out.println("I'm playing rock song with a guitar");
    }
}
