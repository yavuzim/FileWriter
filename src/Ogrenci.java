public class Ogrenci {
    private String FnameSurname, cevap;
    private int Fvize, Ffinal, Fbutunleme;
    private double Fortalama;


    public String getnameSurname() {
        return FnameSurname;
    }

    public String setnameSurname(String nameSurname) {
        this.FnameSurname = nameSurname;
        return this.FnameSurname;
    }

    public int getvize() {
        return Fvize;
    }

    public int setvize(int vize) {
        if (vize < 0 || vize > 100)
            System.out.print("Vize Geçersiz Değer");
        else {
            this.Fvize = vize;
        }
        return this.Fvize;
    }

    public int getfinal() {
        return Ffinal;
    }

    public int setfinal(int _final) {
        if (_final < 0 || _final > 100)
            System.out.print("Final Geçersiz Değer");
        else {
            this.Ffinal = _final;
        }
        return this.Ffinal;
    }

    public int getbutunleme() {
        return Fbutunleme;
    }

    public int setbutunleme(int butunleme) {
        if (butunleme < 0 || butunleme > 100)
            System.out.print("Bütünleme Geçersiz Değer");
        else {
            this.Fbutunleme = butunleme;
        }
        return this.Fbutunleme;
    }

    public String getcevap() {
        return cevap;
    }

    public String setcevap(String cevap) {
        this.cevap = cevap;
        return this.cevap;
    }

    public double getOrtalama() {
        return Fortalama;
    }

    public double setOrtalama() {
        this.Fortalama = (Fvize * 40 / 100) + (Ffinal * 60 / 100);
        return Math.round(this.Fortalama);
    }

    public double setOrtalamaB() {
        this.Fortalama = (Fvize * 40 / 100) + (Fbutunleme * 60 / 100);
        return Math.round(this.Fortalama);
    }
}
