import java.util.*;
public class Reverse{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int original=n;
        int rev=0;
        while(n!=0){
            rev=(rev*10)+n%10;
            n/=10;
        }
        System.out.println("Reverse no is "+rev);
        if(original==rev){
            System.out.println("pallindrome");
        }
        else{
            System.out.println("Not a pallindrome");
        }
       sc.close();
    }
    
}
