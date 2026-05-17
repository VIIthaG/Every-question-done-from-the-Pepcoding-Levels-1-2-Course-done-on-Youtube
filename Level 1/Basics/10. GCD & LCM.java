import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;

        int lcm = 0;
        int gcd = 0;

        System.out.println("Enter the numbers for whom you would like to find GCD and LCM:");

        while (true) {

            num1 = sc.nextInt();
            num2 = sc.nextInt();

            if (num1 < 2 || num2 < 2 || num1 > 1000000000 || num2 > 1000000000) {

                System.out.println("You have entered one, or both of the numbers beyond the allowed range, try again");

            } else {

                for (int i = Math.min(num1, num2); i <= num1 * num2; i++) {

                    if (i % num1 == 0 && i % num2 == 0) {

                        lcm = i;

                        System.out.println(" The LCM: " + lcm);

                        break;
                    }
                }

                for (int i = 1; i <= Math.min(num1, num2); i++) {

                    if (num1 % i == 0 && num2 % i == 0) {

                        gcd = i;
                    }
                }

                System.out.println(" The GCD: " + gcd);

                break;
            }
        }
    }
}


// The method shown in the video
// simply divide the greater of the two numbers by the smaller
// and then make the remainder as the new divisor
// and then make the smaller of the two original numbers
// as the dividend i.e the larger number

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int rem = 0;

        int n1, n2, gcd, lcm;

        System.out.println("Enter the two numbers that you would like to find the LCM and GCD of:");

        while (true) {

            num1 = sc.nextInt();
            num2 = sc.nextInt();

            if (num1 < 2 || num2 < 2 || num1 > 1000000000 || num2 > 1000000000) {

                System.out.println("Enter the numbers within the permitted bounds:");

            } else {

                n1 = num1;
                n2 = num2;

                while (Math.max(n1, n2) % Math.min(n1, n2) != 0) {

                    rem = Math.max(n1, n2) % Math.min(n1, n2);

                    if (n1 < n2) {

                        n2 = n1;
                        n1 = rem;

                    } else {

                        n1 = n2;
                        n2 = rem;
                    }
                }

                gcd = Math.min(n1, n2);

                System.out.println(gcd);

                System.out.println((num1 * num2) / gcd);

                break;
            }
        }
    }
}
