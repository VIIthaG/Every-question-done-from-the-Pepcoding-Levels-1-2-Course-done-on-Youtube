// My method
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number of rows that you would like to print, Keep in mind the number of rows can only be odd:");
        while(true){
            int n = sc.nextInt();
            if(n<1 || n>10){
                System.out.println("Enter the number again:");
            }
            else{
                for(int i=1; i <=n; i++){
                    for( int j = 1; j<=n; j++){
                        
                    if(i>n/2){
                        if( i==j || i==n || i==1 || i+j==n+1 || j<i && j+i>n+1)
                        {
                          System.out.print("*\t");
                        }
                        else{
                            System.out.print("\t");
                        }
                    }else{
                        if( i==j || i==n || i==1 || i+j==n+1)
                        {
                          System.out.print("*\t");
                        }
                        else{
                            System.out.print("\t");
                        }
                        
                    }         
                }
                    System.out.println("\t");     
            }
                break;
            
            }    
        }
        
    }
}


//method that is done in the video
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows (only odd numbers between 1 and 10):");

        while (true) {

            int n = sc.nextInt();

            if (n < 1 || n > 10 || n % 2 == 0) {
                System.out.println("Enter the number again:");
            }

            else {

                int st = n;
                int sp = 0;

                for (int i = 1; i <= n; i++) {

                    for (int j = 1; j <= sp; j++) {
                        System.out.print("\t");
                    }

                    for (int j = 1; j <= st; j++) {

                        if (i > 1 && i <= n / 2 && j > 1 && j < st) {
                            System.out.print("\t");
                        }

                        else {
                            System.out.print("*\t");
                        }
                    }

                    if (i <= n / 2) {
                        sp++;
                        st -= 2;
                    }

                    else {
                        sp--;
                        st += 2;
                    }

                    System.out.println();
                }

                break;
            }
        }
    }
}
