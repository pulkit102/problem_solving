
/*Given a positive integer n and the task is to find the sum of series
1*2*3 + 2*3*4 +3*4*5+ 4*5*6 + . …... .+ n*(n+1)*(n+2).*/
import java.util.*;

public class sumofseries {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the value of n");
            int n = sc.nextInt();
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                int term = i * (i + 1) * (i + 2);
                sum += term;
            }
            System.out.println(sum);
        }
    }
}