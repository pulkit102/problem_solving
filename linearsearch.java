
import java.util.*;

public class linearsearch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the element you want to search");
            int target = sc.nextInt();
            int arr[] = new int[10];
            System.out.print("enter the array");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == target) {
                    System.out.println(arr[i] + " is on the " + i + "th place");
                }
                if (arr.length == 0) {
                    System.out.println("empty array");
                }
            }
        }
    }
}