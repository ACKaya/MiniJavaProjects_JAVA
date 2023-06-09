public class Ornek3 {
    public static void main(String[] args) {
       String name="kavak";
       int i=0;
       int j=name.length()-1;
       boolean isHas=true;
       while(i<j){
           if(name.charAt(i)!=name.charAt(j)){
               System.out.println("Palindromik Degildir");
               isHas=false;
               break;


           }
           i++;
           j--;


       }
       if(isHas){
       System.out.println("Tebrikler Palindromik Bir Deger Girdiniz!");}

       }
}
