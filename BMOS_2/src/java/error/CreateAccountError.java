/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package error;

/**
 *
 * @author DELL
 */
public class CreateAccountError {

    private String usernameExisted;
    private String emailSyntaxErr;
    private String phoneNumLengthErr;
    private String addressLengthErr;
    private String fullnameLengthErr;
    private String passwordLengthErr;
    private String usernameLengthErr;
    private String errorMsg;

    public CreateAccountError() {

    }

    public CreateAccountError(String usernameExisted, String emailSyntaxErr, String phoneNumLengthErr, String addressLengthErr, String fullnameLengthErr, String passwordLengthErr, String usernameLengthErr) {
        this.usernameExisted = usernameExisted;
        this.emailSyntaxErr = emailSyntaxErr;
        this.phoneNumLengthErr = phoneNumLengthErr;
        this.addressLengthErr = addressLengthErr;
        this.fullnameLengthErr = fullnameLengthErr;
        this.passwordLengthErr = passwordLengthErr;
        this.usernameLengthErr = usernameLengthErr;
    }

    public String getUsernameExisted() {
        return usernameExisted;
    }

    public void setUsernameExisted(String usernameExisted) {
        this.usernameExisted = usernameExisted;
    }

    public String getEmailSyntaxErr() {
        return emailSyntaxErr;
    }

    public void setEmailSyntaxErr(String emailSyntaxErr) {
        this.emailSyntaxErr = emailSyntaxErr;
    }

    public String getPhoneNumLengthErr() {
        return phoneNumLengthErr;
    }

    public void setPhoneNumLengthErr(String phoneNumLengthErr) {
        this.phoneNumLengthErr = phoneNumLengthErr;
    }

    public String getAddressLengthErr() {
        return addressLengthErr;
    }

    public void setAddressLengthErr(String addressLengthErr) {
        this.addressLengthErr = addressLengthErr;
    }

    public String getFullnameLengthErr() {
        return fullnameLengthErr;
    }

    public void setFullnameLengthErr(String fullnameLengthErr) {
        this.fullnameLengthErr = fullnameLengthErr;
    }

    public String getPasswordLengthErr() {
        return passwordLengthErr;
    }

    public void setPasswordLengthErr(String passwordLengthErr) {
        this.passwordLengthErr = passwordLengthErr;
    }

    public String getUsernameLengthErr() {
        return usernameLengthErr;
    }

    public void setUsernameLengthErr(String usernameLengthErr) {
        this.usernameLengthErr = usernameLengthErr;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

}
