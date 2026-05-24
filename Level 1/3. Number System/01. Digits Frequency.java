import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dig = 0;
        int count = 0;
        int d = 0;

        System.out.println("Enter a number :");

        while (true) {

            int n = sc.nextInt();

            if (n < 0 || n > 1000000000) {
                System.out.println("Enter the number again:");
            }

            else {

                System.out.println("Now Enter the Digit That You would like to check for repititions in the number that was entered previously :");

                int copy = n;

                while (true) {

                    d = sc.nextInt();

                    if (d < 0 || d > 9) {
                        System.out.println("Enter a valid digit");
                    }

                    else {

                        while (copy > 0) {
                            copy = copy / 10;
                            dig++;
                        }

                        break;
                    }
                }

                for (int i = 1; i <= dig; i++) {

                    int numb = n % 10;

                    if (numb == d) {
                        count++;
                    }

                    n = n / 10;
                }

                System.out.println("The Number has the digit:  " + count + "  Times");

                break;
            }
        }
    }
}
