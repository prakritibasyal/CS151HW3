public class PurchaseItem implements LineItem{
  
   public PurchaseItem(LineItem item) {
       this.item = item;
       this.quantity = 1;
   }
  
   public PurchaseItem(LineItem item, int quantity) {
       this.item = item;
       this.quantity = quantity;
   }
  
  
   public LineItem getItem() {
       return item;
   }

   public void setItem(LineItem item) {
       this.item = item;
   }

   public int getQuantity() {
       return quantity;
   }

   public void setQuantity(int quantity) {
       this.quantity = quantity;
   }

   public double getPrice() {
       return item.getPrice() * quantity;
   }

   public String toString() {
       if(quantity == 1)
           return item.toString();
       else
           return item.toString() + " x " + quantity;
   }
  
   private LineItem item;
   private int quantity;
  
}