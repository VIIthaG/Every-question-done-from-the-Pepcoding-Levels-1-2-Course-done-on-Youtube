import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Enter the number: ");

        while (true) {

            n = sc.nextInt();

            if (n < 2 || n >= 1000000000) {
                System.out.println("Enter the number again");
            } else {
                break;
            }

        }

        // just put the limit of the loop counter as the root of the number
        // since it reduces the time complexity

        for (int i = 2; i * i <= n; i++) {

            while (n % i == 0) {

                n = n / i;

                System.out.println(i);

            }

        }

        // whatever is the value of n after the loop is over
        // is the final quotient so just print this out as it is.

        // The condition here is such that if n has not reached 1
        // (that is if the divisor 'i' has reached its limit i.e root 'n'
        // and cannot further be used to cleanly divide n such that it reaches 1)
        // just print whatever the value of n is because that is the final quotient
        // and the only thing that will divide it is its own self

        if (n != 1) {

            System.out.println(n);

        }

    }

}
