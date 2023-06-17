/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


import dao.AccountDAO;
import java.sql.SQLException;
import java.util.List;
import javax.naming.NamingException;

/**
 *
 * @author DELL
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        AccountDAO dao = new AccountDAO();
        dao.findAccount("admin", "123");
    }}

    

