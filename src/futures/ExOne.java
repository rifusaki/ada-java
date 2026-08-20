package futures;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.Scanner;

public class ExOne {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number: ");
        Double number = scanner.nextDouble();

        Future<Double> future = executor.submit(() -> {
            Thread.sleep(2000);
            return number * number;
        });

        System.out.println("smthing else");
        System.out.println("result: " + future.get());
        executor.shutdown();
        scanner.close();
    }

}
