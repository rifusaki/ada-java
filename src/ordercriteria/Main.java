package ordercriteria;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("One Hundred Years of Solitude", "Gabriel García Márquez", 12.99);
        Book book2 = new Book("1984", "George Orwell", 12.99);
        Book book3 = new Book("The End", "Attila Bartis", 8.99);

        // unordered
        java.util.List<Book> books = new java.util.ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        System.out.println("Unordered list:");
        for (Book b : books) {
            System.out.println("- " + b.getTitle());
        }

        // sort
        java.util.Collections.sort(books);

        // sorted result
        System.out.println("\nSorted list:");
        for (Book b : books) {
            System.out.println("- " + b.getTitle());
        }

        
    }
}
