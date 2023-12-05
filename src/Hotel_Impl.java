import java.util.Scanner;

public class Hotel_Impl implements Hotel_Interface {
    Scanner sc=new Scanner(System.in);
    String[] items={"Roti", "Dosa", "Gobi"};
    int[] prices={10, 40, 50};
    int column=5;
    int[][] quantity=new int[items.length][items.length];
    
    @Override
    public void choice() {
        System.out.println("1.Show Menu\n2.Add Order\n3.Bill Order\n4.Exit");
    }
    @Override
    public void addOrder() {
        System.out.print("Enter the item number you want to order : ");
        int choice = sc.nextInt();
        if(choice<0||choice>items.length) {
                try{
                    throw new InvalidChoice();
                }catch(InvalidChoice e){
                    System.out.println(e.getMessage());
                }
    
            } else if (choice==1){
                System.out.print("Enter the quantity: ");
                int qty = sc.nextInt();
                int c=choice-1;
                quantity[c][c]=qty;
                System.out.println("Order summary:");
                System.out.printf("|    %-9s  |   %-10s   |%n",items[0],quantity[c][c]);
               
    
            }else if(choice==2) {
                System.out.print("Enter the quantity: ");
                int qty = sc.nextInt();
                int c=choice-1;
                quantity[choice-1][c]=qty;
                System.out.println("Order summary:");
                System.out.printf("|    %-9s  |   %-10s   |%n",items[1],quantity[choice-1][c]);
               
            }
            else if(choice==3) {
                System.out.print("Enter the quantity: ");
                int qty = sc.nextInt();
                int c=choice-1;
                quantity[choice-1][c]=qty;
                System.out.println("Order summary:");
                System.out.printf("|    %-9s  |   %-10s   |%n",items[2],quantity[choice-1][c]);
                
            }
       

    }
    @Override
    public void bill(Customer c) {
        double totalAmount =0;
        System.out.printf("+--------------------------------+");
        System.out.printf("     %-9s  |   %-10d    %n",c.getName(),c.getPhoneNumber());
        System.out.printf("+--------------------------------+");
        System.out.printf("     : Final Order Summary :      \n");
        System.out.printf("+--------------------------------+\n");
        
            for(int i=0; i<items.length; i++) {
            for(int j=0;j<items.length;j++) {
                if(quantity[i][j]!=0){
                    System.out.printf("|    %-9s  |   %-10s   |%n",items[i],quantity[i][j]);
                totalAmount+=prices[i]*quantity[i][j];
                }
            }
        }
        System.out.printf("+--------------------------------+\n");
        System.out.println("Total Amount : " + totalAmount);
        double tax =(totalAmount*0.18);
        System.out.println("Tax : " + tax);
        double finalAmount=totalAmount+tax;
        System.out.println("Final Amount : " +finalAmount);
    
    

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
