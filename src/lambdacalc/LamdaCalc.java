package lambdacalc;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LamdaCalc {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
        BiFunction<Integer, Integer, Integer> subtract = (x, y) -> x - y;
        BiFunction<Integer, Integer, Integer> multiply = (x, y) -> x * y;
        Function<Integer, Integer> square = x -> x * x;
        
        System.out.println(add.apply(5, 3));
        System.out.println(subtract.apply(5, 3));
        System.out.println(multiply.apply(5, 3));
        System.out.println(square.apply(5));
    }
}
