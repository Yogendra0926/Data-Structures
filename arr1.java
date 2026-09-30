import java.util.*;
public class arr1 {
    public static void main(String[] agrs){
        int n=5;
        int[]arr=new int[n];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("[");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        System.out.println("]");
        int min=arr[0];
    int max=0;
    for(int i : arr){
        if (i>max){
            max=i;
        }
        if(i<min){
            min=i;
        }
    }
    
    System.out.println("Minimun element is : "+min);
    System.out.println("Maximum element is : "+max);
    //can also be done by 
    //arrays.sort()
    //Arrays.sort(arr);
    //print(arr[0]);
    //print(arr[n-1]);
    }
}

