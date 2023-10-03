package homework55;

import java.util.Arrays;

public class Task2 {
    /*
    Задача 2
    Дан массив строк. Каждую строку из этого массива нужно преобразовать в массив байт (см. метод getBytes у строки).
    Получить двумерный массив byte[][] такой, где каждая строка -
    это массив байта, полученный преобразованием соответствующей String из данного массива строк.
    */

    private static String[] strArr = {"beautiful", "weather", "today"};

    public static String[] getStrArr() {
        return strArr;
    }

    public static void main(String[] args) {

        getByteArr(strArr);
    }

    public static byte[][] getByteArr(String[] arr) {
        byte[][] resArr = new byte[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            resArr[i] = arr[i].getBytes();
            System.out.println((Arrays.toString(resArr[i])));
        }
        return resArr;
    }


}
