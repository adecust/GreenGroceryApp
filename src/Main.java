
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double Armut=2.14;
        double elma=3.67;
        double Domates=1.11;
        double muz=0.95;
        double patlıcan=5.00;
        double total = 0;
        double temp;
        double sayi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Armut kaç kilo ? :");
        sayi=sc.nextDouble();
        temp=sayi*Armut;
        total+=temp;
        System.out.println("Elma kaç kilo ? :");

        sayi=sc.nextDouble();
        temp=sayi*elma;
        total+=temp;
        System.out.println("Domates kaç kilo ? :");

        sayi=sc.nextDouble();
        temp=sayi*Domates;
        total+=temp;
        System.out.println("muz kaç kilo ? :");

        sayi=sc.nextDouble();
        temp=sayi*muz;
        total+=temp;
        System.out.println("patlıcan kaç kilo ? :");

        sayi=sc.nextDouble();
        temp=sayi*patlıcan;
        total+=temp;

        System.out.println(" Tutar  :  "+ total);

    }
}