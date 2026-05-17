import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        
        int lcm=0;
        int gcd=0;
        

        System.out.println("Enter the numbers for whom you would like to find GCD and LCM:");

        while (true) {
                num1 = sc.nextInt();
                num2 = sc.nextInt();
           
            
            if(num1<=2|| num2<=2 || num1>=1000000000 || num2>=1000000000 ){
                System.out.println("You have entered one, or both of the numbers beyond the allowed range, try again");
            }
            else {
                for(int i=Math.min(num1,num2); i<=num1*num2;i++){
                    if( i%num1==0 && i%num2==0){
                        lcm=i;
                          System.out.println(" The LCM: "+lcm);
                        break;
                    }
                }
                
                 for(int i=1; i<=Math.min(num1,num2);i++){
                      if( num1%i==0 && num2%i==0){
                        gcd=i;
                    }
                 }
                 
                        System.out.println(" The GCD: "+gcd);

                break;

            }

        }
    }

}
