import java.util.Scanner;

public class Ornek7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Matematik Notunuzu Giriniz:");
        int a= scan.nextInt();
        System.out.println("Fizik Notunuzu Giriniz:");
        int b= scan.nextInt();
        System.out.println("Kimya Notunuzu Giriniz:");
        int c= scan.nextInt();
        System.out.println("Turkce Notunuzu Giriniz:");
        int d= scan.nextInt();
        System.out.println("Tarih Notunuzu Giriniz:");
        int e= scan.nextInt();
        System.out.println("Muzik Notunuzu Giriniz:");
        int f= scan.nextInt();
        double ortalama=(a+b+c+d+e+f)/6;
        System.out.println("Ortalamaniz:"+ortalama);
        System.out.println(ortalama>60 ?"Sinifi Gecti":"Sinifta Kaldi");

    }

}
