package exam2.repo;
import java.util.ArrayList;

public class MockRepo<T> implements Repository<T> {
    private ArrayList<T> items;

    public MockRepo() {
        this.items = new ArrayList<T>();
    }

    public String getInfo() {
        return "MockRepo";
    }
    
    public void save(T item) {
        this.items.add(item);
    }

    public T get(int i) {
        return this.items.get(i);
    }

    public int getLenght() {
        return this.items.size();
    }
}
