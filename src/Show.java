import java.util.ArrayList;
import java.util.Objects;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        listOfActors = new ArrayList<>();

    }

    public void printActors() {
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }

    public void addActor(Actor newActor) {
        boolean isPresent = false;
        for (Actor actor : listOfActors) {
            if (actor.equals(newActor)) {
                isPresent = true;
                break;
            }
        }
        if (!isPresent) {
            listOfActors.add(newActor);
        } else {
            System.out.println("Такой актер уже добавлен");
        }
    }

    public void replaceActor(Actor newActor, String surname) {
        boolean isPresent = false;
        for (Actor actor : listOfActors) {
            if (actor.getSurname().equals(surname)) {
                isPresent = true;
                break;
            }
        }
        if (isPresent) {
            for (Actor actor : listOfActors) {
                if (actor.getSurname().equals(surname)) {
                    listOfActors.remove(actor);
                    break;
                }
            }
            listOfActors.add(newActor);
        } else {
            System.out.println("Такого актера нет");
        }
    }

    public String getTitle(){
        return title;
    }


}


