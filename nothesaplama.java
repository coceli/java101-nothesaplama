import java.util.Scanner;
import java.io.*;
public class nothesaplama {
    int matematik, fizik, tarih, turkce, muzik;
    Scanner girdi = new Scanner(System.in);
    System.out.print("Matematik Notunuz : ");
    matematik= girdi.nextInt();
    System.out.print("Fizik Notunuz : ");
    fizik= girdi.nextInt();
    System.out.print("Tarih Notunuz : ");
    tarih= girdi.nextInt();
    System.out.print("Türkçe Notunuz : ");
    turkce= girdi.nextInt();
    System.out.print("Müzik Notunuz : ");

    int toplam = (matematik+fizik+tarih+turkce+muzik);
    double ortalama = (toplam/5);
     boolean sonuc = (ortalama>=60);
     boolean sonuc2= (ortalama<60);
     String hesaplama = sonuc ? "GEÇTİNİZ." : "KALDINIZ.";
     System.out.print("DURUMUNUZ : " + hesaplama);




}
