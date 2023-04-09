package hcmute.leduc.oop.Model;

import java.util.*;

/**
 * 
 */
public class BuoiHoc {
    private String BaiGiang;
    private String DiemDanh;
    private String TaiLieu;
    public String MaBuoiHoc;
    public BuoiHoc() {
    }

    public BuoiHoc(String baiGiang, String diemDanh, String taiLieu, String maBuoiHoc) {
        BaiGiang = baiGiang;
        DiemDanh = diemDanh;
        TaiLieu = taiLieu;
        MaBuoiHoc = maBuoiHoc;
    }
    public String getBaiGiang() {
        return BaiGiang;
    }

    public void setBaiGiang(String baiGiang) {
        BaiGiang = baiGiang;
    }

    public String getDiemDanh() {
        return DiemDanh;
    }

    public void setDiemDanh(String diemDanh) {
        DiemDanh = diemDanh;
    }

    public String getTaiLieu() {
        return TaiLieu;
    }

    public void setTaiLieu(String taiLieu) {
        TaiLieu = taiLieu;
    }

    public String getMaBuoiHoc() {
        return MaBuoiHoc;
    }

    public void setMaBuoiHoc(String maBuoiHoc) {
        MaBuoiHoc = maBuoiHoc;
    }


    public void taoBaiGiang() {
        // TODO implement here
    }

    /**
     * @param IDBaiGiang
     */
    public void chinhSuaBaiGiang(String IDBaiGiang) {
        // TODO implement here
    }

    /**
     * @param IDBaiGiang
     */
    public void xoaBaiGiang(String IDBaiGiang) {
        // TODO implement here
    }

    /**
     * 
     */
    public void taoBaiKiemTra() {
        // TODO implement here
    }

}