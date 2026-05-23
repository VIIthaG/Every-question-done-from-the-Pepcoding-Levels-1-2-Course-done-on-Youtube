import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(
            "Enter the number of rows that you would like to print, note however that they must be odd:"
        );

        while (true) {

            int n = sc.nextInt();
            int sp = n / 2;
            int st = 1;

            if (n < 1 || n > 10 || n % 2 == 0) {

                System.out.println("Enter the Number again:");

            } else {

                for (int i = 1; i <= n; i++) {

                    int col = n;

                    for (int j = 1; j <= sp; j++) {

                        if (i == n / 2 + 1) {

                            System.out.print("*\t");

                        } else {

                            System.out.print("\t");

                        }
                    }

                    for (int k = 1; k <= st; k++) {

                        System.out.print("*\t");
                    }

                    if (i <= n / 2) {

                        st++;

                    } else {

                        st--;
                    }

                    System.out.println("");
                }

                break;
            }
        }
    }
}
