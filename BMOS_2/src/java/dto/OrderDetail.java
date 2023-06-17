/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author DELL
 */
public class OrderDetail {
    private Order order;
    private Product product;
    float price;
    int quantity;
    public OrderDetail() {
        this.order = new Order();
        this.product = new Product();
        this.price = 0;
        this.quantity = 0;
    }
    public OrderDetail(Order order, Product product, float price, int quanity) {
        this.order = order;
        this.product = product;
        this.price = price;
        this.quantity = quanity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
