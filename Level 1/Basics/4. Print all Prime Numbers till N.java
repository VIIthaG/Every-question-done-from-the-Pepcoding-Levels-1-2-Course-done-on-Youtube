import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1;
        int n2;

        System.out.println("You are required to enter 2 numbers, the smaller being the lower bound and the larger being the upper bound, between these 2 numbers (inclusive), every prime number will be checked and printed out");

        while (true) {

            System.out.println("Enter the  Lower bound");

            n1 = sc.nextInt();

            // upper limit is 10^6
            if (n1 <= 1 || n1 > 1000000) {

                System.out.println("You have entered a value that is beyond the limit");

            } else {

                break;
            }

        }

        while (true) {

            System.out.println("Enter the  Upper bound");

            n2 = sc.nextInt();

            // upper limit is 10^6
            if (n2 <= 1 || n2 > 1000000) {

                System.out.println("You have entered a value that is beyond the limit");

            } else {

                break;
            }

        }
       //nest 2 loops and break off in the nested one if divisor is found
        for (int i = n1; i <= n2; i++) {

            int count = 0;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {

                    count++;

                    break;

                }

            }
          //if divisor exists then its non prime other wise it is prime since we stop at root n and start at 2 when checking for divisors
            if (count == 1) {

                System.out.println("Non prime:" + i);

            } else {

                System.out.println("    prime:" + i);

            }

        }

    }

}
