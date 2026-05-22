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

            if (n < 1 || n > 100 ) {

                System.out.println("Enter a valid number");

            } else {

                for (int i = n; i >=1; i--) {

                    for (int j = 1; j < i; j++) {
                        System.out.print("\t");
                    }

                    System.out.println("*\t");
                }

                break;
            }
        }
    }
}
