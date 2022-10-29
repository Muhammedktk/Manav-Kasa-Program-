import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
       double Armut = 2.14,Elma=3.67,Domates=1.11,Muz=0.95,Patlican=5.00;
       double A,E,D,M,P,T;

        System.out.print("Armut kaç kilo?   ");
        A= inp.nextDouble();
        System.out.print("Elma Kaç Kilo ?   ");
        E= inp.nextDouble();
        System.out.print("Domates Kaç Kilo ?    ");
        D= inp.nextDouble();
        System.out.print("Muz Kaç Kilo ?    ");
        M= inp.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ?   ");
        P= inp.nextDouble();
        T=(A*2.14)+(E*3.67)+(D*1.11)+(M*0.95)+(P*5);
        System.out.print("Toplam Tutar :  "+T+ "TL");

    }
}
