import java.util.Scanner;

public class Logic {
    public static void log() {

        String funny = ":-)";
        String upset = ":-(";

        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine(); // text entry

        String str2 = str1; // str1 Receives str2

        int numUpset = 0, numFunny = 0;

        int i = str1.indexOf(funny);// finds the position of a value in the string. It returns the index of the first occurrence of the value, or -1
        
        while (i != -1) { // enters the condition if it is different from -1 and goes through the string until it finds the sad
            numUpset++;
            str2 = str2.substring(i + 3);
            i = str2.indexOf(upset);
        }

        if (numFunny > numUpset)// condition if numfunny is greater than numupset returns Funny
            System.out.println("funny");

        else if (numFunny < numUpset)//condition if numfunny is less than numupset returns upset
            System.out.println("upset");

        else
            System.out.println("neutral"); // if character is not incremented, neutral will be returned
    }
}


