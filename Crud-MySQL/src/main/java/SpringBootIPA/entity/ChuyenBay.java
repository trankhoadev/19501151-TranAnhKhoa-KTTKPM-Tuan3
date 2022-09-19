package SpringBootIPA.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "CHUYENBAY")
public class ChuyenBay {

    @Id
    private String MaCB;

    @Column(name = "GaDi", length = 50, nullable = false)
    private String gaDi;

    @Column(name = "GaDen", length = 50, nullable = false)
    private String gaDen;

    @Column(name = "DoDai", length = 11, nullable = false)
    private int doDai;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "GioDi", nullable = false)
    private Date gioDi;

    @Temporal(TemporalType.DATE)
    @Column(name = "GioDen", nullable = false)
    private Date gioDen;

    @Column(name = "ChiPhi", length = 11, nullable = false)
    private int chiPhi;

    public String getMaCB() {
        return MaCB;
    }

    public void setMaCB(String MaCB) {
        this.MaCB = MaCB;
    }

    public String getgaDi() {
        return gaDi;
    }

    public void setgaDi(String gaDi) {
        this.gaDi = gaDi;
    }

    public String getgaDen() {
        return gaDen;
    }

    public void setgaDen(String gaDen) {
        this.gaDen = gaDen;
    }

    public void setdoDai(Int doDai) {
        this.doDai = doDai;
    }

    public String getdoDai() {
        return doDai;
    }

    public Date getgioDi() {
        return gioDi;
    }

    public void setgioDi(Date gioDi) {
        this.gioDi = gioDi;
    }

    public Date getgioDen() {
        return gioDen;
    }

    public void setgioDi(Date gioDen) {
        this.gioDen = gioDen;
    }

    public String getchiPhi() {
        return chiPhi;
    }

    public void setchiPhi(String chiPhi) {
        this.chiPhi = chiPhi;
    }
}