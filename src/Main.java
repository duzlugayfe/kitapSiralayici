import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Kitap kitap1 = new Kitap("Altın Işık", "Ziya Gökalp", 63);
        Kitap kitap2 = new Kitap("Dede Korkut Masalları", "Dede Korkut", 111);
        Kitap kitap3 = new Kitap("Falaka ve Gecelerim", "Ahmet Rasim", 64);
        Kitap kitap4 = new Kitap("Keloğlan Masalları", "Derleme", 80);
        Kitap kitap5 = new Kitap("Türkçe Deyimler",  "Derleme", 95);

        Set<Kitap> kitaps = new TreeSet<>();
        kitaps.add(kitap1);
        kitaps.add(kitap3);
        kitaps.add(kitap4);
        kitaps.add(kitap2);
        kitaps.add(kitap5);

        System.out.println("->>>> Kitap Adına Göre Sıralama <<<<-\n");

        for (Kitap k : kitaps) {
            System.out.println(k.getKitapAdi() + "  <--->  " + k.getYazarAdi() + "  <--->  " + k.getSayfaSayisi());
        }

        Set<Kitap> kitapSet = new TreeSet<>(new Comparator<Kitap>() {

            @Override
            public int compare(Kitap k1, Kitap k2) {
                return k1.getSayfaSayisi() - k2.getSayfaSayisi();
            }

        }.reversed());

        kitapSet.addAll(kitaps);

        System.out.println("\n->>>> Sayfa  Sayısına Göre Sıralama <<<<-\n");

        for (Kitap k : kitapSet) {
            System.out.println(k.getKitapAdi() + "<--->" + k.getYazarAdi() + "<--->" + k.getSayfaSayisi());
        }

    }
}