package hcmute.leduc.oop.Model;

import java.util.*;

/**
 * 
 */
public class KetQuaKiemTra {
    private String MSHV;
    private String MaBaiKiemTra;
    private int Diem;
    public KetQuaKiemTra() {
    }

    public KetQuaKiemTra(String MSHV, String maBaiKiemTra, int diem) {
        this.MSHV = MSHV;
        MaBaiKiemTra = maBaiKiemTra;
        Diem = diem;
    }

    public String getMSHV() {
        return MSHV;
    }

    public void setMSHV(String MSHV) {
        this.MSHV = MSHV;
    }

    public String getMaBaiKiemTra() {
        return MaBaiKiemTra;
    }

    public void setMaBaiKiemTra(String maBaiKiemTra) {
        MaBaiKiemTra = maBaiKiemTra;
    }

    public int getDiem() {
        return Diem;
    }

    public void setDiem(int diem) {
        Diem = diem;
    }
}