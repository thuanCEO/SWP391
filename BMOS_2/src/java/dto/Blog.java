/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.sql.Date;

/**
 *
 * @author THUAN
 */
public class Blog {
    private int blogID;
    private String title;
    private String content;
    private String imgUrl;
    private boolean status;
    private int accountID;
    private Date createdDate;
    private Date updatedDate;
    private String img;

    public Blog() {
    }

    public Blog(int blogID, String title, String content, String imgUrl, boolean status, int accountID, Date createdDate, Date updatedDate, String img) {
        this.blogID = blogID;
        this.title = title;
        this.content = content;
        this.imgUrl = imgUrl;
        this.status = status;
        this.accountID = accountID;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.img = img;
    }

    public int getBlogID() {
        return blogID;
    }

    public void setBlogID(int blogID) {
        this.blogID = blogID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

   
}
