/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.sql.Date;

/**
 *
 * @author DELL
 */
public class Product {

    private int productID;
    private String productName;
    private boolean status;
    private float price;
    private int quantity;
    private float discount;
    private String description;
    private Date createdDate;
    private Date updatedDate;
    private int PicID;
    private int CategoryID;
    private String img;

    public Product() {
    }

    public Product(int productID, String productName, boolean status, float price, int quantity, float discount, String description, Date createdDate, Date updatedDate, int PicID, int CategoryID, String img) {
        this.productID = productID;
        this.productName = productName;
        this.status = status;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
        this.description = description;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.PicID = PicID;
        this.CategoryID = CategoryID;
        this.img = img;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

   

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public int getPicID() {
        return PicID;
    }

    public void setPicID(int PicID) {
        this.PicID = PicID;
    }

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int CategoryID) {
        this.CategoryID = CategoryID;
    }

}
