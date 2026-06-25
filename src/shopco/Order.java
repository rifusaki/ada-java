package shopco;

public class Order {
    
    private String   orderNumber;
    private Client  client;
    private Product product;
    private int      amount;
    private double   total;

    // constructors    
    public Order() {
        this.orderNumber = "O-000";
        this.client = new Client();
        this.product = new Product();
        this.amount = 0;
        this.total = 0.0;
    }

    public Order(String orderNumber, Client client, Product product, int amount) {
        this.orderNumber = orderNumber;
        this.client = client;
        this.product = product;
        this.amount = amount;
        this.total = product.getPrice() * amount;
    }

    public Order(Order parent) {
        this.orderNumber = parent.orderNumber;
        this.client = parent.client;
        this.product = parent.product;
        this.amount = parent.amount;
        this.total = parent.total;
    }

    // methods
    public void show() {
        System.out.println("""
            -- ShopCo Order
            Order Number: %s
            Client:       %s
            Product:      %s
            Amount:       %d units
            Total:        $%.2f
            --
            """.formatted(orderNumber, client, product, amount, total));
    }
}
