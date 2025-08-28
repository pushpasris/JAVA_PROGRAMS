import java.util.Scanner;

public class ReverseArray {
   public ReverseArray() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter array size: ");
      int var2 = var1.nextInt();
      int[] var3 = new int[var2];
      System.out.println("Enter " + var2 + " elements:");

      int var4;
      for(var4 = 0; var4 < var2; ++var4) {
         var3[var4] = var1.nextInt();
      }

      var4 = 0;

      int var6;
      for(int var5 = var2 - 1; var4 < var5; --var5) {
         var6 = var3[var4];
         var3[var4] = var3[var5];
         var3[var5] = var6;
         ++var4;
      }

      System.out.println("Reversed array:");

      for(var6 = 0; var6 < var2; ++var6) {
         System.out.println(var3[var6] + " ");
      }

   }
}
