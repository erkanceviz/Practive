package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class C02_Arrays {
    public static void main(String[] args) {


        /*
        3 elemanlı bir array olusturunuz (int)

                Arrayin elemanlarını sıra ile kullanıcıdan alınız, arrayi yazdırınız
        Arrayin elemanlarının ortalamasını bulunuz, ortalamayı yazdırınız
        Ortalamadan daha büyük olan array elemanlarını yazdırınız.

                */

       // int [] arr={1,2,2,5,6,8}; //[] dizi parantezi yani array yapısı oldugunu belli eder
        int[] arr=new int[3]; ////3 elemanli bir bos array olusturmus oluruz
        System.out.println(arr.length); // 6

        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Lütfen arrayin" +(i+1)+" elemani giriniz");
            arr[i]=scanner.nextInt();

        }
        // yerine yukaridakini yazariz

       /* System.out.println("Lütfen arrayin ilk elemani giriniz");
        arr[0]=scanner.nextInt();
        System.out.println("LÜtfen arrayin 2. eleman giriniz");
        arr[1]=scanner.nextInt();
        System.out.println("LÜtfen arrayin 3. eleman giriniz");
        arr[2]=scanner.nextInt(); */

        // arrayi yazdırınız

        System.out.println(Arrays.toString(arr));

        // ortalamayı yazdırınız

        double ortalama=0;

        for (int w :arr){
            ortalama=(ortalama+w);


        }
        System.out.println("Ortalama " + String.format("%.3f",(ortalama/3)));  // String.format("%.3f",(toplam%5)

        // Ortalamadan daha büyük olan array elemanlarını yazdırınız.




            for (int each:arr) {
                if (each>ortalama){
                    System.out.println(each);
                }
            }













    }
}
