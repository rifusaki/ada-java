package encapsulatedagenda;

public class Contact{
    private String name;
    private int number;
    private String email;

    public Contact(String name, int number, String email){
        this.name = name;
        this.number = number;
        this.email = email;
    }

    public void showData(){
        System.out.println("""
        Name: %s
        Number: %d
        Email: %s\n""".formatted(name, number, email));
    }

    public String getName(){
        return name;
    }

    public int getNumber(){
        return number;
    }

    public String getEmail(){
        return email;
    }

    public boolean isValid(){
        if(name == null || name.isEmpty()){
            return false;
        }
        if(number <= 0){
            return false;
        }
        if(!isEmailValid(email)){
            return false;
        }
        return true;
    }

    public static boolean isEmailValid(String email){
        if(email == null || email.isEmpty()){
            return false;
        }
        return email.matches(".+@.+\\..+");
    }
}
