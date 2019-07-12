import implement_skill.PlayGuitarRocker;

/**
 * @author Derayan Bima A (derayan.bima@dana.id)
 * @version AbraPerson, v 0.1 2019-07-04 09:42 by Derayan Bima A
 */
public class AbraPerson extends Musician {

    @Override
    public void display() {
        System.out.println("Hello my name Abra, I am musician");
    }

    public AbraPerson(){
        rockBehaviorSong = new PlayGuitarRocker();
    }

}
