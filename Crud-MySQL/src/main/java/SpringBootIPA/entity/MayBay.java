package SpringBootIPA.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "MAYBAY")
public class MayBay {

    @Id
    private String MaMB;

    @Column(name = "Loai", length = 50, nullable = false)
    private String loai;

    @Column(name = "TamBay", length = 11, nullable = false)
    private int tamBay;

    public String getMaMB() {
        return MaMB;
    }

    public void setMaMB(String MaMB) {
        this.MaMB = MaMB;
    }

    public String getloai() {
        return loai;
    }

    public void setloai(String loai) {
        this.loai = loai;
    }

    public void settamBay(Int tamBay) {
        this.tamBay = tamBay;
    }

    public String gettamBay() {
        return tamBay;
    }
}