
// Write a program to find the sum of the series . a) 1!/1+2!/2+3!/3+4!/4+5!/5
import java.util.*;

public class seriessum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        int sum = 0;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
            int sis = fact / i;
            sum += sis;
        }
        System.out.println(sum);
    }
}