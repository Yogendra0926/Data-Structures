import java.util.*;
public class EvenOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even_count=0;
        int odd_count=0;
        do{
            int d=n%10;
            if(d%2==0){
              even_count++;
            }
            else{
                odd_count++;
            }
             n=n/10;
        }while(n!=0);
        System.out.println("No of even are :"+even_count);
        System.out.println("No of odd are :"+odd_count);
        
    
        
        

       
        
    }
}
