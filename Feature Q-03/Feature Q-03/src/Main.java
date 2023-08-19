import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = null;

        while (sc.hasNextLine()) { // repeating loop that receives the string, saves to list, and checks another line of text
            s = sc.nextLine(); //string input
            List<Integer> list = ListIn(s); //create list
            Integer sum = list.stream().reduce(0, Integer::sum); // Used to sum items in the list
            System.out.println(": " + sum);

        }
    }

    public static List<Integer> ListIn(String s) {
        List<Integer> list = new ArrayList<>();
        String[] v = s.split("\\+"); // split into substrings whenever it encounters the + and are stored in the array

        String x = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                x += s.charAt(i); //Returns string character
            } else if (s.charAt(i) == '-') { // negative condition
                list.add(Integer.valueOf(x)); // is added to sign -
                x = "-";
            } else {
                list.add(Integer.valueOf(x));// stores number
                x = "";
            }
        }
        list.add(Integer.valueOf(x));
        return list; // Returns the values to list for the calculation
    }
}


