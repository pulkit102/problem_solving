
/*There are some rules set for the Electricity Bill generation in our State. Please check these rules and 
calculate the Electicity bill with the given unit of consumption: 1.Unit consumption upto 200 - Zero charges,
 2. Unit consumption from 201 to 400 - 6 Rs per unit, 3. Unit consumption from 401 to 600 - 7 Rs per unit, 
 4. Unit consumption from 601 & above - 8 Rs per unit. Apart from this a fixed charge of Rs. 220 is charged with every bill.
There is an extra charge of electricity duty @5% for the entire bill. Given the number of units of consumption, calculate the total bill.   */
import java.util.*;

public class billcalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of readings");
        int readings = sc.nextInt();
        int bill;
        int fxdchrg = 220;
        int readingbill = 0;
        if (readings <= 200) {
            bill = (5 * fxdchrg) / 100;
            System.out.println(bill + fxdchrg);
        }
        if (readings > 200 && readings < 400) {
            readingbill = readings * 6;
            bill = 220 + readingbill;
            int tbill = (5 * bill) / 100;
            System.out.println(tbill + bill);
        }
        if (readings > 400 && readings < 600) {
            readingbill = readings * 7;
            bill = 220 + readingbill;
            int tbill = (5 * bill) / 100;
            System.out.println(tbill + bill);
        }
        if (readings > 600) {
            readingbill = readings * 8;
            bill = 220 + readingbill;
            int tbill = (5 * bill) / 100;
            System.out.println(tbill + bill);
        }
    }
}