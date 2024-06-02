package day05_;

import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {

    /*
        kullanıcı c tusuna basana kadar islem yapmaya devam eden bir hesap makinesi yapınız
         */
        Scanner input = new Scanner(System.in);
        char operator;
        do {
            System.out.println("lutfen islem yapmak icin +,-,*,/,%,^ islemlerinden birini seciniz siz c tusuna basana kadar calismaya devam edicek");
            operator = input.next().charAt(0);
            switch (operator) {
                case '+':
                    System.out.println("lutfen islem yapmak istediginiz sayilari giriniz");
                    System.out.println("Sayilarin toplami : " + (input.nextDouble() + input.nextDouble()));
                    break;
                case '-':
                    System.out.println("lutfen islem yapmak istediginiz sayilari giriniz");
                    System.out.println("Sayilarin farki : " + (input.nextDouble() - input.nextDouble()));
                    break;
                case '*':
                    System.out.println("lutfen islem yapmak istediginiz sayilari giriniz");
                    System.out.println("Sayilarin carpimi : " + (input.nextDouble() * input.nextDouble()));
                    break;
                case '/':
                    System.out.println("lutfen islem yapmakk istediginiz sayilari giriniz");
                    System.out.println("Sayilarin bolumu : " + (input.nextDouble() / input.nextDouble()));
                    //odev payda 0 olma durumunu kontrol altina
                    break;
                case '%':
                    System.out.println("lutfen islem yapmak istediginiz sayilari giriniz");
                    System.out.println("Sayilarin modu : " + (input.nextDouble() % input.nextDouble()));
                    //odev payda 0 olma durumunu kontrol altina
                    break;
                case '^':
                    System.out.println("lutfen islem yapmak istediginiz sayilari giriniz");
                    System.out.println("Sayilarin kuvveti : " + (Math.pow(input.nextDouble(), input.nextDouble())));
                    break;
                case 'c':
                    System.out.println("bizi tercih ettiginiz icin tesekkurler yine bekleriz <3");
                    break;
                default:
                    System.out.println("lutfen gecerli bir operator giriniz");
                    break;
            }


        } while (operator != 'c');
    }

}




