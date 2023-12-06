import java.util.Scanner;

public class Hotel_Impl implements Hotel_Interface {
    Scanner sc=new Scanner(System.in);
    String[] items={"Roti", "Dosa", "Gobi","Noodles", "Fried Rice","Mashrooms"};
    int[][] quantity=new int[items.length][2];
    Hotel_Impl(){
        quantity[0][0]=10;
        quantity[1][0]=50;
        quantity[2][0]=60;
        quantity[3][0]=55;
        quantity[4][0]=50;
        quantity[5][0]=65;

    }
    
    @Override
    public void choice() {
        System.out.println("1.Show Menu\n2.Add Order\n3.Bill Order\n4.Exit");
    }
    @Override
    public void addOrder(int items,int plates) {
    
        quantity[items][1]+=plates;

    }
    @Override
    public void bill(Customer c) {
        double totalAmount =0;
        int count=1;
        System.out.printf("+------------------------------------------+\n");
        System.out.printf("     %-9s  |   %-10d    %n",c.getName(),c.getPhoneNumber());
        System.out.printf("+------------------------------------------+\n");
        System.out.printf("          : Final Order Summary :           \n");
        System.out.printf("+------------------------------------------+\n");
        System.out.printf("|   %-9s  |   %-10s   |  %-6s  |%n","ITEMS","QUANTITY","PRICE");
        
            for(int i=0; i<items.length; i++){
                if(quantity[i][1]>0){
                    System.out.printf("|%-2d %-9s  |      %-8d  |  %-6d  |%n",count,items[i],quantity[i][1],quantity[i][0]);
                    totalAmount+=quantity[i][1]*quantity[i][0];
                    count++;
                }
            }
        
        System.out.printf("+------------------------------------------+\n");
        System.out.println("Total Amount : " + totalAmount);
        double tax =(totalAmount*0.18);
        System.out.println("Tax : " + tax);
        double finalAmount=totalAmount+tax;
        System.out.println("Final Amount : " +finalAmount);
    
    

    }
    @Override
    public void showMenu() {
        System.out.printf("+---------------------------------+\n");
      System.out.printf("|    %-10s  |   %-10s   |%n","ITEMS","PRICE");
      System.out.printf("+---------------------------------+\n");
      System.out.printf("|  %-12s  |   %-10s   |%n","1. ROTI","Rs 10/pc");
      System.out.printf("|  %-12s  |   %-10s   |%n","2. DOSA","Rs 50/pc");
      System.out.printf("|  %-12s  |   %-10s  |%n","3. GOBI","Rs 60/plate");
      System.out.printf("|  %-12s  |   %-10s   |%n","4. NOODLES","Rs 55/pc");
      System.out.printf("|  %-13s |   %-10s   |%n","5. FRIED RICE","Rs 60/pc");
      System.out.printf("|  %-12s  |   %-10s   |%n","6. MASHROOMS","Rs 65/pc");
      System.out.printf("+---------------------------------+\n");
    }
   
   
    
}
