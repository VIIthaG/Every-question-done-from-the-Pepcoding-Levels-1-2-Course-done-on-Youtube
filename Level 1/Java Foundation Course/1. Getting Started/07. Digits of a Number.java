import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1;
        int dig ;
        int temp;
        int count = 0;
        int div= 0;

        while (true) {

            System.out.println("Enter the Number ");

            n1 = sc.nextInt();

            if (n1 < 1 || n1 >= 1000000000) {

                System.out.println("You have entered a value out of bounds, Please enter a valid number");

            } else {

                break;

            }

        }
        temp=n1;

        while (temp > 0) {

            temp = temp / 10;

            count++;

        }

        div = (int)Math.pow(10,count-1);
        
        //we changed the logic from n1>0 to div>0 to handle the edge case where numbers like 1000, 2000, etc dont get printed out 
        while(div>0){
            dig=n1/div;
            n1=n1%div;
            div=div/10;
            System.out.println(dig);
            
            
            
        }
        

        

    }

}
