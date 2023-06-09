import java.util.Scanner;

public class Ornek9 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Kac Km Gittiniz:");
        double km= scan.nextDouble();
        double kmBasiUcret=2.20;
        int acilis=10;
        double tutar=acilis+km*kmBasiUcret;
        if(tutar<20){
            System.out.println("Odemeniz Gewreken Ucret:20TL");
        }
        else{
            System.out.println("Odemeniz Gereken Ucret:"+tutar);
        }


    }
}
