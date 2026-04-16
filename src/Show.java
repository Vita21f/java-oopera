import java.util.ArrayList;

class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;


    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    @Override
    public String toString() {
        return "Режиссёр: " + director.name + " " + director.surname;
    }

    public void printListOfActors() {
        System.out.println("Актёры спектакля \"" + title + "\":");
        for (Actor actor : listOfActors) {
            System.out.println("- " + actor);
        }
    }

    public void addActor(Actor newActor) {
        if (listOfActors.contains(newActor)) {
            System.out.println(newActor + " уже участвует в спектакле.");
        } else {
            listOfActors.add(newActor);
            System.out.println(newActor + " добавлен в спектакль.");
        }
    }

    public boolean replaceActor(String oldSurname, Actor newActor) {
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor currentActor = listOfActors.get(i);
            if (currentActor.surname.equals(oldSurname)) {
                listOfActors.set(i, newActor);
                System.out.println("Актёр " + oldSurname + " заменён на " + newActor + ".");
                return true;
            }
        }
        System.out.println("Актёра с фамилией " + oldSurname + " не найдено.");
        return false;
    }
}



