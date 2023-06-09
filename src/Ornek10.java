import java.util.Scanner;

public class Ornek10 {
    public static void main(String[] args) {
        String kullaniciSifre="abc";
        Scanner scan= new Scanner(System.in);
        System.out.println("Sifrenizi Giriniz:");
        String sifre=scan.nextLine();


        if(kullaniciSifre.equals(sifre)){

            System.out.println("Sisteme Basariyla Giris Yaptiniz!");

        }
        else{
            System.out.println("Yeni Sifrenizi Giriniz:");
            String newSifre= scan.nextLine();
            if(kullaniciSifre.equals(newSifre)){
                System.out.println("Eski Sifrenizle Ayni Sifreyi Girdiniz Lütfen Tekrar Deneyin");
            }
            else{
                System.out.println("Sifrenizi Basariyla Degistiniz");
            }


        }

    }
}
