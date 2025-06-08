import java.util.Scanner;

public class Analyzer {
    // Function to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Function to check if a number is Armstrong
    static boolean isArmstrong(int num) {
        int sum = 0, temp = num, digits = String.valueOf(num).length();
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == num;
    }

    // Function overloading for swapping numbers
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.printf("Swapped Numbers: %-15s%03d%n", "First:", a);
        System.out.printf("Swapped Numbers: %-15s%03d%n", "Second:", b);
    }

    // Function overloading for swapping strings
    static void swap(String a, String b) {
        String temp = a;
        a = b;
        b = temp;
        System.out.printf("Swapped Strings: %-15s%s%n", "First:", a);
        System.out.printf("Swapped Strings: %-15s%s%n", "Second:", b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number Analysis
        System.out.println("Enter a number to analyze:");
        int num = sc.nextInt();
        System.out.printf("Number: %03d%n", num);
        System.out.println("Prime? " + isPrime(num));
        System.out.println("Armstrong? " + isArmstrong(num));

        // Swapping Numbers
        System.out.println("Enter two numbers to swap:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        swap(num1, num2);

        // Swapping Strings
        System.out.println("Enter two strings to swap:");
        sc.nextLine(); // Clear buffer
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        swap(s1, s2);

        sc.close();
    }
}
