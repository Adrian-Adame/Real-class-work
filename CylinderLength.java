import java.util.Scanner;

public class CylinderLength
{
   public static void main(String[]args)
   {
         Scanner scan =  new Scanner(System.in);
         System.out.println(" Enter the radius");
         double radius = scan.nextDouble();
         System.out.println("Enter the Length");
         double length = scan.nextDouble();
         
         // call functions
         double area = areaCricle(radius);
         double volume =  computeVolume(length,area);
         
         System.out.printf(" The area of the base is %,.2f square units.%n", area );  
         System.out.printf(" The volume of the cylinder is %,.2f cubix units.%n", volume);  

   }
      
      
   public static double areaCricle(double radius)
   {
      double area = Math.PI * Math.pow(radius,2.0);
      return area;
   
   }
   
   
   public static double computeVolume(double length, double area)
   {
      double volume = area * length;
      return volume;
   
   }
   
}