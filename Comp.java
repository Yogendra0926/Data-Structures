public class Comp {
    public static void main(String[] args){
        int count=0;
        for(int n=1;n<100;n++){
            for(int j=1;j<n-1;j++){
                 if(n%j==0){
                    count++;
                 }
            }
            if(count>2){
                System.out.println(j);
            }
        }
    

    }
}
