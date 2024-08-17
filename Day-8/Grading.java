import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your DBMS marks");
        int dbms=sc.nextInt();
        System.out.println("enter your AI marks");
        int ai=sc.nextInt();
        System.out.println("enter your PYTHON marks");
        int py=sc.nextInt();

        int avg=(dbms+ai+py)/3;
        if(avg<=20){
            System.out.println("grade c");
        }else if(avg>20 && avg<40 ){
            System.out.println("grade B");
        }else{
            System.out.println("grade A");
        }
    }
}
