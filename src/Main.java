
import java.util.Scanner;

public class Main {
    public static void main(String[] args)   {
      Scanner sc=new Scanner(System.in);
      System.out.printf("----------------------------------\n");
      System.out.printf("  WELCOM TO THE NEW UDUPI HOTEL!  %n");
      System.out.printf("-----------------------------------\n");
      System.out.println();

      System.out.println("Enter your name :");
     
      String name=sc.nextLine();
      System.out.println("Enter your Phone Number :");
      long num= sc.nextLong();

      Customer c=new Customer(name,num);
      Hotel_Factory hf=new Hotel_Factory();
      Hotel_Interface hi=hf.getObject();

      
      
      
      while(true){
        hi.choice();
        System.out.println("What you like to do :");
         int a=sc.nextInt();
        switch(a){
          case 1:
            hi.showMenu();
            break;
          case 2:
            hi.showMenu();
            System.out.println("Enter the item number :");
            int n=sc.nextInt();
            if(n>0 && n<7){
              System.out.println("Enter the quantity :");
              int qty=sc.nextInt();
              hi.addOrder(n-1,qty);
            }else{
              try{
                throw new InvalidChoice();
              }catch(InvalidChoice e){
                System.out.println(e.getMessage());
              }
            }
            
            break;
          case 3:
            hi.bill(c);
            return;
            
          case 4:
            System.out.println("Thank you for using our service!");
            return;
          default:
            System.out.println("Invalid Input\n");
            break;
        }

      }
      
     
    }
     
}
