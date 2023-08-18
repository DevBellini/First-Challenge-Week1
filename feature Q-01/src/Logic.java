import java.util.Scanner;
import java.util.Arrays;

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

            for (int i = 0; i < n; i++) { // loop of repetition where all the names and amount of problems will be stored
                students[i][0] = sc.next();
                grades[i][0] = sc.nextInt();

                if (students[i][0].length() > 20) { // checks the condition if the student has less than 20 characters in the name
                    System.out.println("the student's name has passed 20 characters allowed!");
                    return;
                }

            }

            int x = Integer.MAX_VALUE;
            String studentF = "";
            for (int j = 0; j < n; j++) { // loop that checks the amount of problems, saves the maximum value of problems
                int prob = grades[j][0];
                if (prob > 10) { // condição caso passe 10 problemas
                    System.out.println("Number of problems exceeded the limit of 10");
                    return;

                }

                if (prob < x) { // condition that will return the student with less amount of problems
                    x = prob;
                    studentF = students[j][0];
                    Arrays.sort(studentF.toCharArray());

                }

            }
            System.out.println("Instantiates: " + k); // impression of the instance plus the sum of it cajo continue
            System.out.println(studentF);
            k++;
        }


    }
}