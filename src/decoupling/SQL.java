package decoupling;

interface Repository {
    void save(String data);
}

class MySQLRepo implements Repository {
    @Override
    public void save(String data) {
        System.out.println("Saving data to MySQL: " + data);
    }
}

class MongoRepo implements Repository {
    @Override
    public void save(String data) {
        System.out.println("Saving data to MongoDB: " + data);
    }
}

class Report {
    private Repository repo;

    public Report (Repository repo) {
        this.repo = repo;

    }

    public void save(String data) {
        repo.save(data);
    }
}

class DamagedReport {
    private MySQLRepo repo;

    public DamagedReport (MySQLRepo repo) {
        this.repo = repo;
    }

    public void save(String data) {
        repo.save(data);
    }
}