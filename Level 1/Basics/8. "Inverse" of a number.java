import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int total;
        int sum;
        int count;
        int index = 1;
        int new_number = 0;

        System.out.println(
            "Enter a number such that each digit it has is comprised of every number from 1 to the digit that represents the length of the number itself "
        );

        while (true) {

            count = 0;
            sum = 0;
            total = 0;

            n = sc.nextInt();

            int temp = n;

            while (temp > 0) {

                int d = temp % 10;
                total = total + d;
                temp = temp / 10;
                count++;

            }

            for (int i = 1; i <= count; i++) {

                sum = sum + i;

            }

            if (n < 1 || n >= 100000000) {

                System.out.println(
                    "You have entered a value that is beyond the bounds of what is accepted, please enter in another value"
                );

            }
            else if (total != sum) {

                System.out.println(
                    "The criteria has not been met so please re-enter another value"
                );

            }
            else {

                break;

            }
        }

        for (int i = 1; i <= count; i++) {

            int d = n % 10;
            int digit_with_new_index = (int)(Math.pow(10, d - 1) * index);

            new_number = new_number + digit_with_new_index;

            n = n / 10;
            index++;

        }

        System.out.println(
            "here is the number you have given as input but the index of each digit and the corresponding value of each digit have been interchanged:" + new_number
        );

    }
}
