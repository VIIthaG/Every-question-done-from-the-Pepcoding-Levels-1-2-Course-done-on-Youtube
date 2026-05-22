import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        
    
        System.out.println("Enter a Number that you wish for its first 10 multiples to be printed:");

        while (true) {

            n = sc.nextInt();

            if (n < 1 || n > 10) {

                System.out.println("Enter a valid number");

            } else {

                for (int i = 1; i <=10; i++) {
                    int prod = n*i;
                   System.out.println(n + "*" + i + "=" + prod);
                       
                    }
                

                break;
            }
        }
    }
}
