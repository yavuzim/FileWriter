import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void DosyaOlustur(Object x) {
        File dosya = new File("sonuc.txt");
        PrintWriter yaz;
        try {
            if (!dosya.exists())
                dosya.createNewFile();
            Scanner oku = new Scanner(dosya);

            yaz = new PrintWriter(dosya);
            yaz.print(isim + " - " + vize + " - " + _final + " - " + x + " - " + ortalama);
            yaz.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }

    static String isim, cevap;
    static int vize, _final, butunleme;
    static double ortalama;

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Ogrenci ogrenci = new Ogrenci();
        System.out.print("Ad ve Soyad : ");
        isim = ogrenci.setnameSurname(read.nextLine());
        System.out.print("Vize : ");
        vize = ogrenci.setvize(read.nextInt());
        System.out.print("Final : ");
        _final = ogrenci.setfinal(read.nextInt());
        System.out.print("Bütünlemeye Girecek misin? : ");
        cevap = ogrenci.setcevap(read.next());
        if (cevap.equals("e")) {
            System.out.print("Bütünleme : ");
            ogrenci.setbutunleme(read.nextInt());
            ortalama = ogrenci.setOrtalamaB();
            DosyaOlustur(butunleme);
        } else {
            ortalama = ogrenci.setOrtalama();
            DosyaOlustur("GR");
        }
    }
}
