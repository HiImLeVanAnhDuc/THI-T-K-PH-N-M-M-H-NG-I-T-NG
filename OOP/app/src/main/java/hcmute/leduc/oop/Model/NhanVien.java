package hcmute.leduc.oop.Model;

import java.util.*;

/**
 * 
 */
public class NhanVien {
    private String MSNV;
    private String HoTen;
    private String SoDienThoai;
    private Date NgaySinh;
    private String DiaChi;
    public NhanVien() {
    }

    public NhanVien(String MSNV, String hoTen, String soDienThoai, Date ngaySinh, String diaChi) {
        this.MSNV = MSNV;
        HoTen = hoTen;
        SoDienThoai = soDienThoai;
        NgaySinh = ngaySinh;
        DiaChi = diaChi;
    }

    public String getMSNV() {
        return MSNV;
    }

    public void setMSNV(String MSNV) {
        this.MSNV = MSNV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        HoTen = hoTen;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        SoDienThoai = soDienThoai;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public void themLopHoc() {
        // TODO implement here
    }

}