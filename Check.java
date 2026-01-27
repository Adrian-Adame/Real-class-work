public class Check
{
   
   public static void main(String[]args)
   {
      
      double bill =  14.70;
      
      int tipRate = 20;
      
      double tipAmount = ((tipRate/100.0) * bill );
      
      double totalBill = (bill + tipAmount);
        
         System.out.println(" A " + tipRate + " Percent tip on a bill of "
         + bill + " is " + tipAmount + ". "+ "The total bill is " + totalBill );
   }
}