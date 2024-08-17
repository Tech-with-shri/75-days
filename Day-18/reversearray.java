// Reverse an Array
// Example Input: [1, 2, 3, 4, 5]
// Example Output: [5, 4, 3, 2, 1]
// 
public class reversearray {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5};
        for(int i=arr.length-1; i>=0; i--){
        System.out.print(arr[i]+",");
        }
    }
}
