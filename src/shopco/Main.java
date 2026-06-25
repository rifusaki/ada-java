package shopco;

/**
 * additional answers:
 * 1. nothing catastrophic. java just builds a default no-arg constructor 
 * 2. using `object2 = object1` will make both references point to the same object in memory, so
 *    you basically just added a new name for the same thing instead of creating a new thing
 * 3. the total in `Shipment` is calculated in the constructor as it depends on the other parameters
 * 4. using `private` for the attributes prevents direct access from outside the class. i mean you
 *    don't want to leave them open for anyone to change them arbitrarily do ya
 */


public class Main {

    public static void main(String[] args) {
        System.out.println("""

                  SHOPCO - COLOMBIA
            ------------------------------
            """);

        Product product1 = new Product();
        Product product2 = new Product("Mimic", 189900, 25, "Why would you buy this");
        Product product3 = new Product(product2);

        Client client1 = new Client();
        Client client2 = new Client("Izutsumi", "izutsumi@izutsumi.izutsumi", "Probably behind you", "3070009797");
        Client client3 = new Client(client2);

        Seller seller1 = new Seller();
        Seller seller2 = new Seller("Marcille Donato", "V-001", 0.7, true);
        Seller seller3 = new Seller(seller2);

        Shipment shipment1 = new Shipment();
        Shipment shipment2 = new Shipment("S-009398", "Golden Kingdom", 3, 1200);
        Shipment shipment3 = new Shipment(shipment2);

        Order order1 = new Order();
        Order order2 = new Order("O-001", client2, product2, 2);
        Order order3 = new Order(order2);

        System.out.println("\n--- PRODUCTS");
        product1.show();
        product2.show();
        product3.show();

        System.out.println("\n--- CLIENTS");
        client1.show();
        client2.show();
        client3.show();

        System.out.println("\n--- SELLERS");
        seller1.show();
        seller2.show();
        seller3.show();

        System.out.println("\n--- SHIPMENTS");
        shipment1.show();
        shipment2.show();
        shipment3.show();

        System.out.println("\n--- ORDERS");
        order1.show();
        order2.show();
        order3.show();

        System.out.println("""
            \n~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
                      bye :3
            """);
    }
}
