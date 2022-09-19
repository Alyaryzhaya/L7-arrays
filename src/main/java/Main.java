import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        // создаем интовый набор из 5 штук. Адрес этого набора записывается в переменную arr
        int[] arr = new int[5];    // в квадр.скобках может быть переменная
        System.out.println(Arrays.toString(arr));    // массив на печать [0, 0, 0, 0, 0]


        // заменить ячейку 3 (начинаем с 0) на 11
        arr[3] = 11;
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[3]); // выводим ячейку 3 на печать


        // массивы могут быть любого типа
        String[] ar = new String[5];
        System.out.println(Arrays.toString(ar));  // [null, null, null, null, null]
        System.out.println(ar[4]);  // вывод ячейки 4


        double[] arrr = new double[5];
        System.out.println(Arrays.toString(arrr));  // [0.0, 0.0, 0.0, 0.0, 0.0]

        boolean[] aarr = new boolean[5];
        System.out.println(Arrays.toString(aarr)); // [false, false, false, false, false]


        //создание массива с указанием конкретных данных
        int[] aar = {11, 23, 56, 55};  // [11, 23, 56, 55]
        System.out.println(Arrays.toString(aar));


    }


}
