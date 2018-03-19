package insertionsort;
import java.util.Arrays;
public class InsertionSort 
{
       public static int[] sort ( int[] numbers)
       {
           int i = 0;
           for (i=1; i<numbers.length;i++)
           {
               int index = numbers[i]; int j=i;
               while( j>0 && numbers[j-1] > index)
               {
                   numbers[j] = numbers[j-1];
                   j--;
               }
               numbers[j] = index;
           }
           return numbers;
       }
	//You might need a swap function also.
   public static void main(String args[]) 
   {
       int[] randomNumbers = {13, 3242, 23, 2351, 352, 3915, 123, 32, 1, 5, 0};
       int[] sortedNumbers;
       sortedNumbers = sort(randomNumbers);
       System.out.println(Arrays.toString(sortedNumbers));
    }
}