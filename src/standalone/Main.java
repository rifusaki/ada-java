package standalone;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();

        figures.add(new Circle(3));
        figures.add(new Rectangle(4, 4));
        figures.add(new Square(5));
        figures.add(new IsoscelesTriangle(2, 4));

        System.out.println("\nAreas:"); 

        double totalArea = 0;
        for (Figure figure : figures) {
            System.out.println(figure.getArea());
            totalArea += figure.getArea();
        }
        System.out.println("");

        System.out.println("Total Area: %.2f".formatted(totalArea));
    }
}