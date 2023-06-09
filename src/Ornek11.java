import java.util.Scanner;

public class Ornek11 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("1.Sayiyi Giriniz:");
        int a = scan.nextInt();
        System.out.println("2.Sayiyi Giriniz:");
        int b = scan.nextInt();
        System.out.println("3.Sayiyi Giriniz:");
        int c = scan.nextInt();
        int [] sayilar=new int[]{a,b,c};
        int max=0;
        for(int i=0;i< sayilar.length;i++){
            if(sayilar[i]>max){
                max=sayilar[i];
            }


        }
        System.out.println("Maksimum Sayi:"+max);

    }

}