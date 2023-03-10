import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Amazing Numbers!");
        System.out.println("Supported requests:\n" +
                "- enter a natural number to know its properties;\n" +
                "- enter 0 to exit.");
        while (true) {


            Scanner s = new Scanner(System.in);

            System.out.print("Enter a request: ");
            Integer n = s.nextInt();

            if (n < 0) {
                System.out.println("The first parameter should be a natural number or zero.");
                continue;
            }

            if (n == 0) {
                System.out.print("Goodbye!");
                break;
            }

            boolean c = CheckParity(n);
            boolean b = IsBuzzNumber(n);
            boolean d = isDuckNumber(n);
            boolean p = isPalindromicNumber(n);

            System.out.println("Properties of " + n);
            System.out.println("even: " + c);
            System.out.println("odd: " + !c);
            System.out.println("buzz: " + b);
            System.out.println("duck: " + d);
            System.out.println("palindromic: " + p);
        }

    }

    private static boolean isPalindromicNumber(Integer n) {
        String s = Integer.toString(n);
        StringBuilder stringBuilder = new StringBuilder();
        return s.equals(stringBuilder.append(s).reverse().toString());
    }

    private static boolean isDuckNumber(Integer n) {
        String s = Integer.toString(n);
        return s.indexOf('0') > 0;
    }

    private static boolean CheckParity(Integer n) {
        return n % 2 == 0;
    }

    private static boolean IsBuzzNumber(Integer n) {
        Integer lastDigit = (n % 10);
        Integer remainingDigits = n / 10;

        Integer res = remainingDigits - (lastDigit * 2);

        if (lastDigit == 7 && res % 7 == 0) {
            return true;
        } else if (lastDigit == 7) {
            return true;
        } else return res % 7 == 0;
    }


}