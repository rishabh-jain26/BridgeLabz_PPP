import java.util.*;

public class Program9_Calendar {
    static String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    static int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

    public static boolean isLeap(int y) {
        return (y%400==0)||(y%4==0 && y%100!=0);
    }

    public static int getFirstDay(int y, int m) {
        int d = 1;
        int y0 = y - (14 - m)/12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m)/12) - 2;
        return (d + x + (31*m0)/12) % 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();
        System.out.print("Enter year: ");
        int y = sc.nextInt();

        int daysInMonth = days[m-1];
        if (m==2 && isLeap(y)) daysInMonth=29;
        int startDay = getFirstDay(y, m);

        System.out.println("   " + months[m-1] + " " + y);
        System.out.println("Su Mo Tu We Th Fr Sa");

        for (int i=0; i<startDay; i++) System.out.print("   ");
        for (int d=1; d<=daysInMonth; d++) {
            System.out.printf("%2d ", d);
            if (((d+startDay)%7==0) || d==daysInMonth) System.out.println();
        }
    }
}