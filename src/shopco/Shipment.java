package shopco;

public class Shipment {
    
    private String shipmentId;
    private String targetCity;
    private int shipmentDays;
    private double shipmentCost;

    // constructors
    public Shipment() {
        this.shipmentId = "S-000";
        this.targetCity = "Unknown";
        this.shipmentDays = 0;
        this.shipmentCost = 0.0;
    }

    public Shipment(String shipmentId, String targetCity, int shipmentDays, double shipmentCost) {
        this.shipmentId = shipmentId;
        this.targetCity = targetCity;
        this.shipmentDays = shipmentDays;
        this.shipmentCost = shipmentCost;
    }

    public Shipment(Shipment parent) {
        this.shipmentId = parent.shipmentId;
        this.targetCity = parent.targetCity;
        this.shipmentDays = parent.shipmentDays;
        this.shipmentCost = parent.shipmentCost;
    }

    // methods
    public void show() {
        System.out.println("""
            -- Shipment
            ID:           %s
            Target City:  %s
            Days:         %d
            Cost:         $%.2f
            """.formatted(shipmentId, targetCity, shipmentDays, shipmentCost));
    }
}