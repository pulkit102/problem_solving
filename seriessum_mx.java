
//1- x + x2/2! - x3/3! + x4/4!......
import java.util.*;

public class seriessum_mx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x and y");
        double x = sc.nextInt();
        double n = sc.nextInt();
        double flag = 1;
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            flag = flag * i;
            double trm = Math.pow(x, i);
            double sistam = trm / flag;
            if (i % 2 != 0) {
                x = -x;
            }
            sum += sistam;
        }
        System.out.println(sum - 1 + " ");

    }
}