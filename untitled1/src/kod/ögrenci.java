package kod;

public class ögrenci {
    String isim,soyisim,ogrenciNo,ödev1,odev2,vizeNot,finalNot;

    public ögrenci(String isim, String soyisim, String ogrenciNo, String ödev1, String odev2, String vizeNot, String finalNot) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.ogrenciNo = ogrenciNo;
        this.ödev1 = ödev1;
        this.odev2 = odev2;
        this.vizeNot = vizeNot;
        this.finalNot = finalNot;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public String getÖdev1() {
        return ödev1;
    }

    public void setÖdev1(String ödev1) {
        this.ödev1 = ödev1;
    }

    public String getOdev2() {
        return odev2;
    }

    public void setOdev2(String odev2) {
        this.odev2 = odev2;
    }

    public String getVizeNot() {
        return vizeNot;
    }

    public void setVizeNot(String vizeNot) {
        this.vizeNot = vizeNot;
    }

    public String getFinalNot() {
        return finalNot;
    }

    public void setFinalNot(String finalNot) {
        this.finalNot = finalNot;
    }
}
