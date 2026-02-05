public class Cyliders
{
   public static void main(String[] args)
   {
      
      double radius1 = 31.3;
      double hight1 = 5.6;
      double radius2 = 7.8;
      double hight2 = 10.9;
      double radius3 = 0.12;
      double hight3 = 1.62;
      
      computerPrintVolume(radius1,hight1);
      computerPrintVolume(radius2,hight2);
      computerPrintVolume(radius3,hight3);
      
      
    }
      public static void computerPrintVolume(double radius, double hight)
      { 
         double volume = Math.PI * Math.pow(radius,2.0) * hight;
        
      
     
      System.out.printf("The area of a right circular cylindre wiht radius" + 
      "%, .2f units and heights %, .2f units is %, .2f cubic units.", radius,hight, volume);
     
   }

}