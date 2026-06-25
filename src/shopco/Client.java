package shopco;

public class Client {
    
    private String name;
    private String email;
    private String city;
    private String phoneNumber;

    // constructors
    public Client() {
        this.name = "Unknown";
        this.email = "Unknown";
        this.city = "Unknown";
        this.phoneNumber = "Unknown";
    }

    public Client(String name, String email, String city, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    public Client(Client parent) {
        this.name = parent.name;
        this.email = parent.email;
        this.city = parent.city;
        this.phoneNumber = parent.phoneNumber;
    }


    // methods
    public void show() {
        System.out.println("""
            -- Client
            Name:       %s
            Email:      %s
            City:       %s
            Phone:      %s
            """.formatted(name, email, city, phoneNumber));
    }

    @Override
    public String toString() {
        return "%s | %s".formatted(name, city);
    }
}