
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,temp,c;
        
    while(true){
        
        while (true) {

            System.out.println("Enter the  first of the 3 numbers that you wish to check make up a pythagorean triplet or no");

            a = sc.nextInt();
         
            // upper limit is 10^9
            if (a < 1 || a > 1000000000) {

                System.out.println("You have entered a value that is beyond the limit for one of the values, re-enter them:");

            } else {
                

                break;
            }

        }


         while (true) {

            System.out.println("Enter the  second of the 3 numbers that you wish to check make up a pythagorean triplet or no");

            b = sc.nextInt();
         
            // upper limit is 10^9
            if (  b < 1 || b > 1000000000 ) {

                System.out.println("You have entered a value that is beyond the limit for one of the values, re-enter them:");

            } else {
                if(a>b){
                    temp=a;
                    a=b;
                    b=temp;
                }
                
                break;
            }

        }
        
        
        
         while (true) {

            System.out.println("Enter the  third of the 3 numbers that you wish to check make up a pythagorean triplet or no");

            c = sc.nextInt();
         
            // upper limit is 10^9
            if ( c <1 || c >1000000000) {

                System.out.println("You have entered a value that is beyond the limit for one of the values, re-enter them:");

            } else {
                 if(b>c){
                    temp=b;
                    b=c;
                    c=temp;
                }
                break;
            }

        }
        
        int lhs= (int)Math.pow(a,2) + (int)Math.pow(b,2);
        int rhs = (int)Math.pow(c,2);
        
      
            
        if(lhs!=rhs){
            System.out.println("The Numbers do not form a  Pythagorean triplet");
        }
        else{
            System.out.println("The Numbers do indeed form a  Pythagorean triplet");
            break;
            
        }
            
        }

       

    }
}
