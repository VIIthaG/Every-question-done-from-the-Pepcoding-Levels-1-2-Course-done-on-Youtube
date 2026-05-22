import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        int col;

        System.out.println(
            "Enter a Number for the number of rows that you wish to print:"
        );

        while (true) {

            n = sc.nextInt();
            int count=1;

            int sp = n / 2;
            int st = 1;

            if (n < 1 || n > 10 || n % 2 == 0) {

                System.out.println("Enter a valid number");

            } else {

                for (int i = 1; i <= n; i++) {
                    col=count;
                    for (int j = 1; j <= sp; j++) {
                        System.out.print(" \t");
                    }

                    for (int k = 1; k <= st; k++) {
                        
                                    System.out.print(col+"\t");

                        if(k<=st/2){
                            col++;
                        }else{             
                            col--;
                            }
                            
                    }
                    
                    System.out.println(" ");

                    if (i <= n/2) {
                        sp--;
                        st += 2;
                        count++;
                    } else {
                        st -= 2;
                        sp++;
                        count--;

                    }
                }

                break;
            }
        }
    }
}
