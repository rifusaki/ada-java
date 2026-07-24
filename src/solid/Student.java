package solid;

// student is only a data holder
class Student {
    String name;
    double averageGrade;
}

// this class should have a bunch of calculators
// we just put a single method here for simplicity
class GradeCalculator {
    double calculateAverage(Student student) { 
        // ... something something
        return 0.0; 
    }
}

// data persistence
class StudentRepository {
    void saveToFile(Student student) { 
        // ... we're using a single .txt for the entire school
        // we want to see the world burn
    }
}

// notifications (anything about sending the info)
class NotificationService {
    void sendReportCardByEmail(Student student, String formattedReport) { 
        // ... we could also use pigeons
    }
}

// handles formatting
class ReportFormatter {
    String formatForPrinting(Student student, double average) { 
        // ... i ran out of ink for this one
        return ""; 
    }
}
