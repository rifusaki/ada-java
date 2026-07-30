package decoupling;

public class Main {
    public static void main(String[] args) {
        
        Repository mySQLRepo = new MySQLRepo();
        Repository mongoRepo = new MongoRepo();

        Report report = new Report(mySQLRepo);
        Report report2 = new Report(mongoRepo);

        report.save("Data 1");
        report2.save("Data 2");

        DamagedReport damagedReport = new DamagedReport(mongoRepo);
    }
}