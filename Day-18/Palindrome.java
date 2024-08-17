// Check if an Array is Palindrome
// Example Input: [1, 2, 3, 2, 1]
// Example Output: true
// 

public class Palindrome {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,3,2,1};
        boolean isPalindrome=true;
        for(int i=0; i<arr.length/2; i++){
            if(arr[i]!=arr[arr.length-1-i]){
                isPalindrome=false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}
