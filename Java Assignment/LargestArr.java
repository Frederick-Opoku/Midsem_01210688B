
public class LargestArr{

    public static void main(String[] args) {
       int arr[] = new int[] {7,3,9,6,1,5};
       int max= arr[0];

       for(int i=0; i< arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
       }
       System.out.println("Largest Element in the Array: " + max);

    }
}
