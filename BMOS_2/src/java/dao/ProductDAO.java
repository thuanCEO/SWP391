/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import util.DBContext;
import dto.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class ProductDAO extends DBContext {

    public Product findProductForCart(String Id, int quantity) throws ClassNotFoundException, SQLException {
        try {
            String sql = "select * from Product where productID = ?";
            PreparedStatement stm = getConnection().prepareStatement(sql);
            stm.setInt(1, Integer.parseInt(Id));
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                return new Product(rs.getInt(1), rs.getString(2), rs.getBoolean(3), rs.getFloat(4), quantity,
                        rs.getFloat(6), rs.getString(7), rs.getDate(8), rs.getDate(9), rs.getInt(10), rs.getInt(11), rs.getString(12));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Product> getListProductByCategory(String search) throws SQLException {
        List<Product> listProduct = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = getConnection().prepareStatement("SELECT * FROM Product WHERE CategoryID = ?");
            pst.setString(0, search);
            rs = pst.executeQuery();
            while (rs.next()) {
                listProduct.add(new Product(rs.getInt(1), rs.getString(2), rs.getBoolean(3), rs.getFloat(4), rs.getInt(5),
                        rs.getFloat(6), rs.getString(7), rs.getDate(8), rs.getDate(9), rs.getInt(10), rs.getInt(11), rs.getString(12)));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listProduct;
    }

    public List<Product> getListProduct() throws SQLException {
        List<Product> listProduct = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = getConnection().prepareStatement("SELECT * FROM Product");
            rs = pst.executeQuery();
            while (rs.next()) {
                listProduct.add(new Product(rs.getInt(1), rs.getString(2), rs.getBoolean(3), rs.getFloat(4), rs.getInt(5),
                        rs.getFloat(6), rs.getString(7), rs.getDate(8), rs.getDate(9), rs.getInt(10), rs.getInt(11), rs.getString(12)));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listProduct;
    }

    public Product getProductByID(String Id) throws SQLException {
        Product product = new Product();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = getConnection().prepareStatement("SELECT * FROM Product WHERE ProductID = ?");
            rs = pst.executeQuery();
            if (rs.next()) {
                return new Product(rs.getInt(1), rs.getString(2), rs.getBoolean(3), rs.getFloat(4), rs.getInt(5),
                        rs.getFloat(6), rs.getString(7), rs.getDate(8), rs.getDate(9), rs.getInt(10), rs.getInt(11), rs.getString(12));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Product> getCatoryContrung() throws SQLException {
        List<Product> listProduct = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = getConnection().prepareStatement("SELECT * FROM Product where categoryID = 1");
            rs = pst.executeQuery();
            while (rs.next()) {
                listProduct.add(new Product(rs.getInt(1), rs.getString(2), rs.getBoolean(3), rs.getFloat(4), rs.getInt(5),
                        rs.getFloat(6), rs.getString(7), rs.getDate(8), rs.getDate(9), rs.getInt(10), rs.getInt(11), rs.getString(12)));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listProduct;
    }

    public List<Product> getCatoryHat() throws SQLException {
        List<Product> listProduct = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = getConnection().prepareStatement("SELECT * FROM Product where categoryID = 2");
            rs = pst.executeQuery();
            while (rs.next()) {
                listProduct.add(new Product(rs.getInt(1), rs.getString(2), rs.getBoolean(3), rs.getFloat(4), rs.getInt(5),
                        rs.getFloat(6), rs.getString(7), rs.getDate(8), rs.getDate(9), rs.getInt(10), rs.getInt(11), rs.getString(12)));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listProduct;
    }

    public List<Product> getCatoryCam() throws SQLException {
        List<Product> listProduct = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = getConnection().prepareStatement("SELECT * FROM Product where categoryID = 3");
            rs = pst.executeQuery();
            while (rs.next()) {
                listProduct.add(new Product(rs.getInt(1), rs.getString(2), rs.getBoolean(3), rs.getFloat(4), rs.getInt(5),
                        rs.getFloat(6), rs.getString(7), rs.getDate(8), rs.getDate(9), rs.getInt(10), rs.getInt(11), rs.getString(12)));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listProduct;
    }

    public List<Product> getCatoryThucuong() throws SQLException {
        List<Product> listProduct = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = getConnection().prepareStatement("SELECT * FROM Product where categoryID = 4");
            rs = pst.executeQuery();
            while (rs.next()) {
                listProduct.add(new Product(rs.getInt(1), rs.getString(2), rs.getBoolean(3), rs.getFloat(4), rs.getInt(5),
                        rs.getFloat(6), rs.getString(7), rs.getDate(8), rs.getDate(9), rs.getInt(10), rs.getInt(11), rs.getString(12)));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listProduct;
    }

    public List<Product> getCatoryTraiCay() throws SQLException {
        List<Product> listProduct = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = getConnection().prepareStatement("SELECT * FROM Product where categoryID = 5");
            rs = pst.executeQuery();
            while (rs.next()) {
                listProduct.add(new Product(rs.getInt(1), rs.getString(2), rs.getBoolean(3), rs.getFloat(4), rs.getInt(5),
                        rs.getFloat(6), rs.getString(7), rs.getDate(8), rs.getDate(9), rs.getInt(10), rs.getInt(11), rs.getString(12)));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listProduct;
    }
}
