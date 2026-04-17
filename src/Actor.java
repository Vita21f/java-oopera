import java.util.Objects;

class Actor extends Person {
  protected int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Actor otherActor = (Actor) obj;
        return Objects.equals(name, otherActor.name) &&
                Objects.equals(surname, otherActor.surname) &&
                (height == otherActor.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, height);
    }


    @Override
    public String toString() {
        return name + " " + surname + " (" + height + " см)";
    }


}
