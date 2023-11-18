import java.util.Scanner;

public class MarksCalculator {

    public static char calculateGrade(double percentage) {
        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) 
        {
            grade = 'B';
        } else if (percentage >= 70) 
        {
            grade = 'C';
        } else if (percentage >= 60) 
        {
            grade = 'D';
        } else if (percentage >= 50) 
        {
            grade = 'E';
        } else {
            grade = 'F';
        }

        return grade;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many subjects do you have?");
        int numberOfSubjects = scanner.nextInt();

        int[] marks = new int[numberOfSubjects];

        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.println("Enter the marks obtained in subject " + (i + 1) + " (out of 100):");
            marks[i] = scanner.nextInt();
        }

        scanner.close();

        int totalMarks = 0;
        for (int mark : marks) 
        {
            totalMarks += mark;
        }

        double averagePercentage = (double) totalMarks / numberOfSubjects;
        char grade = calculateGrade(averagePercentage);

        System.out.println("The total marks are: " + totalMarks);
        System.out.println("The average percentage is: " + averagePercentage);
        System.out.println("The corresponding grade is: " + grade);
    }
}
