//non optimal solution 

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of times that you would like to enter primes:");

        int n;
        int t;

        while (true) {

            t = sc.nextInt();

            // t cant be greater than 10^4
            if (t < 1 || t > 10000) {

                System.out.println("The value you have entered exceeds all bounds, please enter the value again:");

            } else {

                break;
            }
        }

        for (int i = 1; i <= t; i++) {

            int count = 0;

            System.out.println("Alright, now enter in the number to check if or not prime:");

            while (true) {

                n = sc.nextInt();

                // n cant be greater then 10^9
                if (n < 1 || n > 1000000000) {

                    System.out.println("The value you have entered exceeds all bounds, please enter the value again:");

                } else {

                    break;
                }
            }

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

