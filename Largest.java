import java.util.*;
public class Largest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max=0;
        do{
            int d=n%10;
            if(d>max){
              max=d;
            }
             n=n/10;
        }while(n!=0);
        System.out.println("max no is  :"+max);
    
        
    
        
        

       
        
    }
}
