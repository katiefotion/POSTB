package Transaction;

   /**
   *
   * @author: Darryl Raveche
   */
   
public class TransactionItem {
    
    private String productUPC; 
    private int prodQuantity;
    
    
    // Constructor with parameters
    public TransactionItem(String upc, int quantity) {
        this.productUPC = upc;
        this.prodQuantity = quantity;
    }
    
    // Getters for UPC and quantity 
    public int getProdQuantity() {
        return this.prodQuantity;
    }    
    public String getProductUPC() {
        return this.productUPC;
    }
}