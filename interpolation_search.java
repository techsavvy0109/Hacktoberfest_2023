import java.util.Arrays;
public class Main {
   static final int MAX = 10;
   static int[] list = { 10, 14, 19, 26, 27, 31, 33, 35, 42, 44 };
   
   static int find(int data) {
      int lo = 0;
      int hi = MAX - 1;
      int mid = -1;
      int comparisons = 1;      
      int index = -1;
      while(lo <= hi) {
         System.out.println("\nComparison " + comparisons);
         System.out.println("lo : " + lo + ", list[" + lo + "] = " + list[lo]);
         System.out.println("hi : " + hi + ", list[" + hi + "] = " + list[hi]);
         comparisons++;
         mid = lo + (int)(((double)(hi - lo) / (list[hi] - list[lo])) * (data - list[lo]));
         System.out.println("mid = " + mid);
         if(list[mid] == data) {
            index = mid;
            break;
         } else {
            if(list[mid] < data) {
               lo = mid + 1;
            } else {
               hi = mid - 1;
            }
         }               
      }
      System.out.println("\nTotal comparisons made: " + --comparisons);
      return index;
   }
   public static void main(String[] args) {
      int location = find(33);
      
      if(location != -1)
         System.out.println("\nElement found at location: " + (location+1));
      else
         System.out.println("Element not found.");
   }
}
