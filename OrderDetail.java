//Truong Hoai Phong
package bai1;

public class OrderDetail {
    private int quantity;
    private Product product;

    public OrderDetail() {
    }

    public OrderDetail(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    public double calcTotalPrice(){
        double thanhtien;
        thanhtien=quantity*product.getPrice();
        return thanhtien;
    }

    @Override
    public String toString() {
        return "OrderDetail{" + "quantity=" + quantity + ", product=" + product + '}';
    }
}
