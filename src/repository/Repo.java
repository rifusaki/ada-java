package repository;

import java.util.ArrayList;


public class Repo<T> {
    private final ArrayList<T> innerList = new ArrayList<>();

    public void add(T e) {
        innerList.add(e);
    }

    public T obtain(int i) {
        return innerList.get(i);
    }

    public T obtainLast() {
        if (innerList.isEmpty()) {
            return null;
        }
        return innerList.getLast();
    }

    public int amount() {
        return innerList.size();
    }

}
