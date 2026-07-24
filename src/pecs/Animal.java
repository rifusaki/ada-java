package pecs;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void meow() {
        System.out.println("Meow");
    }
}

class Kitten extends Cat {
    public Kitten(String name) {
        super(name);
    }
}