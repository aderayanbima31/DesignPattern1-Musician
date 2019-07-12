import interface_skill.JazzSong;
import interface_skill.RockSong;

/**
 * @author Derayan Bima A (derayan.bima@dana.id)
 * @version Musician, v 0.1 2019-07-04 09:38 by Derayan Bima A
 */
public abstract class Musician {

    JazzSong jazzSongBehavior;
    RockSong rockBehaviorSong;

    public Musician(){}

    public abstract void display();

    public void performJazzSong(){
        jazzSongBehavior.playingJazz();
    }

    public void setJazzSongBehavior(JazzSong jazzSong){
        jazzSongBehavior = jazzSong;
    }

    public void performRockSong(){
        rockBehaviorSong.playingRock();
    }

    public void setRockSongBehavior(RockSong rockSong){
        rockBehaviorSong = rockSong;
    }




}
