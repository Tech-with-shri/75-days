import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);  

        int ans=0;

        while(true){
            System.out.println("enter the operator");
            char opp=sc.next().trim().charAt(0);
    
            if(opp=='+'|| opp=='_' || opp=='*'||opp=='/' || opp=='%'){
           System.out.println("enter two numbers"); 
            int num1=sc.nextInt();
            int num2=sc.nextInt(); 

            if (opp=='+'){
              ans=  num1+num2;
            }
           if(opp=='_'){
            ans= num1-num2;
           }
           if(opp=='*'){
           ans= num1*num2;
           }
           if(opp=='/'){
           ans= num1/num2;
           }
           if(opp=='%'){
           ans= num1%num2;
           }
        }else if(opp=='x' || opp=='X'){
            break;
           }else{
            System.out.println("invalid number");
           }
           
        }
    
      {  System.out.println("ans is:"+ ans);}
    
    }
    
}

