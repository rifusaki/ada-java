package exam2.repo;

public class Main {
    public static void main(String[] args) {

        Service service1 = new Service(new MemoryRepo<String>());
        Service service2 = new Service(new MockRepo<String>());

        // a service can receive 
        System.out.println(service1.getRepositoryInfo());
        System.out.println(service2.getRepositoryInfo());
    }
}
