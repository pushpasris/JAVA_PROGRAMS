import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myInt = scanner.nextInt();
        long num;
        
        for(int i = 1; i <= myInt; i++){
            try{
                num = scanner.nextLong();
                System.out.println(num + " can be fitted in:");
                
                if(num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE){
                    System.out.println("* byte");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                } else if(num >= Short.MIN_VALUE && num <= Short.MAX_VALUE){
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                } else if(num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE){
                    System.out.println("* int");
                    System.out.println("* long");
                } else {
                    System.out.println("* long");
                }
                
            } catch (Exception e){
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }
    }
}
