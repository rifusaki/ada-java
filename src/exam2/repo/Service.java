package exam2.repo;

public class Service {
    private Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public String getRepositoryInfo() {
        return this.repository.getInfo();
    }
}
