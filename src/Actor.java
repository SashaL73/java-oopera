import java.util.Objects;

public class Actor extends Person {
    double height;

    public Actor(String name, String surname, Gender gender, double height) {
        super(name, surname, gender);
        this.height = height;
    }


    @Override
    public String toString(){
        return name + " " + surname + " (" + height + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Actor otheActor = (Actor) obj;
        return Objects.equals(name, otheActor.name) &&
               Objects.equals(surname, otheActor.surname) &&
               (height == otheActor.height);
    }

    @Override
    public int hashCode() {
        int hash = 2;
        if (name != null){
            hash = name.hashCode();
        }
        hash = hash * 31;
        if (surname != null){
            hash = hash + surname.hashCode();
        }
        if (height > 0){
            hash = hash + Double.hashCode(height);
        }
        return hash;
    }
}
