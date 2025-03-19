
import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*****STUDENT GRADE CALCULATOR*****");
        
        
        System.out.print("Enter the number of subjects: ");
        int subjects = scanner.nextInt();
        
        int totalMarks = 0;
    
        
        // Taking input for marks in each subject
        System.out.println("Enter marks for each subject(out of 100)");
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = scanner.nextInt();
            totalMarks=totalMarks+ marks;
        }
        
        // Calculating average percentage
        double percentage = (double) totalMarks / subjects;
        
        // Determining the grade
        String d;
        char grade;
        if (percentage >= 90) {
            grade = 'A';  
            d="Excellent Keep it up!" ;
        } else if (percentage >= 80) {
            grade = 'B';
            d="Very Good, better luck next time..";
        } else if (percentage >= 70) {
            grade = 'C';
            d="Good,work for bigger results...";
        } else if (percentage >= 60) {
            grade = 'D';
            d="Satisfactory Result,work hard...";
        } else if (percentage >= 50) {
            grade = 'E';
            d="Need hardwork to improve your results";
        } else {
            grade = 'F';
            d="Fail";
        }
        
        // Displaying results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Result:"+d);
        
        scanner.close();
    }
}
