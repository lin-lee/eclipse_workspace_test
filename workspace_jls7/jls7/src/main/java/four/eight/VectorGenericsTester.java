package four.eight;
import java.util.Vector;

public class VectorGenericsTester
{
     public static void main(String[] args)
     {
          // Integer-type Vector
          Vector<Integer> integerVector= new Vector();

   
          // raw-type Vector (with String element)
          Vector rawVector = new Vector<String>();
          rawVector.add("dummy string");

          // assign raw-type (with String element) to Integer-type Vector
          integerVector = rawVector;

          // String is inside of Integer-type Vector
          System.out.println(integerVector);
          
          Object o = new int[5];

     } 
}