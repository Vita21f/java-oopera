import java.util.ArrayList;

class MusicShow extends Show {
  protected String musicAuthor;
  protected String librettoText;

    public MusicShow(String title, int duration, Director director, ArrayList<Actor> listOfActors,
                     String musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }
    public void printLibretto() {
        System.out.println("Либретто:");
        System.out.println(librettoText);
    }

}