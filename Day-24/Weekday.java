import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a day");
        String str=sc.next();
        switch (str) {
            case "sunday":System.out.println("its weekend day");
                 break;
                 case "monday":System.out.println("its week day");
                 break;
                 case "tuesday":System.out.println("its week day");
                 break;
                 case "wednesday":System.out.println("its week day");
                 break;
                 case "thursday":System.out.println("its week day");
                 break;
                 case "friday":System.out.println("its week day");
                 break;
                 case "saturday":System.out.println("its weekend day");
                 break;
        
            default:System.out.println("you enter invalid name");
                break;
        }
    }
}
