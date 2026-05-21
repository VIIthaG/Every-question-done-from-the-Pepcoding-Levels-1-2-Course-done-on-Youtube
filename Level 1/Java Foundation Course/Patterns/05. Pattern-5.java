
//My solution

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println(
            "Enter a Number for the number of rows that you wish to print, Note that in this case, it must be odd:"
        );

        while (true) {

            n = sc.nextInt();
            int z = n;

            if (n < 1 || n > 100 || n % 2 == 0) {

                System.out.println("Enter a valid number");

            } else {

                for (int i = 1; i <= n; i += 2) {

                    for (int j = 1; j <= z / 2; j++) {
                        System.out.print("\t");
                    }

                    for (int k = 1; k <= i; k++) {
                        System.out.print("* \t");
                    }

                    System.out.println("");
                    z -= 2;
                }

                for (int i = n - 2; i >= 1; i-=2) {

                    for (int j = 1; j <= n-i-1 ; j++) {
                        System.out.print("\t");
                    }

                    for (int k = 1; k <= i; k++) {
                        System.out.print("* \t");
                    }

                    System.out.println("");
                    n--;
                }

                break;
            }
        }
    }
}
