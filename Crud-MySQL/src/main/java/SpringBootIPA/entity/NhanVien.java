package SpringBootIPA.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "NHANVIEN")
public class NhanVien {

    @Id
    private String MaNV;

    @Column(name = "Ten", length = 50, nullable = false)
    private String ten;

    @Column(name = "Luong", length = 11, nullable = false)
    private int luong;

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getten() {
        return ten;
    }

    public void setten(String ten) {
        this.ten = ten;
    }

    public void setluong(Int luong) {
        this.luong = luong;
    }

    public String getluong() {
        return luong;
    }
}