import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number of rows that you would like to print, Keep in mind the number of rows can only be odd:");
        while(true){
            int n = sc.nextInt();
            if(n<1 || n>10 || n%2==0){
                System.out.println("Enter the number again:");
            }
            else{
                for(int i=1; i <=n; i++){
                    for( int j = 1; j<=n; j++){
                        
                    
                    
                        if( i==j && i>=n/2+1  || i+j==n+1 &&i>=n/2+1  || j==1 || j==n )
                        {
                          System.out.print("*\t");
                        }
                        else{
                            System.out.print("\t");
                        }
                        
                          
                }
                    System.out.println("\t");     
            }
                break;
            
            }    
        }
        
    }
}




