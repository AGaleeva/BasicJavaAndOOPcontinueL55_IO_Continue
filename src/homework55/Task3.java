package homework55;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static homework55.Task2.getByteArr;
import static homework55.Task2.getStrArr;

public class Task3 {
    /*
    Задача 3
    Записать каждую строку двумерного массива byte[][] (например, из второй задачи) в отдельный файл.
    */

    public static void main(String[] args) throws IOException {

        byte[][] arr = getByteArr(getStrArr());
        writeToFile(arr);

    }

    public static void writeToFile(byte[][] arr) throws IOException {

        for (int i = 0; i < arr.length; i++) {
            try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("file" + i))) {
                bos.write(arr[i]);
            }
        }

    }
}
