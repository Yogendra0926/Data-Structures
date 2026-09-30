public class arr2 {
    public static void main(String[] args){
        // int[] arr={9,6,5,7,3,10};
        // Arrays.sort(arr);
        // System.out.println(arr[arr.length-2]);
        int arr[]={3,5,6,1,8};
        int largest=Integer.MIN_VALUE;
        int scLargest=Integer.MIN_VALUE;
        for (int i : arr){
            if(i>largest){
            scLargest=largest;
            largest=i;
            }
            else if(i>scLargest && arr[i]!=largest){
            scLargest=i;
            }
        }
        System.out.println("Largest is "+largest);
        System.out.println("Second Largest is "+scLargest);




    }
}
