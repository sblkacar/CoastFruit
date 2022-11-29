import java.util.Scanner;

public class FruitCoast {
    public static void main(String[] args) {
        double armut=2.14, elma=3.67, domates=1.11, patlıcan=5,sum;
        String  Armut="armut",Elma="Elma", Domates="Domates", Patlıcan="Patlıcan";
        int armuT,elmA,domateS,patlıcaN;
        Scanner input=new Scanner(System.in);
        System.out.println(Armut +"Kaç kilo");
        armuT=input.nextInt();
        System.out.println(Elma +"Kaç kilo");
        elmA=input.nextInt();
        System.out.println(Domates +"Kaç kilo");
        domateS=input.nextInt();
        System.out.println(Patlıcan +"Kaç kilo");
        patlıcaN=input.nextInt();
        sum=armuT*armut+patlıcaN*patlıcan+domateS*domates+elmA*elma;
        System.out.println("Ödemeniz gereken tutar :" +sum);



    }
}
