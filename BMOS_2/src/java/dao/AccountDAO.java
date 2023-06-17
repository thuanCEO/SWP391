/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Account;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import util.DBContext;

/**
 *
 * @author THUAN
 */
public class AccountDAO extends DBContext {

    //find account
    public Account findAccount(String username, String password) throws ClassNotFoundException, SQLException {
        try {
            String sql = "select * from Account where username = ? and password = ?";
            PreparedStatement stm = getConnection().prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                return new Account(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getBoolean(5),
                        rs.getBoolean(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getDate(10), rs.getInt(11));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
//seach by name
    public List<Account> searchAccountByName(String txtSearch) throws ClassNotFoundException, SQLException {
        List<Account> list = new ArrayList<>();
        try {
            String sql = "select * from Account where username like ?";
            PreparedStatement stm = getConnection().prepareStatement(sql);
            stm.setString(1, "%" + txtSearch + "%");
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                list.add(new Account(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getBoolean(5), rs.getBoolean(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getDate(10), rs.getInt(11)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    //get all account
     public List<Account> getAllAccount() throws ClassNotFoundException, SQLException {
        List<Account> listItems = new ArrayList<>();
        try {
            String sql = "select * from Account";
            PreparedStatement stm = getConnection().prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                String _accountID = rs.getString("accountID");
                String _username = rs.getString("username");
                String _password = rs.getString("password");
                String _fullname = rs.getString("fullname");
                boolean _status = rs.getBoolean("status");
                boolean _gender = rs.getBoolean("gender");
                String _email = rs.getString("email");
                String _phone = rs.getString("phone");
                String _address = rs.getString("address");
                Date _date = rs.getDate("createdDate");
                int _roleID = rs.getInt("roleID");
                Account ac = new Account(_accountID, _username, _password, _fullname,
                        _status, _gender, _email, _phone, _address, _date, _roleID);
                listItems.add(ac);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listItems;
    }

    public static void main(String[] args) throws Exception {
        AccountDAO dao = new AccountDAO();
        List<Account> list = dao.getAllAccount();
        for (Account o : list) {
            System.out.println(o);
        }
    }

    //detail account
    public Account detailAccount(String id) throws ClassNotFoundException, SQLException {
        Account ac = null;
        try {
            String sql = "select * from Account where accountID=? ";
            PreparedStatement stmt = getConnection().prepareStatement(sql);
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String _accountID = rs.getString("accountID");
                String _username = rs.getString("username");
                String _password = rs.getString("password");
                String _fullname = rs.getString("fullname");
                boolean _status = rs.getBoolean("status");
                boolean _gender = rs.getBoolean("gender");
                String _email = rs.getString("email");
                String _phone = rs.getString("phone");
                String _address = rs.getString("address");
                Date _date = rs.getDate("createdDate");
                int _roleID = rs.getInt("roleID");
                ac = new Account(_accountID, _username, _password, _fullname,
                        _status, _gender, _email, _phone, _address, _date, _roleID);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ac;
    }

    public Account detailProfileAccount(String name) throws ClassNotFoundException, SQLException {
        Account ac = null;
        try {
            String sql = "select * from Account where username=? ";
            PreparedStatement stmt = getConnection().prepareStatement(sql);
            stmt.setString(1, name);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String _accountID = rs.getString("accountID");
                String _username = rs.getString("username");
                String _password = rs.getString("password");
                String _fullname = rs.getString("fullname");
                boolean _status = rs.getBoolean("status");
                boolean _gender = rs.getBoolean("gender");
                String _email = rs.getString("email");
                String _phone = rs.getString("phone");
                String _address = rs.getString("address");
                Date _date = rs.getDate("createdDate");
                int _roleID = rs.getInt("roleID");
                ac = new Account(_accountID, _username, _password, _fullname,
                        _status, _gender, _email, _phone, _address, _date, _roleID);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ac;
    }

    //Create account
    public Account createAccount(Account newItem) {
        try {
            String sql = "INSERT INTO Account(username, password, fullname, gender, email, phone, address) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = getConnection().prepareStatement(sql);
            stmt.setString(1, newItem.getUsername());
            stmt.setString(2, newItem.getPassword());
            stmt.setString(3, newItem.getFullname());
            stmt.setBoolean(4, newItem.isGender());
            stmt.setString(5, newItem.getEmail());
            stmt.setString(6, newItem.getPhone());
            stmt.setString(7, newItem.getAddress());

            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //Update Account
    public Account updateAccount(Account edittedItem) {
        try {
            String sql = "update Account set username=?, password=?, fullname=?, status=?, gender=?,"
                    + "email=?, phone=?, address=?, createdDate=?, roleID=? where accountID=? ";
            PreparedStatement stmt = getConnection().prepareStatement(sql);
            stmt.setString(1, edittedItem.getUsername());
            stmt.setString(2, edittedItem.getPassword());
            stmt.setString(3, edittedItem.getFullname());
            stmt.setBoolean(4, edittedItem.isStatus());
            stmt.setBoolean(5, edittedItem.isGender());
            stmt.setString(6, edittedItem.getEmail());
            stmt.setString(7, edittedItem.getPhone());
            stmt.setString(8, edittedItem.getAddress());
            stmt.setDate(9, edittedItem.getDate());
            stmt.setInt(10, edittedItem.getRoleID());
            stmt.setString(11, edittedItem.getAccountID());
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    //Delete Account
    public Account deleteAccount(String id) {
        try {
            String sql = "delete from Account where accountID =? ";
            PreparedStatement stmt = getConnection().prepareStatement(sql);
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean isUsernameExisted(String username) throws SQLException {
        boolean existed = false;
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            con = getConnection();
            if (con != null) {
                String sql = "SELECT username FROM Account WHERE username = ?";
                stmt = con.prepareStatement(sql);
                stmt.setString(1, username);
                rs = stmt.executeQuery();
                existed = rs.next();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (con != null) {
                con.close();
            }
        }

        return existed;
    }

}
