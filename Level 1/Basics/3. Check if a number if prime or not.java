//non optimal solution 

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of times that you would like to enter primes:");

        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {

            int count = 0;

            System.out.println("Alright, now enter in the number to check if or not prime:");

            int n = sc.nextInt();

            for (int j = 1; j <= n; j++) {

                if (n % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println("The number is prime");
            } else {
                System.out.println("The number is not prime");
            }
        }
    }
}
