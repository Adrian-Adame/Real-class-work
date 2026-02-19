import java.util.Scanner;


public class temp
{
   public static void maun(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println(" Enter a temprarue in Celcus");
      double celsius = scan.nextDouble();
      double fahrenhiet = convCtoF(celsius);
      
      System.out.printf("%,.2f degrees Celsius in %,.2f degrees Fahrenhiet");
   }
   
   public static double convCtoF(double celsius)
   {
      double fahrenheit = 9 / 5 * celsius + 32;
      
       return fahrenheit;
   }
}