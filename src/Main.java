import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a natural number:");
        int n = s.nextInt();

        if (n < 1) {
            System.out.print("This number is not natural!");
            return;
        }

        boolean c = CheckParity(n);
        boolean b = IsBuzzNumber(n);
        boolean d = isDuckNumber(n);

        System.out.println("Properties of " + n);
        System.out.println("even: " + c);
        System.out.println("odd: " + !c);
        System.out.println("buzz: " + b);
        System.out.println("duck: " + d);

    }

    private static boolean isDuckNumber(int n) {
        String s = Integer.toString(n);
        return s.indexOf('0') > 0;
    }

    private static boolean CheckParity(int n) {
        return n % 2 == 0;
    }

    private static boolean IsBuzzNumber(int n) {
        int lastDigit = n % 10;
        int remainingDigits = n / 10;

        int res = remainingDigits - (lastDigit * 2);

        if (lastDigit == 7 && res % 7 == 0) {
            return true;
        } else if (lastDigit == 7) {
            return true;
        } else return res % 7 == 0;
    }


}