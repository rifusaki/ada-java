package encapsulatedagenda;

public class Main {
    public static void main(String[] args){
        System.out.println("");
        Agenda agenda = new Agenda(2);

        Contact contact1 = new Contact("Izutsumi", 4951, "izutsumi@izutsumi.art");
        Contact contact2 = new Contact("Laios", 0001, "laios@ryoko.kui");

        agenda.addContact(contact1);
        agenda.addContact(contact2);
        agenda.addContact(contact1);

        agenda.showContacts();

        System.out.println("Saved contacts: %d".formatted(agenda.getCount()));
        System.out.println("");
    }
}
