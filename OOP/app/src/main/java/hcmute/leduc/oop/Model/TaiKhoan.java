package hcmute.leduc.oop.Model;

import java.util.*;

/**
 * 
 */
public class TaiKhoan {
    private String UserName;
    private String PassWord;
    private int Quyen;
    public TaiKhoan() {
    }

    public TaiKhoan(String userName, String passWord, int quyen) {
        UserName = userName;
        PassWord = passWord;
        Quyen = quyen;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }

    public int getQuyen() {
        return Quyen;
    }

    public void setQuyen(int quyen) {
        Quyen = quyen;
    }
}