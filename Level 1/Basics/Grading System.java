// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Your Marks: ");
        int marks = sc.nextInt();
        System.out.println("You have entered:" + marks);
        
        if(marks>90){
            System.out.println("You have attained distinction");
        }
        else if(marks<=90 && marks>80){
            System.out.println("you have attained one among the highest scores");
            
        }
        else if(marks<=80 && marks>70){
            System.out.println("Your Score is Satisfactory");
        
        }
        else if(marks<=70 && marks >60){
            System.out.println(" Your score meets expectations");
        }
        else if(marks<60){
            System.out.println("Your score is below par");
        }
    }
}
