package agenda;

public class Main {

    public static void main(String[] args) {
        Input input = new Input();
        int capacity = input.genericPositiveIntInput("Enter agenda capacity: ");
        Agenda agenda = new Agenda(capacity);

        int option;

        do {
            System.out.println("\nProfessional Agenda");
            System.out.println("1. Add contact");
            System.out.println("2. Remove contact");
            System.out.println("3. Search contact");
            System.out.println("4. List contacts");
            System.out.println("5. List favorite contacts");
            System.out.println("6. Count favorite contacts");
            System.out.println("7. Show agenda status");
            System.out.println("8. Exit");

            option = input.genericIntInput("Choose an option: ");

            switch (option) {
                case 1:
                    addContact(input, agenda);
                    break;
                case 2:
                    removeContact(input, agenda);
                    break;
                case 3:
                    searchContact(input, agenda);
                    break;
                case 4:
                    agenda.list();
                    break;
                case 5:
                    agenda.listFavorites();
                    break;
                case 6:
                    System.out.println("Favorite contacts: " + agenda.countFavorites());
                    break;
                case 7:
                    printAgendaStatus(agenda);
                    break;
                case 8:
                    System.out.println("Goodbye.");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (option != 8);

        input.close();
    }

    private static void addContact(Input input, Agenda agenda) {
        String name = input.genericStringInput("Enter contact name: ");
        String email = input.genericStringInput("Enter contact email: ");
        String phone = input.genericStringInput("Enter contact phone: ");
        boolean favorite = input.genericBooleanInput("Is this contact a favorite? (yes/no): ");

        Contact contact = new Contact(name, email, phone, favorite);

        if (agenda.add(contact)) {
            System.out.println("Contact added successfully.");
        } else {
            System.out.println("Contact could not be added. Check the email or agenda capacity.");
        }
    }

    private static void removeContact(Input input, Agenda agenda) {
        String name = input.genericStringInput("Enter contact name to remove: ");

        if (agenda.remove(name)) {
            System.out.println("Contact removed successfully.");
        } else {
            System.out.println("Contact was not found.");
        }
    }

    private static void searchContact(Input input, Agenda agenda) {
        String name = input.genericStringInput("Enter contact name to search: ");
        Contact contact = agenda.search(name);

        if (contact == null) {
            System.out.println("Contact was not found.");
            return;
        }

        contact.printContactDetails();
    }

    private static void printAgendaStatus(Agenda agenda) {
        System.out.println("Contacts: %d/%d".formatted(agenda.getCount(), agenda.getCapacity()));
        System.out.println("Is full: " + agenda.isFull());
        System.out.println("Is empty: " + agenda.isEmpty());
    }
}
