package shopco;

public class Seller {
    
    private String name;
    private String id;
    private double fee;
    private boolean isActive;

    // constructors
    public Seller() {
        this.name = "Unassigned";
        this.id = "V-000";
        this.fee = 0.0;
        this.isActive = false;
    }

    public Seller(String name, String id, double fee, boolean isActive) {
        this.name = name;
        this.id = id;
        this.fee = fee;
        this.isActive = isActive;
    }

    public Seller(Seller parent) {
        this.name = parent.name;
        this.id = parent.id;
        this.fee = parent.fee;
        this.isActive = parent.isActive;
    }

    // methods
    public void show() {
        System.out.println("""
            -- Seller
            Name:       %s
            ID:         %s
            Fee:        %.1f%%
            Active:     %b
            """.formatted(name, id, fee, isActive));
    }
}
