import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows (only odd numbers between 1 and 10):");

        while (true) {

            int n = sc.nextInt();

            if (n < 1 || n > 10 || n % 2 == 0) {
                System.out.println("Enter the number again:");
            }

            else {

                for (int i = 1; i <= n; i++) {

                    for (int j = 1; j <= n; j++) {

                        if (i == n / 2 + 1 ||
                            j == n / 2 + 1 ||
                            i == 1 && j < n / 2 + 1 ||
                            i == n && j > n / 2 + 1 ||
                            j==1 && i>n/2 + 1 ||
                            j==n && i< n/2 + 1) {

                            System.out.print("*\t");
                        }

                        else {
                            System.out.print("\t");
                        }
                    }

                    System.out.println("");
                }

                break;
            }
        }
    }
}
