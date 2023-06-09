import java.util.Scanner;

public class Ornek6 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Basamak Sayisini Giriniz:");
        int basamak= scan.nextInt();
        for(int i=0;i<basamak;i++){
            for(int j=basamak;;j--){
                System.out.print(" ");
            }

        }

    }
}
