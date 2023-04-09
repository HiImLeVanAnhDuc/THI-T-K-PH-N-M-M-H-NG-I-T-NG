package hcmute.leduc.oop.Model;

import java.util.*;

/**
 * 
 */
public class GiangVien {
    private String MSGV;
    private String HoTen;
    private String SoDienThoai;
    private Date NgaySinh;
    private String DiaChi;
    public GiangVien() {
    }

    public GiangVien(String MSGV, String hoTen, String soDienThoai, Date ngaySinh, String diaChi) {
        this.MSGV = MSGV;
        HoTen = hoTen;
        SoDienThoai = soDienThoai;
        NgaySinh = ngaySinh;
        DiaChi = diaChi;
    }

    public String getMSGV() {
        return MSGV;
    }

    public void setMSGV(String MSGV) {
        this.MSGV = MSGV;
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

    public void layDanhSachBuoiHoc() {
        // TODO implement here
    }

    /**
     * @param IDLopHoc
     */
    public void chinhSuaLopHoc(String IDLopHoc) {
        // TODO implement here
    }

}