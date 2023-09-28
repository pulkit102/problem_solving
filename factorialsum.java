
// Find the sum of first n terms of the following series: 1! + 2! + 3! + 4!...................
import java.util.*;

public class factorialsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int fact = 1;
        int sum = 0;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
            sum = sum + fact;
        }
        System.out.println(sum);
    }
}