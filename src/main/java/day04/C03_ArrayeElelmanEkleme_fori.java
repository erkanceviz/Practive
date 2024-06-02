package day04;

import java.util.Arrays;

public class C03_ArrayeElelmanEkleme_fori {
    public static void main(String[] args) {

    /*
            verilen arraye istenen bir elemanı ekleyen bir kod yazınız.
            int [] arr = {1,4,7,11};
            eklenecek eleman = 5;
         */


        int[] arr={1,4,7,11};
        int [] newArr=new int[arr.length+1];
        System.out.println(Arrays.toString(arr)); // [1, 4, 7, 11]

        int[] yeniArr=new int[arr.length];
        System.out.println(Arrays.toString(newArr)); // [0, 0, 0, 0, 0]

        for (int i = 0; i < arr.length ; i++) {
            newArr[i]=arr[i];

        }
        yeniArr[yeniArr.length-1]=5;
        System.out.println(Arrays.toString(yeniArr));







    }
}
