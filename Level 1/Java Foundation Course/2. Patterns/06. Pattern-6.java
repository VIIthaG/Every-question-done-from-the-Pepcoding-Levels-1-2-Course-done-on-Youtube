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

                int st = (n / 2)+1;
                int sp = 1;

                for (int i = 1; i <= n; i++) {

                    for (int j = 1; j <= st; j++) {
                        System.out.print(" *\t");
                    }

                    for (int k = 1; k <= sp; k++) {
                        System.out.print(" \t");
                    }
                     for (int j = 1; j <= st; j++) {
                        System.out.print(" *\t");
                    }

                    if (i <= n / 2) {

                        st--;
                        sp += 2;

                    } else {

                        st++;
                        sp -= 2;
                    }

                    System.out.println(" ");
                }

                break;
            }
        }
    }
}
