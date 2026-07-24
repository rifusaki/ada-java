package pecs;

import java.util.ArrayList;
import java.util.Collections;

public class Main {   
    public static void main(String[] args) {

        ArrayList<Kitten> kittenList = new ArrayList<>();
        ArrayList<Animal> animalList = new ArrayList<>();

        Collections.addAll(kittenList, new Kitten("Firulais"), new Kitten("Lyra"), new Kitten("Nativa"));

        Lists.copy(kittenList, animalList);

        System.out.println("\n"+animalList+"\n");

        for (Animal i : animalList) {
            System.out.println(i.getName());

        }

        System.out.println();
        kittenList.get(0).meow();
        System.out.println();
    }
}