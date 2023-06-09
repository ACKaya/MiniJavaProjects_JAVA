import java.util.Arrays;

public class Ornek1 {
    public static void main(String[] args) {
       int []list={1,3,5,6,7};
       int []list2={2};
       int sayi=0;
       int []newList=new int[list.length+list2.length];
       for(int i=0;i< list.length;i++){
           newList[sayi++]=list[i];

       }
        for(int i=0;i< list2.length;i++){
            newList[sayi++]=list2[i];

        }
        Arrays.sort(newList);
        System.out.println(Arrays.toString(newList));
        if(newList.length%2==0){
            double sonuc=(newList[newList.length/2]+newList[(newList.length/2)-1])/2.0;
            System.out.println("Medyaniniz1:"+sonuc);
        }
        else{
            int sonuc2= newList.length/2;
            System.out.println("Medyaniniz:"+newList[sonuc2]);
        }

    }

}
