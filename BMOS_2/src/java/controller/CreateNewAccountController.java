/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AccountDAO;
import dto.Account;
import error.CreateAccountError;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author THUAN
 */
public class CreateNewAccountController extends HttpServlet {

    private final String CREATE_NEW_ACCOUNT_ERROR = "signup.jsp";
    private final String LOGIN_PAGE = "signin.jsp";
    private final String SUCESS = "CreateNewAccountController";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String url = CREATE_NEW_ACCOUNT_ERROR;
        try {
            boolean checkValidation = true;
            AccountDAO dao = new AccountDAO();
            String username = request.getParameter("txtUsername");
            String password = request.getParameter("txtPassword");
            String fullname = request.getParameter("txtFullname");
            String confirm = request.getParameter("txtConfirmPassword");
            String ok = request.getParameter("radio_option");
            boolean gender = false;
            if (ok.equals("1")) {
                gender = true;
            } else if (ok.equals("0")) {
                gender = false;
            }
            String address = request.getParameter("txtAddress");
            String phoneNum = request.getParameter("txtPhoneNum");
            String email = request.getParameter("txtEmail");

            // Xóa dòng code sau:
            // String date = request.getParameter("txtEmail");
            CreateAccountError cusError = new CreateAccountError();
            boolean isUsernameExisted = dao.isUsernameExisted(username);
            if (isUsernameExisted) {
//                String existingUsername = dao.detailProfileAccount(username).getUsername();
//                if (existingUsername.equals(username)) {
//                CreateAccountError cusError = new CreateAccountError();
                    cusError.setUsernameExisted("Tên tài khoản đã tồn tại!");
//                request.setAttribute("CREATE_ERROR", cusError);
                    checkValidation = false;
            }

                if (fullname.length() > 20 || username.length() < 6) {
                    cusError.setFullnameLengthErr("Độ dài họ và tên phải từ 6-20 kí tự!");
                    checkValidation = false;
                    if (fullname.isEmpty()) {
                        cusError.setFullnameLengthErr("Họ và tên không được để trống!");
                    }
                }
                if (password.length() < 8) {
                    cusError.setPasswordLengthErr("Mật khẩu nên dài từ 8 kí tự trở lên");
                    checkValidation = false;
                    if (password.isEmpty()) {
                        cusError.setPasswordLengthErr("Mật khẩu không được để trống");
                    }
                }
                if (!email.endsWith("@gmail.com")) {
                    cusError.setEmailSyntaxErr("Địa chỉ email phải có đuôi @gmail.com");
                    checkValidation = false;
                }

                if (checkValidation) {

                    // Thay đổi dòng code sau:
                    // Account ac = new Account(confirm, username, password, fullname, gender, email, phoneNum, address, date, 0)
                    // thành:
                    Account ac = new Account();
                    ac.setUsername(username);
                    ac.setPassword(password);
                    ac.setFullname(fullname);
                    ac.setGender(gender);
                    ac.setEmail(email);
                    ac.setPhone(phoneNum);
                    ac.setAddress(address);
                    // Các trường như accountID, status, createdDate, roleID sẽ được tự động cập nhật bởi SQL

                    dao.createAccount(ac);
                    url = LOGIN_PAGE;
                } else {
                    request.setAttribute("CREATE_ERROR", cusError);
                }
            }catch (Exception e) {
            e.printStackTrace();
        }
            request.getRequestDispatcher(url).forward(request, response);
        }

        // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
        /**
         * Handles the HTTP <code>GET</code> method.
         *
         * @param request servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
         */
        @Override
        protected void doGet
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Handles the HTTP <code>POST</code> method.
         *
         * @param request servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
         */
        @Override
        protected void doPost
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo
        
            () {
        return "Short description";
        }// </editor-fold>

    }
