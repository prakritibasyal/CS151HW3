/**
   A simple invoice formatter.
*/
//Html formatter for nicer output
public class SimpleFormatter implements InvoiceFormatter
{
	
   public String formatHeader()
   {
      total = 0;
      
     String inVoice=  "<html><h1 style = 'color: blue' >INVOICE</h1>";
     return inVoice;
  

      
   }

   public String formatLineItem(LineItem item)
   {
	

      total += item.getPrice();
      
      return (String.format(
            "<h4>%s: $%.2f </h4>\n\n",item.toString(),item.getPrice()));
 
   }

   public String formatFooter()
   {
      return (String.format("\n\n<h3 style = 'color:green'>TOTAL DUE: $%.2f\n</h3>", total));
   }

   private double total;
}
