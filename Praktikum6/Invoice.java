package Praktikum6;

public class Invoice implements Payable{
    String productName;
    int quantity;
    int pricePerItem;
    public Invoice(){
    }
    public Invoice(String productName, int pricePerItem){
        this.productName = productName;
        this.pricePerItem = pricePerItem;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setPricePerItem(int pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
    public String getProductName() {
        return productName;
    }
    public int getQuantity() {
        return quantity;
    }
    public int getPricePerItem() {
        return pricePerItem;
    }
    public double getPayableAmount(){
        return quantity * pricePerItem;
    }
}