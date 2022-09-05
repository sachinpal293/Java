package encapsulation;

public class encapsulation {
    public static void main(String[] args) {
        laptop l1 = new laptop();
        l1.setPrice(20000);
        l1.getPrice();
    }

}
  class laptop{
    int ram;
    private int price;
    public void setPrice(int price)
    {
        // is the user an Admin
        boolean isAdmin = true;
        if(!isAdmin) {
            System.out.println("You connot set the price");
        }else{
            this.price = price;
        }
    }
    public void getPrice()
    {
        System.out.println(price);
    }
  }