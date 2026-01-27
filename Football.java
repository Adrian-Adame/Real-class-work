public class Football
{
   public static void main(String[]args)
   {
      int points = 22;
     
      int td = points / 8;
      int leftoverPoints = points % 8;
      int fg = leftoverPoints / 5;
      int safety = leftoverPoints % 5;
      
      System.out.println("Given total point: " + points );
      System.out.println("TOuchdowns: " + td);
      System.out.println("FeildGoals: " + fg);
      System.out.println("and Safetys: " + safety);
   }
}