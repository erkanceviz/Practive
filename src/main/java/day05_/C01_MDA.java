package day05_;

import java.util.Arrays;

public class C01_MDA {
    public static void main(String[] args) {


        /*
             mdarray oluşturun yazdırın
             daha sonra bu mda ' yi, her bir elemanı iç array elemanlarının toplamına eşit olan tek boyutlu
             bir array haline getirin
             ör --> int [] [] arr={{3,4},{1,2},{8,7}} --------> {7,3,15}

        */

        int[][] arr={{3,4},{1,2},{8,7}};
        System.out.println(Arrays.deepToString(arr)); // [[3, 4], [1, 2], [8, 7]]

        int[] yeniArr=new int [arr.length];
        System.out.println(Arrays.toString(yeniArr)); // [0, 0, 0]


        int toplam=0;
        int idx=0;
                            // [[3, 4], [1, 2], [8, 7]]
        for (int[] each: arr){


            for (int each2: each){


            toplam=toplam+each2;


            }

            yeniArr[idx]=toplam;
            idx++;
            toplam=0;

        }

        System.out.println(Arrays.toString(yeniArr));


    }
}
