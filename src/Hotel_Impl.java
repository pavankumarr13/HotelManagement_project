import java.util.Scanner;

public class Hotel_Impl implements Hotel_Interface {
    Scanner sc=new Scanner(System.in);
    String[] items={"Roti", "Dosa", "Gobi"};
    int[] prices={10, 40, 50};
    int[][] quantity=new int[items.length][2];
    int j=0;
    @Override
    public void choice() {
        System.out.println("1.Show Menu\n2.Add Order\n3.Bill Order\n4.Exit");
    }
    @Override
    public void addOrder() {
        System.out.print("Enter the item number you want to order : ");
        int choice = sc.nextInt();
        while(choice!=0) {
            if(choice>0||choice<items.length) {
                System.out.println("Invalid choice. Please enter a valid item number.");
            } else {
                System.out.print("Enter the quantity: ");
                int qty = sc.nextInt();
                quantity[choice-1][j]=qty;
                System.out.println("Order summary:");
                for(int i=0;i<items.length;i++) {
                    System.out.printf("|    %-9s  |   %-10s   |%n",items[i],quantity[choice-1][j]);
                }
                j++;
    
            }

        }

    }
    @Override
    public void bill(Customer c) {
        

    }
    @Override
    public void showMenu() {
        System.out.printf("+--------------------------------+\n");
      System.out.printf("|    %-9s  |   %-10s   |%n","ITEMS","PRICE");
      System.out.printf("+--------------------------------+\n");
      System.out.printf("|    %-9s  |   %-10s   |%n","1. ROTI","Rs 10/pc");
      System.out.printf("|    %-9s  |   %-10s   |%n","2. DOSA","Rs 40/pc");
      System.out.printf("|    %-9s  |   %-10s   |%n","3. GOBI","Rs 50/pc");
      System.out.printf("+--------------------------------+\n");
    }
   
    
}
