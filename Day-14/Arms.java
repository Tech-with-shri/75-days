import java.util.Scanner;
class Arms{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter a number");
         int num=sc.nextInt();
         
         if(isarmstrong(num)){
            System.out.println("its armstrong");
         }else{
            System.out.println("is not ");
         }
int sum=0;


public static int countDigit(int num){
    int count=0;
    for(int i=0; i<num; i++){
        count++;
    }
    return count;
}
         public static boolean isarmstrong( int num){
          digit= countDigit(num);
            while(num!=0){
                int rem=num%10;
                 sum+=Math.pow(rem, digit);
                num/=10;
                num++;
            }
            return sum;
         }

    }
}