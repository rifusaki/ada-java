package parallelism;

// without synchronized: two threads read the same value, both increment it, and one write is lost so the final count ends up below 2000
//
// without join(): main prints before the threads finish, so 0 or a partial count
//
// synchronized fixes it by letting only one thread execute increment() at a time so no read-modify-write cycle is ever interrupted.

public class SharedCounter {

    static class Counter {
        private int value = 0;

        // Remove synchronized to reproduce the race condition.
        public synchronized void increment() {
            value++;
        }

        public int getValue() {
            return value;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread threadA = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        Thread threadB = new Thread(() -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        });

        threadA.start();
        threadB.start();

        threadA.join(); // waits threadA finishes
        threadB.join(); // waits until threadB finishes

        System.out.println("Final value: " + counter.getValue()); // should be 2000
    }
}
