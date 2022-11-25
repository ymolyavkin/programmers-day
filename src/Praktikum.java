import java.util.Scanner;
public class Praktikum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println( "12.09." + year);
        }
        else {
            System.out.println( "13.09." + year);
        }
    }
    /**
     * Checks if given <code>year</code> is a leap lear.
     *
     * @param year any year number
     * @return <code>true</code> when <code>year</code> it is a leap year, <code>false</code> otherwise
     *
     * год, номер которого кратен 400 — високосный;
     * остальные годы, номер которых кратен 100,- не високосные (например, годы 1700, 1800, 1900, 2100, 2200, 2300);
     * стальные годы, номер которых кратен 4,-  високосные.
     */
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        else if (year % 100 == 0) return false;
        else if (year % 4 == 0) return true;
        return false;
    }


}