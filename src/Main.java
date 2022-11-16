import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = scanner.nextInt();
        boolean prime = primeOrNot(num1);
        System.out.println(prime);
        //System.out.println(primeOrNot(num1));

    }

    public static boolean primeOrNot(int num1) {
        boolean prime = true;
        for (int i = 2; i < num1; i++) {
            if (num1 % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;

    }
}