import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        int iCj; //where i is the row index and j is the column index and we update this variable constantly in the loop
    
        System.out.println("Enter a Number for the number of rows that you wish to print:");

        while (true) {

            n = sc.nextInt();

            if (n < 1 || n > 10) {

                System.out.println("Enter a valid number");

            } else {

                for (int i = 0; i <n; i++) {
                    
                    int perm = 1 ; //variable that initially denotes the following:   {n! / (0! * (n-0)!)}
                    
                    for (int j = 0; j <= i; j++) {
                      System.out.print(perm+ "\t");
                      iCj= perm*(i-j)/(j+1);
                      perm=iCj;
                       
                    }
                    System.out.println("");
                }

                break;
            }
        }
    }
}
