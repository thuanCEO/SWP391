/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Category;
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
public class CatoryDAO {
      public List<Category> getAllAccount() throws ClassNotFoundException, SQLException {
        List<Category> listItems = new ArrayList<>();
        try {
            String sql = "select * from Category";
            PreparedStatement stm = getConnection().prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                int _categoryID = rs.getInt("CategoryID");
                String _name = rs.getString("CategoryName");
                Category ac = new Category(_categoryID, _name);
                listItems.add(ac);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listItems;
    }
}
