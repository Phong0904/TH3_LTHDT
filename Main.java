//Truong Hoai Phong
package bai1;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Order currentOrder = null;
        int menu;
        do{
            System.out.println("1. them");
            System.out.println("2. in");
            System.out.println("0. thoat");
            System.out.print("Nhap: ");
            menu = sc.nextInt();
            
            switch(menu){
                case 1:
                    sc.nextLine();
                    System.out.print("Nhap ma SP: "); String orderID = sc.nextLine();
                    System.out.print("Nhap mo ta: "); String description = sc.nextLine();
                    System.out.print("Nhap gia: "); double price = sc.nextDouble();
                    System.out.print("Nhap so luong: "); int quantity = sc.nextInt();
                    
                    Product p = new Product(description, orderID, price);
                    
                    if(currentOrder == null){
                        currentOrder = new Order(LocalDate.now());
                    }
                    currentOrder.addItem(p, quantity);
                    System.out.println("Them thanh cong");
                    break;
                case 2:
                    System.out.println(currentOrder.toString());
                    break;
                default:
                    if(menu==0){
                        System.out.println("Nhap lai");
                    }else{
                        System.out.println("Thoat");
                    }
            }
        }while(menu!=0);
    }
}
