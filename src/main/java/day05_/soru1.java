package day05_;

public class soru1 {
    public static void main(String[] args) {

        // Çok boyutlu bir dizi oluşturuyoruz
        int[][] mdarray = {
                {3, 4},
                {1, 2},
                {8, 7}
        };



        // mdarray'i yazdırıyoruz
        System.out.println("Çok boyutlu dizi (mdarray):");


        for (int i = 0; i < mdarray.length; i++) {

            for (int j = 0; j < mdarray[i].length; j++) {

                System.out.print(mdarray[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("________________________________________");


        // Tüm iç dizilerin elemanlarının toplamını hesaplayarak tek boyutlu ve tek elemanlı bir dizi oluşturuyoruz
        int totalSum = 0;
        for (int i = 0; i < mdarray.length; i++) {
            for (int j = 0; j < mdarray[i].length; j++) {
                totalSum += mdarray[i][j];
            }
        }

         int[] singleElementArray = {totalSum};

        // Tek boyutlu ve tek elemanlı diziyi yazdırıyoruz
        System.out.println("Tek boyutlu ve tek elemanlı dizi (singleElementArray):");
        System.out.print(singleElementArray[0] + " ");














    }
}
