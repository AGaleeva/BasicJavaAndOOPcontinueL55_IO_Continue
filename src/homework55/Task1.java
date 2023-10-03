package homework55;

import java.util.Arrays;

public class Task1 {
    /*
    Задача 1
    Создать двумерный массив 5x3 т.е. 5 строк 3 столбца. Заполнить его случайными числами.

    - Написать метод, который преобразует его в одномерный массив из 15 элементов,
      перенося числа по-порядку (слева направо и сверху вниз) из исходного.
    - Написать метод, который меняет все значения из первой строки, на соответствующие значения из 3 строки,
      а значения из третьей строки на значения из первой. Т.е. в итоге нужно поменять местами первую и
      третью строки исходного массива.
    */

    public static void main(String[] args) {

        int[][] twoDimArr = {{1, 5, 7}, {4, 3, 15}, {99, 0, 50}, {46, 8, 24}, {-46, -3, -19}};

        for (int i = 0; i < twoDimArr.length; i++) {
            for (int j = 0; j < twoDimArr[0].length; j++) {
                System.out.print(twoDimArr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------");

        System.out.println(Arrays.toString(twoDimArrToOneDim(twoDimArr)));


    }

    public static int[] twoDimArrToOneDim(int[][] arr) {
        int[] arrRes = new int[arr.length * arr[0].length];

        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int k = 0; k < arr[j].length; k++) {
                arrRes[i++] =  arr[j][k];
            }
        }
        return arrRes;
    }
}
