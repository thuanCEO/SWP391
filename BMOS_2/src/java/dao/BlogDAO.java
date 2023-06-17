/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Blog;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static util.DBContext.getConnection;

/**
 *
 * @author THUAN
 */
public class BlogDAO {
     public List<Blog> getListBlog() throws SQLException {
        List<Blog> list = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
                pst = getConnection().prepareStatement("SELECT * FROM Blog");
                rs = pst.executeQuery();
                while (rs.next()) {
                    list.add(new Blog(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
                            rs.getBoolean(5), rs.getInt(6), rs.getDate(7), rs.getDate(8),rs.getString(9)));
                }
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return list;
    }
}
