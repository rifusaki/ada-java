package encapsulatedagenda;

public class Agenda{
    private Contact[] contacts;
    private int count;

    public Agenda(int size){
        this.contacts = new Contact[size];
        this.count = 0;
    }

    public boolean addContact(Contact c){
        if(c == null || !c.isValid()){
            return false;
        }
        else if (contactEmailExists(c.getEmail())){
            System.out.println("Contact with email %s already exists.".formatted(c.getEmail()));
            return false;
        }

        if(getCount() == contacts.length){
            resizeContacts(contacts.length + 1);
        }

        contacts[getCount()] = c;
        count++;
        return true;
    }

    public boolean deleteContact(String email){
        if(!Contact.isEmailValid(email)){
            return false;
        }

        int contactIndex = findContactIndexByEmail(email);

        if(contactIndex == -1){
            return false;
        }

        for(int i = contactIndex; i < count - 1; i++){
            contacts[i] = contacts[i + 1];
        }

        contacts[count - 1] = null;
        count--;
        return true;
    }

    public void showContacts(){
        System.out.println("contacts in the address book:\n");

        for(int i = 0; i < count; i++){
            contacts[i].showData();
        }
    }

    public Contact findContactByEmail(String email){
        int contactIndex = findContactIndexByEmail(email);

        if(contactIndex == -1){
            return null;
        }

        return contacts[contactIndex];
    }

    // helper methods
    public int getCount(){
        return count;
    }

    private void resizeContacts(int newSize){
        if (newSize > contacts.length) {
            this.contacts = java.util.Arrays.copyOf(contacts, newSize);
        }
        else {
            throw new IllegalArgumentException("New size must be greater than current size.");
        }
    }

    private boolean contactEmailExists(String email){
        return findContactByEmail(email) != null;
    }

    private int findContactIndexByEmail(String email){
        if(!Contact.isEmailValid(email)){
            return -1;
        }

        for(int i = 0; i < count; i++){
            if(contacts[i].getEmail().equals(email)){
                return i;
            }
        }
        return -1;
    }

}
