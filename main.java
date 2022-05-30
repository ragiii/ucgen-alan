import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Degiskenlerin olusturulmasi
        int a,b,c;
        double u,alan;

        //Kullanicidan verilerin alinmasi
        Scanner input = new Scanner(System.in);
        System.out.println("1.Kenar uzunlugunu Giriniz : ");
        a=input.nextInt();
        System.out.print("2.kenar uzunluğunu giriniz :");
        b=input.nextInt();
        System.out.print("3.kenar uzunluğunu giriniz :");
        c=input.nextInt();

        u = (a+b+c) / 2;
        alan =Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Çevresi :"+u);
        System.out.println("Üçgenin Alanı :"+alan);


    }
        }
