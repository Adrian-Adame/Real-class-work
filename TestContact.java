public class TestContact
{

   public static void main(String[]args)
   {
      Contact contact1 = new Contact();
      contact1.setName("Norman Powel");
      contact1.setNumber("706-459-7074");
   
      Contact contact2 = new Contact();  
      contact2.setName ("bob brown");
      contact2.setNumber ("706-272-2488");
   
      System.out.println(contact1);
      System.out.printf("name: %s Number: %s%n" , contact1.getName(),
      contact1.getNumber());
      System.out.printf("name: %s Number: %s%n" , contact2.getName(),
      contact2.getNumber());
   }
}
