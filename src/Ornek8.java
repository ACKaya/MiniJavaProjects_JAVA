import java.util.Scanner;

public class Ornek8 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Paranizi Giriniz:");
        int para= scan.nextInt();
        double kdvOrani=0.18;
        double kdvli=para+(para*kdvOrani);

        System.out.println("KDV'siz Tutar:"+para);
        System.out.println("KDV'li Tutar:"+kdvli);
        System.out.println("KDV Tutari:"+ (kdvli-para));

    }
}
