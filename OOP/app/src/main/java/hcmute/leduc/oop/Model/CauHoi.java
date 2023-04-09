package hcmute.leduc.oop.Model;

import java.util.*;

/**
 * 
 */
public class CauHoi {
    private String MaCauHoi;
    private String DapAn;
    private String MaBaiKiemTra;
    private String CauHoi;
    public CauHoi() {
    }

    public CauHoi(String maCauHoi, String dapAn, String maBaiKiemTra, String cauHoi) {
        MaCauHoi = maCauHoi;
        DapAn = dapAn;
        MaBaiKiemTra = maBaiKiemTra;
        CauHoi = cauHoi;
    }

    public String getMaCauHoi() {
        return MaCauHoi;
    }

    public void setMaCauHoi(String maCauHoi) {
        MaCauHoi = maCauHoi;
    }

    public String getDapAn() {
        return DapAn;
    }

    public void setDapAn(String dapAn) {
        DapAn = dapAn;
    }

    public String getMaBaiKiemTra() {
        return MaBaiKiemTra;
    }

    public void setMaBaiKiemTra(String maBaiKiemTra) {
        MaBaiKiemTra = maBaiKiemTra;
    }

    public String getCauHoi() {
        return CauHoi;
    }

    public void setCauHoi(String cauHoi) {
        CauHoi = cauHoi;
    }
}