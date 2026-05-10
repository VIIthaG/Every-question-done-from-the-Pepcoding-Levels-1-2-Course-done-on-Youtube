
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        int count=0;
        while(true){
        System.out.println("Enter the Number ");
         n1=sc.nextInt();
        if(n1<1 || n1>=1000000000){
            System.out.println("You have entered a value out of bounds, Please enter a valid number");
        }
        else{
            break;
        }
            
        }
        
        while(n1 >0){
            
            n1=n1/10;
            count++;
        }
        System.out.println("The Number digits of the number are : "+ count);
        
    }
}
