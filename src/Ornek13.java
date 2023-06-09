import java.util.Scanner;

public class Ornek13 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Yasinizi Giriniz:");
        int yas= scan.nextInt();
        System.out.println("Mesafeyi Giriniz:");
        double mesafe= scan.nextDouble();
        System.out.println("Yolculuk Tipini Giriniz:/n 1-Tek Yon/n 2-Gidis Donus");
        int tip= scan.nextInt();
        double perKm=0.10;
        double toplamFiyat=mesafe*perKm;
        if((tip<=0||tip>2)||(mesafe<0)||(yas<=0)){
            System.out.println("Hatali Bir Giris Yaptiniz");
        }
        if(yas<12){
            toplamFiyat=toplamFiyat-toplamFiyat*0.5;
            if(tip==2){
                toplamFiyat=(toplamFiyat-toplamFiyat*0.20)*2;


            }

        }
        else if(12<yas&&yas<24){
            toplamFiyat=toplamFiyat-toplamFiyat*0.10;
            if(tip==2){
                toplamFiyat=(toplamFiyat-toplamFiyat*0.20)*2;


            }

        }
        else if(yas>65){
            toplamFiyat=toplamFiyat-toplamFiyat*0.30;
            if(tip==2){
                toplamFiyat=(toplamFiyat-toplamFiyat*0.20)*2;


            }


        }
        System.out.println("Toplam Odemeniz Gereken Tutar:"+toplamFiyat);

    }
}
