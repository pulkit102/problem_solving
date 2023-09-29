import java.util.*;

public class evennumberofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = { 10, 345, 2, 6, 7896 };
        System.out.println(FindNumbers(nums));

    }

    static int FindNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }

        return count;
    }

    private static boolean even(int num) {
        if (digits(num) % 2 == 0) {
            return true;
        }
        return false;
    }

    static int digits(int nums) {
        int count = 0;
        while (nums > 0) {
            nums = nums / 10;
            count++;
        }
        return count;
    }

}
