import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        int sp;
        int st = 1;

        System.out.println(
            "Enter a Number for the number of rows that you wish to print, Note that in this case, it must be odd:"
        );

        while (true) {

            n = sc.nextInt();

            if (n < 1 || n > 100) {

                System.out.println("Enter a valid number");

            } else {

                sp = n / 2;

                for (int i = 1; i <= n; i++) {

                    for (int j = 1; j <= sp; j++) {
                        System.out.print("\t");
                    }

                    for (int k = 1; k <= st; k++) {

                        if (k == 1 || k == st) {
                            System.out.print("*\t");
                        } else {
                            System.out.print("\t");
                        }
                    }

                    if (i <= n / 2) {
                        st += 2;
                        sp--;
                    } else {
                        sp++;
                        st -= 2;
                    }

                    System.out.println("\t");
                }

                break;
            }
        }
    }
}
