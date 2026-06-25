package agenda;

public class Contact {

    String name;
    String email;
    String phone;
    boolean favorite;

    public Contact(String name, String email, String phone, boolean favorite) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.favorite = favorite;
    }

    public void printContactDetails() {
        System.out.printf("""
            CONTACT PROFILE: %s
            
            Email:    %s
            Phone:    %s
            Favorite: %s
            %n""",
            name, email, phone, favorite ? "Yes" : "No");
    }

    @Override
    public String toString() {
        return "%s | %s | %s | Favorite: %s"
            .formatted(name, email, phone, favorite ? "Yes" : "No");
    }
}
