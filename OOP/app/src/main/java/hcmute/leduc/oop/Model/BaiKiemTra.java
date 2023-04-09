package hcmute.leduc.oop.Model;

import java.util.*;

/**
 * 
 */
public class BaiKiemTra {
    private Date ThoiGianBatDau;
    private Date ThoiGianKetThuc;
    private String MaBaiKiemTra;
    public BaiKiemTra() {

    }
    public BaiKiemTra(Date thoiGianBatDau, Date thoiGianKetThuc, String maBaiKiemTra) {
        ThoiGianBatDau = thoiGianBatDau;
        ThoiGianKetThuc = thoiGianKetThuc;
        MaBaiKiemTra = maBaiKiemTra;
    }
    public Date getThoiGianBatDau() {
        return ThoiGianBatDau;
    }

    public void setThoiGianBatDau(Date thoiGianBatDau) {
        ThoiGianBatDau = thoiGianBatDau;
    }

    public Date getThoiGianKetThuc() {
        return ThoiGianKetThuc;
    }

    public void setThoiGianKetThuc(Date thoiGianKetThuc) {
        ThoiGianKetThuc = thoiGianKetThuc;
    }

    public String getMaBaiKiemTra() {
        return MaBaiKiemTra;
    }

    public void setMaBaiKiemTra(String maBaiKiemTra) {
        MaBaiKiemTra = maBaiKiemTra;
    }

    public void taoCauHoi() {
        // TODO implement here
    }

}