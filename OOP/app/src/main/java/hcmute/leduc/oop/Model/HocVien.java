package hcmute.leduc.oop.Model;

import java.util.*;

/**
 * 
 */
public class HocVien {
    private String MSHV;
    private String HoTen;
    private String SoDienThoai;
    private Date NgaySinh;
    public HocVien() {
    }

    public HocVien(String MSHV, String hoTen, String soDienThoai, Date ngaySinh) {
        this.MSHV = MSHV;
        HoTen = hoTen;
        SoDienThoai = soDienThoai;
        NgaySinh = ngaySinh;
    }

    public String getMSHV() {
        return MSHV;
    }

    public void setMSHV(String MSHV) {
        this.MSHV = MSHV;
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

    public void layDanhSachMaLop() {
        // TODO implement here
    }

    /**
     * @param MaLop
     */
    public void layDanhSachBuoiHoc(String MaLop) {
        // TODO implement here
    }

    /**
     * @param MaBuoiHoc
     */
    public void layDanhSachBaiGiang(String MaBuoiHoc) {
        // TODO implement here
    }

    /**
     * 
     */
    public void layBaiGiang() {
        // TODO implement here
    }

    /**
     * 
     */
    public void layDanhSachBaiKiemTra() {
        // TODO implement here
    }

    /**
     * @param MaBaiKiemTra
     */
    public void layBaiKiemTra(String MaBaiKiemTra) {
        // TODO implement here
    }

}