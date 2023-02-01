import java.time.LocalDate;

public class Kitap implements Comparable<Kitap> {
    @Override
    public int compareTo(Kitap k) {
        return this.kitapAdi.compareTo(k.kitapAdi);
    }
    private String kitapAdi;
    private String yazarAdi;
    private int sayfaSayisi;

    public Kitap(String kitapAdi,String yazarAdi, int sayfaSayisi) {
        this.kitapAdi = kitapAdi;
        this.sayfaSayisi = sayfaSayisi;
        this.yazarAdi = yazarAdi;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }
    public void getKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }
    public String getYazarAdi() {
        return yazarAdi;
    }
    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }
    public int getSayfaSayisi() {
        return sayfaSayisi;
    }
    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }
}

