package bai1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private int orderID;
    private LocalDate orderDate;
    private List<OrderDetail> lineItem;
    private int count = 0;
    private static int currentOrderID = 1;
    private static Order currentOrder;

    public Order() {
    }

    public Order(int orderID, LocalDate orderDate, List<OrderDetail> lineItem, int count) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.lineItem = lineItem;
        this.count = count;
    }
    
    public Order(LocalDate orderDate){
        if(currentOrder == null){
            currentOrder = this;
            this.orderID = currentOrderID++;
            this.orderDate = orderDate;
            this.lineItem = new ArrayList<>();
            this.count = ++count;
        }else{
            this.orderID = currentOrder.getOrderID();
            this.orderDate = orderDate;
            this.lineItem = currentOrder.getLineItem();
            this.count = currentOrder.getCount();
        }
    }

    public static int getCurrentOrderID() {
        return currentOrderID;
    }

    public static void setCurrentOrderID(int currentOrderID) {
        Order.currentOrderID = currentOrderID;
    }

    public static Order getCurrentOrder() {
        return currentOrder;
    }

    public static void setCurrentOrder(Order currentOrder) {
        Order.currentOrder = currentOrder;
    }

    
    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public List<OrderDetail> getLineItem() {
        return lineItem;
    }

    public void setLineItem(List<OrderDetail> lineItem) {
        this.lineItem = lineItem;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void addItem(Product p, int quantity) {
        lineItem.add(new OrderDetail(quantity, p));
    }
    
    public double calcTotalCharge(){
        double tongtien=0;
        for (OrderDetail od : lineItem) {
            tongtien+=od.calcTotalPrice();
        }
        return tongtien;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ma order: ").append(orderID).append("Ngay mua: ").append(orderDate).append("\n");
        sb.append(String.format("|%-15s|%-25s|%-20s|%-20s|%-20s|%n", "STT", "MaSP", "Mo ta", "Don gia", "So luong", "Thanh tien"));
        
        for(int i=0;i<lineItem.size();i++){
            OrderDetail o = lineItem.get(i);
            Product p = o.getProduct();
            sb.append(String.format("|%-15s|%-25s|%-20s|%-20s|%-20s|%n", i+1, p.getProductID(),p.getDescription(),p.getPrice(),o.getQuantity(),o.calcTotalPrice()));
        }
        sb.append("Tong tien: ").append(calcTotalCharge());
        return sb.toString();
    }

}
