package agenda;

public class Agenda {

    private final Contact[] contacts;
    private final int capacity;
    private int count;

    public Agenda(int capacity) {
        this.capacity = capacity;
        this.contacts = new Contact[capacity];
        this.count = 0;
    }

    public boolean add(Contact contact) {
        if (contact == null || isFull() || !isValidEmail(contact.email)) {
            return false;
        }

        contacts[count] = contact;
        count++;

        return true;
    }

    public boolean remove(String name) {
        int index = findIndexByName(name);

        if (index == -1) {
            return false;
        }

        for (int i = index; i < count - 1; i++) {
            contacts[i] = contacts[i + 1];
        }

        contacts[count - 1] = null;
        count--;

        return true;
    }

    public Contact search(String name) {
        int index = findIndexByName(name);

        if (index == -1) {
            return null;
        }

        return contacts[index];
    }

    public void list() {
        if (isEmpty()) {
            System.out.println("The agenda is empty.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println("%d. %s".formatted(i + 1, contacts[i]));
        }
    }

    public void listFavorites() {
        if (countFavorites() == 0) {
            System.out.println("There are no favorite contacts.");
            return;
        }

        for (int i = 0; i < count; i++) {
            if (contacts[i].favorite) {
                System.out.println("%d. %s".formatted(i + 1, contacts[i]));
            }
        }
    }

    public int countFavorites() {
        int favoriteCount = 0;

        for (int i = 0; i < count; i++) {
            if (contacts[i].favorite) {
                favoriteCount++;
            }
        }

        return favoriteCount;
    }

    public boolean isFull() {
        return count == capacity;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int getCount() {
        return count;
    }

    public int getCapacity() {
        return capacity;
    }

    private int findIndexByName(String name) {
        for (int i = 0; i < count; i++) {
            if (contacts[i].name.equalsIgnoreCase(name)) {
                return i;
            }
        }

        return -1;
    }

    private boolean isValidEmail(String email) {
        if (email == null) {
            return false;
        }

        return email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    }
}
