package strategypattern;

import strategypattern.implement_skill.PlayGuitarJazzy;
import strategypattern.implement_skill.PlayPianoJazzy;

/**
 * @author Derayan Bima A (derayan.bima@dana.id)
 * @version strategypattern.AndyPerson, v 0.1 2019-07-04 09:40 by Derayan Bima A
 */
public class AndyPerson extends Musician {

    @Override
    public void display() {
        System.out.println("Hello my name Andy, I am musician");
    }

    public AndyPerson(){
        jazzSongBehavior = new PlayGuitarJazzy();
        jazzSongBehavior = new PlayPianoJazzy();
    }
}
