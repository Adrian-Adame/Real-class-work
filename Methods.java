public class Methods 
{
   public static void main(String[] args)
   {
      System.out.println("First line");
        
      printString("whatever");
      
      System.out.println("Print another line");
      
      // Method call
      
      anotherMethod();
     
      addNumbers(8,13);
       
      System.out.println("Program over");
   }
      public static void addNumbers(int a, int b)
      {
         System.out.println(a+b);
      }
       
      public static void printString(String word)
      {
         System.out.printf("%S%n", word);
      }
      
      
      public static void anotherMethod()
      {
         System.out.println("First line of method");
      }
}
