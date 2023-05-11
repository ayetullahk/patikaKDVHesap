package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar,kdvliTutar,kdvOran=0.18,kdvTutar;
        Scanner input=new Scanner(System.in);
        System.out.print("Ürün fiyatını giriniz:  ");
        tutar= input.nextDouble();
        kdvTutar=tutar*kdvOran;
        kdvliTutar=tutar+kdvTutar;
        System.out.println("KDV'siz tutar:"+tutar);
        System.out.println("KDV oranı:"+kdvOran);
        System.out.println("KDV'li tutar:"+kdvliTutar);
        System.out.println("KDV tutarı:"+kdvTutar);
    }
}