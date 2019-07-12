import implement_skill.PlayGuitarJazzy;
import implement_skill.PlayGuitarRocker;
import implement_skill.PlayPianoJazzy;

public class Main {

    public static void main(String[] args) {

        Musician andy = new AndyPerson();
        andy.display();
        andy.setJazzSongBehavior(new PlayGuitarJazzy());
        andy.performJazzSong();
        andy.setJazzSongBehavior(new PlayPianoJazzy());
        andy.performJazzSong();

        System.out.println("========================================");

        Musician abra = new AbraPerson();
        abra.display();
        abra.setRockSongBehavior(new PlayGuitarRocker());
        abra.performRockSong();
        abra.setJazzSongBehavior(new PlayPianoJazzy());
        abra.performJazzSong();

       /* Musician kaleb = new KalebPerson();
        kaleb.display();
        kaleb.playGuitar();
        kaleb.playPiano();*/
    }
}
