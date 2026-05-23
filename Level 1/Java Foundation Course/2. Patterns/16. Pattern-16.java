import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(
            "Enter the number of rows that you would like to print:"
        );

        while (true) {

            int n = sc.nextInt();
            int sp = (2 * n) - 3;

            if (n < 1 || n > 10) {

                System.out.println("Enter the Number again:");

            } else {

                for (int i = 1; i <= n; i++) {

                    for (int j = 1; j <= i; j++) {

                        System.out.print(j + "\t");

                    }

                    for (int k = 1; k <= sp; k++) {

                        System.out.print("\t");

                    }

                    for (int l = i; l >= 1; l--) {

                        if (l == n) {
                            l--;
                        }

                        System.out.print(l + "\t");

                    }

                    sp -= 2;

                    System.out.println("");

                }

                break;

            }
        }
    }
}
