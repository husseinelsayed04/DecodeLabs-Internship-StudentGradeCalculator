import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Enter Student Name: ");
        student.setName(input.nextLine());

        System.out.print("Enter Number Of Subjects: ");
        int num = input.nextInt();

        int[] marks = new int[num];

        for (int i = 0; i < num; i++) {

            do {
                System.out.print("Enter mark for subject " + (i + 1) + " (0-100): ");
                marks[i] = input.nextInt();

                if (marks[i] < 0 || marks[i] > 100) {
                    System.out.println("Invalid Input! Enter mark between 0 and 100");
                }

            } while (marks[i] < 0 || marks[i] > 100);
        }

        student.setMarks(marks);

        GradeCalculator gc = new GradeCalculator();

        int total = gc.calculateTotal(student);
        double average = gc.calculateAverage(student);
        String grade = gc.calculateGrade(average);
        String status = gc.getStatus(average);

        System.out.println("\n===== RESULT =====");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Number of Subjects: " + num);
        System.out.println("Total Marks: " + total);
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade: " + grade);
        System.out.println("Status: " + status);

    }
}