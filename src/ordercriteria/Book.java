package ordercriteria;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public int compareTo(Book other) {
        int priceComparison = Double.compare(this.price, other.price);
        if (priceComparison != 0) {
            return priceComparison;
        }
        return this.title.compareTo(other.title);
    }

    public String getTitle() {
        return title;
    }
}
