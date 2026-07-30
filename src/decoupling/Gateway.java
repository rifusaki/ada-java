package decoupling;

interface Gateway {
    void charge(double amount);
}

class StripeGateway implements Gateway {
    @Override
    public void charge(double amount) {
        System.out.println("Charging $" + amount + " via Stripe.");
    }
}

class MockGateway implements Gateway {
    @Override
    public void charge(double amount) {
        System.out.println("Mock charge of $" + amount + " successful. (Test)");
    }
}

class Store {
    private Gateway gateway;

    public Store(Gateway gateway) {
        this.gateway = gateway;
    }

    void purchase(double amount) {
        gateway.charge(amount);
    }
}

// class Main {
//     public static void main(String[] args) {
//         // 3. Show the assembly with Stripe in the main method
//         Gateway stripe = new StripeGateway();
//         Store myStore = new Store(stripe);
//         myStore.purchase(100.0); // Uses Stripe

//         // Demonstrating the assembly with the Fake Gateway (Testing)
//         Gateway mockGateway = new MockGateway();
//         Store testStore = new Store(mockGateway);
//         testStore.purchase(50.0); // Uses Fake Gateway
//     }
// }