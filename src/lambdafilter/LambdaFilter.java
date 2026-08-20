package lambdafilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaFilter {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Predicate<Integer> isEven = n -> n % 2 == 0;
        Function<Integer, Integer> square = n -> n * n;
        Consumer<Integer> print = n -> System.out.println("Result: " + n);

        process(numbers, isEven, square, print);
    }

    public static <T, R> void process(List<T> list, Predicate<T> filter, Function<T, R> map, Consumer<R> action) {
        for (T element : list) {
            if (filter.test(element)) {
                action.accept(map.apply(element));
            }
        }
    }
}
