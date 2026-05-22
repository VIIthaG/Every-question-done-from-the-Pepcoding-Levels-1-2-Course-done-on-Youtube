import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        int k=1;
        
        System.out.println("Enter a Number for the number of rows that you wish to print:");

        while (true) {

            n = sc.nextInt();

            if (n < 1 || n > 44) {

                System.out.println("Enter a valid number");

            } else {

                for (int i = 1; i <=n; i++) {

                    for (int j = 1; j <= i; j++) {
                        System.out.print(k + "\t");
                        k++;
                    }
                    System.out.println("");
                }

                break;
            }
        }
    }
}
