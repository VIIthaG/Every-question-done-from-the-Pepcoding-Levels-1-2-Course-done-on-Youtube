import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Enter the Number of Bulbs:");

        while (true) {

            n = sc.nextInt();

            if (n < 2 || n >= 1000000000) {
                System.out.println("Enter the value within the given bounds:");
            } else {
                break;
            }
        }

        System.out.println(
            "The Bulbs that will be left on after the voltage fluctuations are as follows:"
        );

        for (int i = 1; i * i <= n; i++) {
            System.out.println("No." + i * i);
        }
    }
}