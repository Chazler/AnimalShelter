package Animals;

import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Animals.Gender;

import java.util.ArrayList;
import java.util.Observable;

public class Reservation extends Observable{

private ArrayList<Animal> Animals = new ArrayList<Animal>();


    public ArrayList<Animal> getAnimals() {
        return Animals;
    }
    public void setAnimals(Animal animal){
        this.Animals.add(animal);
    }

    public void NewCat(String name, Gender gender, String badHabits){
        this.Animals.add(new Cat(name, gender, badHabits));
        notifyObserver();
    }

    public void NewDog(String name, Gender gender){
        this.Animals.add(new Dog(name, gender));
        notifyObserver();
    }

    public void notifyObserver(){

    }
}
