public class Strreverse {
    public static void main(String[] args) {
        String str="shrishti";
        String reverse="";

        for(int i=str.length()-1; i>=0; i--){
            reverse+=str.charAt(i);
            
        }
        System.out.print(reverse);
    }
}
