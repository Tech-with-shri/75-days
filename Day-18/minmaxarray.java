// find the Maximum and Minimum Element in an Array
// Example Input: [3, 1, 7, 5, 2]
// Example Output: Max = 7, Min = 1


class Minmax{
    public static void main(String[] args) {
        int min;
        int max;
        int arr[]=new int[]{3,1,7,5,2};
        max=min=arr[0];
        for(int i=0; i<arr.length; i++){

           
        if(max>arr[i]){
            max=arr[i];
        }else if(min<arr[i]){
            min=arr[i];
        }
        }
        System.out.println(max);
        System.out.println(min);
    }
}