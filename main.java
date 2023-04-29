
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      boolean[] chptList = new boolean[16]; // Valid chapters are 1-15. 1 means include, 0 exclude. Element 0 unused. 
      int includeChpt;
      int i, j;
      
      // Get the chapter selections
      for (i = 1; i <= 15; ++i) {
         includeChpt = scnr.nextInt(); 
         if (includeChpt==1) {
            chptList[i] = true;
         }
         else {
            chptList[i] = false;
         }
      }
      
      boolean anySelected = false; 
  
  
  for (i = 1; i <= 15; ++i) {
     if (chptList[i]) {
        anySelected = true;
        
        
        if (i <= 13 && chptList[i+1] && chptList[i+2]) {
           System.out.print(i + "-");
           
           
           j = i+2;
           while (j < 15 && chptList[j+1]) {
              ++j;
           }
           
           System.out.print(j + " ");
           
           
           i = j;
        }
        else {
           System.out.print(i + " ");
        }
     }
  }
  
  if (!anySelected) {
     System.out.print("None ");
  }
  
  System.out.println();
   }
}
