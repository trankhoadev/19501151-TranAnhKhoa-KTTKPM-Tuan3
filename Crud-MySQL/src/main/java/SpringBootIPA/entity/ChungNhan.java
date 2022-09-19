package SpringBootIPA.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "CHUNGNHAN")
public class ChungNhan {

    @Id
    private String MaNV;

    @Id
    private Int MaMB;

    public String getMaMB() {
        return MaMB;
    }

    public void setMaMB(String MaMB) {
        this.MaMB = MaMB;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }
}