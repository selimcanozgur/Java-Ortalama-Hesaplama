import java.util.Scanner;
public class Main {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        int mat, fiz, kim, tur, tar, muz;

        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = scanner.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        fiz = scanner.nextInt();

        System.out.print("Kimya Notunuzu Giriniz: ");
        kim = scanner.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz: ");
        tur = scanner.nextInt();

        System.out.print("Tarih Notunuzu Giriniz: ");
        tar = scanner.nextInt();

        System.out.print("Müzik Notunuzu Giriniz: ");
        muz = scanner.nextInt();

        double notHesapla = (mat+fiz+kim+tur+tar+muz)/6;
        String sonuc = (notHesapla) > 60 ? "Geçtiniz" : "Kaldınız";

        System.out.print("Ortalamanız: " +notHesapla+ " "+ sonuc);
    }
}