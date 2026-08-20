package parallelism;

// Exercise: Create a task that counts from 1 to 5 with Runnable, and launch it on two threads simultaneously.
//
// Fine point: try replacing start() with run() — you'll see both "threads" execute back-to-back
// instead of in parallel, because run() is just a plain method call on the main thread.

public class RunnableCounter {

    static class Counter implements Runnable {
        private final String name;

        Counter(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(name + " -> " + i);
            }
        }
    }

    public static void main(String[] args) {
        Runnable task = new Counter("Thread");

        Thread threadA = new Thread(task, "A");
        Thread threadB = new Thread(task, "B");

        threadA.start(); // spawns a real OS thread
        threadB.start(); // spawns a real OS thread

        // Try: threadA.run(); threadB.run();
        // → no parallelism: B waits until A's run() returns.
    }
}
