import java.util.Scanner;

public class Ornek12 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Kacinci Ayda Dogdunuz:");
        int ay= scan.nextInt();
        System.out.println("Kacinci Gün Dogdunuz:");
        int gun= scan.nextInt();
        if((1<=ay&&22<=gun&&gun<=30)||(ay<=2&&gun<=19&&0<gun)){
            System.out.println("Kova Burcusunuz");
        }
    }
}
