import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int k;
        int count = 0;
        int rotated = 0;
        int new_number = 0;
        int temp;

        System.out.println("Enter the Number that you would like to rotate:");

        while (true) {

            n = sc.nextInt();

            if (n < 1 || n >= 1000000000) {

                System.out.println("The number you have entered is out of bounds and cannot be zero");

            } else {

                temp = n;

                while (temp > 0) {

                    temp = temp / 10;
                    count++;

                }

                break;

            }

        }

        System.out.println(
            "Enter the number of rotations that you would like , enter a negative number for left-rotation and enter a positive number for right-rotation:"
        );

        while (true) {

            k = sc.nextInt();

            if (n <= -1000000000 || n >= 1000000000) {

                System.out.println("The number you have entered is out of bounds and cannot be zero");

            } else {

                if (k > 0) {

                    temp = n;

                    for (int i = 1; i <= k; i++) {

                        int d = temp % 10;

                        rotated = (int) Math.pow(10, count - 1) * d;

                        int quotient = temp / 10;

                        new_number = rotated + quotient;

                        temp = new_number;

                    }

                    System.out.println(new_number);

                } else if (k < 0) {

                    k = Math.abs(k);

                    temp = n;

                    for (int i = 1; i <= k; i++) {

                        int d = temp / (int) Math.pow(10, count - 1);

                        temp %= (int) Math.pow(10, count - 1);

                        temp *= 10;

                        temp += d;

                    }

                    System.out.println(temp);

                }

                break;

            }

        }

    }

}
