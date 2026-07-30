package injection;

public class MockDatabase implements DatabaseOperations {
    @Override
    public void insert(String name) {
        System.out.println("Mock database: inserted " + name);
    }
}
