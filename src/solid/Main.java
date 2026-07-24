package solid;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Izutsumi";
        student.averageGrade = 200.0; // genius

        ReportCardOrchestrator coordinator = new ReportCardOrchestrator();
        coordinator.processStudentReport(student);
    }
}

class ReportCardOrchestrator {
    
    void processStudentReport(Student student) {
        
        // initialize single responsibility classes
        GradeCalculator calculator = new GradeCalculator();
        StudentRepository repository = new StudentRepository();
        NotificationService notifier = new NotificationService();
        ReportFormatter formatter = new ReportFormatter();

        // workflow
        double average = calculator.calculateAverage(student);
        repository.saveToFile(student);
        
        String printedReport = formatter.formatForPrinting(student, average);
        notifier.sendReportCardByEmail(student, printedReport);
    }
}
