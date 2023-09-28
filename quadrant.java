
// Write a C program to accept a coordinate point in a XY coordinate system and determine in which quadrant the coordinate point lies. 
import java.util.*;

public class quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x & y");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("first quadrant");
        }
        if (x < 0 && y > 0) {
            System.out.println("second quad");
        }
        if (x < 0 && y < 0) {
            System.out.println("third quad");
        }
        if (x > 0 && y < 0) {
            System.out.println("forth quadrant");
        }
    }
}