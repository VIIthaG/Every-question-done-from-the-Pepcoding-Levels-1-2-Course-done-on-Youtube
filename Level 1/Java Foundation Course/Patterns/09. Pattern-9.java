import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println(
            "Enter a Number for the number of rows that you wish to print:"
        );

        while (true) {

            n = sc.nextInt();
            int z = n;

            if (n < 1 || n > 100) {

                System.out.println("Enter a valid number");

            } else {

                for (int i = 1; i <= n; i++) {

                    for (int j = 1; j <= n; j++) {

                        if (j == i || i + j == n + 1) {
                            System.out.print("*\t");
                        } else {
                            System.out.print("\t");
                        }
                    }

                    System.out.println("\t");
                }

                break;
            }
        }
    }
}
