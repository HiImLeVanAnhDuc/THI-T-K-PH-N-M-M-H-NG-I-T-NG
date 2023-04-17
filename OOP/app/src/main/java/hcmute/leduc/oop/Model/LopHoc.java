package hcmute.leduc.oop.Model;

import java.util.*;

/**
 * 
 */
public class LopHoc {
    private String MaLop;
    private String TenLop;
    private Date NgayBatDau;
    private Date NgayKetThuc;
    private String MSGV;
    public LopHoc() {
    }

    public LopHoc(String maLop, String tenLop, Date ngayBatDau, Date ngayKetThuc, String MSGV) {
        MaLop = maLop;
        TenLop = tenLop;
        NgayBatDau = ngayBatDau;
        NgayKetThuc = ngayKetThuc;
        this.MSGV = MSGV;
    }

    public String getMaLop() {
        return MaLop;
    }

    public void setMaLop(String maLop) {
        MaLop = maLop;
    }

    public String getTenLop() {
        return TenLop;
    }

    public void setTenLop(String tenLop) {
        TenLop = tenLop;
    }

    public Date getNgayBatDau() {
        return NgayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        NgayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return NgayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        NgayKetThuc = ngayKetThuc;
    }

    public String getMSGV() {
        return MSGV;
    }

    public void setMSGV(String MSGV) {
        this.MSGV = MSGV;
    }

    public void chinhSuaBuoiHoc(String IDBuoiHoc, int luaChon) {
        // TODO implement here
    }

    /**
     * 
     */
    public void layDanhSachBuoiHoc() {
        // TODO implement here
    }

}