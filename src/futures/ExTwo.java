package futures;

import java.util.concurrent.CompletableFuture;

public class ExTwo {
    public static void main(String[] args) throws Exception {
        CompletableFuture<Void> futureResult = CompletableFuture.supplyAsync(() -> {
        try { Thread.sleep(1000);} catch (InterruptedException e) {}
        return 600.0;
        })
        .thenApply((basePrice) -> {return basePrice * 1.13;})
        .thenApply((priceWithTax) -> {return String.valueOf(priceWithTax);})
        .thenAccept((result) -> {System.out.println("result: " + result + "\n");});

        System.out.println("\ncalculating. .. ... .... .....");
        
        Thread.sleep(2000);
    }
}