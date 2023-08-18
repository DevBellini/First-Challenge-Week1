import java.util.Scanner;

public class Logic {
    public static void log() {
        Scanner sc = new Scanner(System.in);

        int k = 1;

        while (true) {
            System.out.println("Enter number of students: ");
            int n = sc.nextInt(); //'n' students input

            if (n < 1 || n > 100) { // condition from 1 to 100 students
                System.out.println("Number of students must be between 1 to 100 students!");
                return;

            }
            String[][] students = new String[n][1]; // Creating an array with n rows and 1 column to save the student's name
            int[][] grades = new int[n][1]; // creation of array with n rows and 1 column to save in one of problems

        }
    }
}


