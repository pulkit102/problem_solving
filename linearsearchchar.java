
//input given initially
import java.util.*;

public class linearsearchchar {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = "";
            char target = 'u';
            if (str.length() == 0) {
                System.out.println("string is empty");
            }
            for (int i = 1; i < str.length(); i++) {
                if (target == str.charAt(i)) {
                    System.out.println(i);
                }
            }

        }
    }
}

// input will be given by user
import java.util.*;

public class linearsearchchar {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the character you want to search");
            char target = sc.next().charAt(0);
            System.out.println("enter the string");
            String str = sc.next();
            for (int i = 0; i < str.length(); i++) {
                if (target == str.charAt(i)) {
                    System.out.println(i);
                }
                if (str.length() == 0) {
                    System.out.println("string is empty");
                }
            }

        }
    }
}