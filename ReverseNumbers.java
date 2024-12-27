

import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers you want to reverse: ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];
        int[] reversedNumbers = new int[count];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
            reversedNumbers[i] = reverseNumber(numbers[i]);
        }

        System.out.println("Reversed numbers:");
        for (int i = 0; i < count; i++) {
            System.out.println(reversedNumbers[i]);
        }

        scanner.close();
    }

    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
}


