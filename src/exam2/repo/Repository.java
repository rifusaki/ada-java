package exam2.repo;

public interface Repository<T> {
    public String getInfo();
    public void save(T item);
    public T get(int i);
    public int getLenght();
}
