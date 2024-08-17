import java.util.Scanner;

class PalindString{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any String");
        String str=sc.next();
       
        String rev="";
        for(int i=str.length()-1; i>=0; i--){
            rev=rev+str.charAt(i);
        }  
        if(str==rev){
            System.out.println("is palindrome");
        }else{
            System.out.println("is not palindrome");
        }
      }
}