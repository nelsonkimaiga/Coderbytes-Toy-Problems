import java.util.Arrays;

public class ArraySort
{
  public static void main(String[] args)
  {
    // create a Java array
    String[] fruits = {"banana", "orange", "kiwi", "apple"};
    
    // sort the array, using the sort method
    Arrays.sort(fruits);
    
    // print the sorted results
    for (String fruit : fruits)
    {
      System.out.println(fruit);
    }
  }
}