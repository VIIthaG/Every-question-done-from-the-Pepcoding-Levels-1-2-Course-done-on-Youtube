//non optimal solution with time complexity of up to 10^4 x 10^9 inside the second for loop nested within the first one

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




//somewhat optimal solution with time complexity of O(t.{n}^1/2) up to [ 10^4 x {(10^9)^(1/2)} ] inside the second for loop nested within the first one

// reason why its is [ 10^4 x { (10^9)^(1/2) } ] is because we have now changed the code such that the nested loop only checks divisors up until the square root of the inputted number (remember that on trick from the GRE where for checking if a number if prime or no we only check if a number is a divisor of it up until the sq. root of the number itself?), i.e we check only the divisors that are  < (number)^(1/2)

//therefore we can write the logic as: divisor^2 < number, so just change the nested loops logic to: for(int j=1;j*j<=n;j++ ){....}

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

            for (int j = 1; j * j <= n; j++) {

                if (n % j == 0) {
                    count++;
                }
            }
            //we write count ==1 as the condition here since we are starting with one and provided if we find no other divisors, count will be at max 1, furthermore, 1 is not prime so we must exclude it 
            if (count == 1 && n != 1) {
                System.out.println("The number is prime");
            } else {
                System.out.println("The number is not prime");
            }
        }
    }
}





// Most optimal solution to this problem by breaking out of the loop right as we get a divisor

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

            for (int j = 2; j * j <= n; j++) {

                if (n % j == 0) {
                    count++;
                    break;
                }
            }
            
            if (count == 0 && n != 1) {
                System.out.println("The number is prime");
            } else {
                System.out.println("The number is not prime");
            }
        }
    }
}
